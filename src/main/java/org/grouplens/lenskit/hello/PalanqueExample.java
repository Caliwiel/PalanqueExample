package org.grouplens.lenskit.hello;

import org.grouplens.lenskit.data.text.Formats;
import org.grouplens.lenskit.data.text.TextEventDAO;
import org.grouplens.lenskit.scored.ScoredId;
import org.lenskit.LenskitConfiguration;
import org.lenskit.LenskitRecommender;
import org.lenskit.LenskitRecommenderEngine;
import org.lenskit.api.ItemRecommender;
import org.lenskit.api.Result;
import org.lenskit.api.ResultList;
import org.lenskit.config.ConfigHelpers;
import org.lenskit.data.dao.EventDAO;
import org.lenskit.data.dao.ItemNameDAO;
import org.lenskit.data.dao.MapItemNameDAO;
import sun.security.krb5.Config;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Responsable on 25/04/2016.
 * Demonstration app for LensKit. This application builds an item-item CF model
 * from a CSV file, then generates recommendations for a user.
 * <p/>
 * Usage: java org.grouplens.lenskit.hello.HelloLenskit ratings.csv user
 */
public class PalanqueExample implements Runnable {
    public static void main(String[] args) {
        PalanqueExample hello = new PalanqueExample(args);
        try {
            System.out.println("début");
            hello.run();
        } catch (RuntimeException e) {
            System.err.println(e.toString());
            e.printStackTrace(System.err);
            System.exit(1);
        }
    }

    private String delimiter = "\t";
    private File inputFile = new File("data/langage/ratings.csv");
    private File movieFile = new File("data/langage/langages.csv");
    private String algo;
    private List<Long> users;

    public PalanqueExample(String[] args) {
        users = new ArrayList<Long>(args.length);
        algo = args[0];
        for (String arg : args) {
            if(!arg.equals(algo))
                users.add(Long.parseLong(arg));
        }
    }

    public void run() {
        // We first need to configure the data access.
        // We will use a simple delimited file; you can use something else like
        // a database (see JDBCRatingDAO).
        EventDAO dao = TextEventDAO.create(inputFile, Formats.movieLensLatest());
        ItemNameDAO names;
        try {
            names = MapItemNameDAO.fromCSVFile(movieFile, 1);
        } catch (IOException e) {
            throw new RuntimeException("cannot load names", e);
        }

        // Next: load the LensKit algorithm configuration
        LenskitConfiguration config = null;
        try {
            if (algo.equals("item")) {
                config = ConfigHelpers.load(new File("etc/item-item-collaborative.groovy"));
            } else if (algo.equals("user")) {
                config = ConfigHelpers.load(new File("etc/user-user-collaborative.groovy"));
            } else if (algo.equals("matrix")) {
                config = ConfigHelpers.load(new File("etc/matrix-factorization.groovy"));
            } else if (algo.equals("slope")) {
                config = ConfigHelpers.load(new File("etc/slope-one.groovy"));
            } else {
                config = ConfigHelpers.load(new File("etc/item-item.groovy"));
            }
        } catch (IOException e) {
            throw new RuntimeException("could not load configuration", e);
        }
        // Add our data component to the configuration
        config.addComponent(dao);


        // There are more parameters, roles, and components that can be set. See the
        // JavaDoc for each recommender algorithm for more information.

        // Now that we have a configuration, build a recommender engine from the configuration
        // and data source. This will compute the similarity matrix and return a recommender
        // engine that uses it.
        LenskitRecommenderEngine engine = LenskitRecommenderEngine.build(config);

        // Finally, get the recommender and use it.
        try (LenskitRecommender rec = engine.createRecommender()) {
            // we want to recommend items
            ItemRecommender irec = rec.getItemRecommender();
            assert irec != null; // not null because we configured one
            // for users
            System.out.println("Nb users : "+ users.size());
            for (long user : users) {
                // get 10 recommendation for the user
                ResultList recs = irec.recommendWithDetails(user, 10, null, null);
                System.out.format("Recommendations for user %d:\n", user);
                for (Result item : recs) {
                    String name = names.getItemName(item.getId());
                    System.out.format("\t%d (%s): %.2f\n", item.getId(), name, item.getScore());
                }
            }
        }
    }
}