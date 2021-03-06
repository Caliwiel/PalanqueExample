/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.grouplens.lenskit.ihm;

import org.grouplens.lenskit.hello.Example;

import java.awt.BorderLayout;
import javax.swing.JComboBox;

/**
 *
 * @author Julien
 */
public class Ihm extends javax.swing.JFrame {

    /**
     * Creates new form Ihm
     */
    public Ihm() {
        initComponents();
        getContentPane().add(pUser, BorderLayout.SOUTH);
        this.setTitle("LenskitExample");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pUser = new javax.swing.JPanel();
        lNbUser = new javax.swing.JLabel();
        cbNumUser = cbNumUser = new JComboBox<String>();
        ;
        panelBoutons = new javax.swing.JPanel();
        pUserUser = new javax.swing.JPanel();
        bUserUser = new javax.swing.JButton();
        pItemItem = new javax.swing.JPanel();
        bItemItem = new javax.swing.JButton();
        pMatrixFactorisation = new javax.swing.JPanel();
        bMatrixFactorisation = new javax.swing.JButton();
        pSlopeOne = new javax.swing.JPanel();
        bSlopeOne = new javax.swing.JButton();

        lNbUser.setText("Numéro d'utilisateur : ");
        pUser.add(lNbUser);

        cbNumUser.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "1", "2", "3", "4", "5" }));
        pUser.add(cbNumUser);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(433, 339));

        panelBoutons.setLayout(new java.awt.GridLayout(4, 1));

        bUserUser.setText("User User Collaborative Filtering");
        bUserUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bUserUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pUserUserLayout = new javax.swing.GroupLayout(pUserUser);
        pUserUser.setLayout(pUserUserLayout);
        pUserUserLayout.setHorizontalGroup(
                pUserUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUserUserLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bUserUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        pUserUserLayout.setVerticalGroup(
                pUserUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUserUserLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bUserUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        panelBoutons.add(pUserUser);

        bItemItem.setText("Item Item Collaborative Filtering");
        bItemItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bItemItemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pItemItemLayout = new javax.swing.GroupLayout(pItemItem);
        pItemItem.setLayout(pItemItemLayout);
        pItemItemLayout.setHorizontalGroup(
                pItemItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pItemItemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bItemItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        pItemItemLayout.setVerticalGroup(
                pItemItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pItemItemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bItemItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        panelBoutons.add(pItemItem);

        bMatrixFactorisation.setText("Matrix Factorisation");
        bMatrixFactorisation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMatrixFactorisationMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pMatrixFactorisationLayout = new javax.swing.GroupLayout(pMatrixFactorisation);
        pMatrixFactorisation.setLayout(pMatrixFactorisationLayout);
        pMatrixFactorisationLayout.setHorizontalGroup(
                pMatrixFactorisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pMatrixFactorisationLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bMatrixFactorisation, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addContainerGap())
        );
        pMatrixFactorisationLayout.setVerticalGroup(
                pMatrixFactorisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMatrixFactorisationLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bMatrixFactorisation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        panelBoutons.add(pMatrixFactorisation);

        bSlopeOne.setText("Slope-One");
        bSlopeOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSlopeOneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pSlopeOneLayout = new javax.swing.GroupLayout(pSlopeOne);
        pSlopeOne.setLayout(pSlopeOneLayout);
        pSlopeOneLayout.setHorizontalGroup(
                pSlopeOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pSlopeOneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bSlopeOne, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addContainerGap())
        );
        pSlopeOneLayout.setVerticalGroup(
                pSlopeOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSlopeOneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bSlopeOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        panelBoutons.add(pSlopeOne);

        getContentPane().add(panelBoutons, java.awt.BorderLayout.CENTER);

        pack();
    }

    private String[] getSelectedParameters(String algo) {
        String num = cbNumUser.getSelectedItem().toString();
        System.out.println(num);
        String[] args = new String[2];
        args[0] = algo;
        args[1] = num;
        return args;
    }

    private void bUserUserMouseClicked(java.awt.event.MouseEvent evt) {
        Example ex = new Example(getSelectedParameters("user"));
        ex.run();
    }

    private void bItemItemMouseClicked(java.awt.event.MouseEvent evt) {
        Example ex = new Example(getSelectedParameters("item"));
        ex.run();
    }

    private void bMatrixFactorisationMouseClicked(java.awt.event.MouseEvent evt) {
        Example ex = new Example(getSelectedParameters("matrix"));
        ex.run();
    }

    private void bSlopeOneMouseClicked(java.awt.event.MouseEvent evt) {
        Example ex = new Example(getSelectedParameters("slope"));
        ex.run();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ihm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ihm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ihm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ihm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ihm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bItemItem;
    private javax.swing.JButton bMatrixFactorisation;
    private javax.swing.JButton bSlopeOne;
    private javax.swing.JButton bUserUser;
    private javax.swing.JComboBox<String> cbNumUser;
    private javax.swing.JLabel lNbUser;
    private javax.swing.JPanel pItemItem;
    private javax.swing.JPanel pMatrixFactorisation;
    private javax.swing.JPanel pSlopeOne;
    private javax.swing.JPanel pUser;
    private javax.swing.JPanel pUserUser;
    private javax.swing.JPanel panelBoutons;
    // End of variables declaration//GEN-END:variables
}
