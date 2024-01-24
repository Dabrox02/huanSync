/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.u2team.huansync.view.activityView;

import com.u2team.huansync.view.MenuView;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author NICOLAS RUIZ
 */
public class ActivityView extends javax.swing.JFrame {

    /**
     * Creates new form Activity
     */
    public ActivityView() {
        initComponents();
    }

    private boolean validateFields() {
        if (txtName.getText().trim().isEmpty() || txtType.getText().trim().isEmpty() || txtCategory.getText().trim().isEmpty()
                || txtStartTime.getText().trim().isEmpty() || txtNParticipants.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You must complete all fields", "Validation error", JOptionPane.ERROR_MESSAGE);
        return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tittleActivities = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblActivities = new javax.swing.JTable();
        btnUpdaActivity = new javax.swing.JButton();
        btnDelActivity = new javax.swing.JButton();
        btnCreateActivity = new javax.swing.JButton();
        btnBackActivities = new javax.swing.JButton();
        btnViewCosplay = new javax.swing.JButton();
        btnViewTrivia = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        txtStartTime = new javax.swing.JTextField();
        txtNParticipants = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(650, 430));

        tittleActivities.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tittleActivities.setText("ACTIVITIES");

        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);

        tblActivities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Category", "Start Time", "N° Participants"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblActivities);

        btnUpdaActivity.setText("Update");
        btnUpdaActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdaActivityActionPerformed(evt);
            }
        });

        btnDelActivity.setText("Delete");
        btnDelActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActivityActionPerformed(evt);
            }
        });

        btnCreateActivity.setText("Create");
        btnCreateActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActivityActionPerformed(evt);
            }
        });

        btnBackActivities.setText("Back");
        btnBackActivities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActivitiesActionPerformed(evt);
            }
        });

        btnViewCosplay.setText("View Cosplay");
        btnViewCosplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCosplayActionPerformed(evt);
            }
        });

        btnViewTrivia.setText("View Trivia");
        btnViewTrivia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTriviaActionPerformed(evt);
            }
        });

        txtName.setText("Name");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtType.setText("Type");

        txtCategory.setText("Category");
        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });

        txtStartTime.setText("Start Time");

        txtNParticipants.setText("N° Participants");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackActivities))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(tittleActivities, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCreateActivity)
                                .addGap(29, 29, 29)
                                .addComponent(btnDelActivity)
                                .addGap(22, 22, 22)
                                .addComponent(btnUpdaActivity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNParticipants, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnViewTrivia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewCosplay))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(tittleActivities)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNParticipants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateActivity)
                            .addComponent(btnDelActivity)
                            .addComponent(btnViewTrivia)
                            .addComponent(btnViewCosplay)
                            .addComponent(btnUpdaActivity)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnBackActivities)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdaActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdaActivityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdaActivityActionPerformed

    private void btnDelActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActivityActionPerformed
        AlertDelete alertDelete = new AlertDelete();
        alertDelete.setVisible(true);
        alertDelete.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnDelActivityActionPerformed

    private void btnViewTriviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTriviaActionPerformed
        TriviaList viewTrivia = new TriviaList();
        viewTrivia.setVisible(true);
        viewTrivia.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewTriviaActionPerformed

    private void btnBackActivitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActivitiesActionPerformed
         MenuView menu = new MenuView();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActivitiesActionPerformed

    private void btnViewCosplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCosplayActionPerformed
        Cosplay cosplayview = new Cosplay();
        cosplayview.setVisible(true);
        cosplayview.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnViewCosplayActionPerformed

    private void btnCreateActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActivityActionPerformed
        if (validateFields()) {
            Successful successful = new Successful();
            successful.setVisible(true);
            successful.setLocationRelativeTo(null);
        }
//        CreateActivity createActi = new CreateActivity();
//        createActi.setVisible(true);
//        createActi.setLocationRelativeTo(null);
//        this.setVisible(false);
    }//GEN-LAST:event_btnCreateActivityActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryActionPerformed

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
            java.util.logging.Logger.getLogger(ActivityView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActivityView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActivityView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActivityView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ActivityView activity = new ActivityView();
                activity.setVisible(true);
                activity.setLocationRelativeTo(null);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackActivities;
    private javax.swing.JButton btnCreateActivity;
    private javax.swing.JButton btnDelActivity;
    private javax.swing.JButton btnUpdaActivity;
    private javax.swing.JButton btnViewCosplay;
    private javax.swing.JButton btnViewTrivia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblActivities;
    private javax.swing.JLabel tittleActivities;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtNParticipants;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStartTime;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
