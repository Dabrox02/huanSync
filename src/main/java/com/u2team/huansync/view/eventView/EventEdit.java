/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.u2team.huansync.view.eventView;

import com.u2team.huansync.event.controller.EventController;
import com.u2team.huansync.event.model.classes.Event;
import com.u2team.huansync.event.model.classes.builders.EventBuilder;
import com.u2team.huansync.event.model.classes.builders.EventConcreteBuilder;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ANGIE DURAN
 */
public class EventEdit extends javax.swing.JFrame {

    /**
     * Creates new form EventEdit
     */
    int idEvento;

    public EventEdit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        txtEventDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEventTime = new javax.swing.JTextField();
        txtEventRestaurant = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEventStore = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEventPerson = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEventAddress = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEventCountry = new javax.swing.JTextField();
        txtEvent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        selectEventAgeClass = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        selectEventOrganizer = new javax.swing.JComboBox<>();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 148, 50));

        updateButton.setBackground(new java.awt.Color(31, 69, 106));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Save");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        txtEventDate.setBackground(new java.awt.Color(255, 195, 114));
        txtEventDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEventDate.setForeground(new java.awt.Color(51, 51, 51));
        txtEventDate.setText("yyyy-mm-dd");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Date");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Time");

        txtEventTime.setBackground(new java.awt.Color(255, 195, 114));
        txtEventTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEventTime.setForeground(new java.awt.Color(51, 51, 51));
        txtEventTime.setText("00:00:00");

        txtEventRestaurant.setBackground(new java.awt.Color(255, 195, 114));
        txtEventRestaurant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEventRestaurant.setForeground(new java.awt.Color(51, 51, 51));
        txtEventRestaurant.setText("Restaurant");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("N°Restaurant");

        txtEventStore.setBackground(new java.awt.Color(255, 195, 114));
        txtEventStore.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEventStore.setForeground(new java.awt.Color(51, 51, 51));
        txtEventStore.setText("Store");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("N°Store");

        txtEventPerson.setBackground(new java.awt.Color(255, 195, 114));
        txtEventPerson.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEventPerson.setForeground(new java.awt.Color(51, 51, 51));
        txtEventPerson.setText("Person");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("N°Person");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Address:");

        txtEventAddress.setBackground(new java.awt.Color(255, 195, 114));
        txtEventAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEventAddress.setForeground(new java.awt.Color(51, 51, 51));
        txtEventAddress.setText("Address");

        txtCity.setBackground(new java.awt.Color(255, 195, 114));
        txtCity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCity.setForeground(new java.awt.Color(51, 51, 51));
        txtCity.setText("City");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("City:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Country");

        txtEventCountry.setBackground(new java.awt.Color(255, 195, 114));
        txtEventCountry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEventCountry.setForeground(new java.awt.Color(51, 51, 51));
        txtEventCountry.setText("Country");

        txtEvent.setBackground(new java.awt.Color(255, 195, 114));
        txtEvent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEvent.setForeground(new java.awt.Color(51, 51, 51));
        txtEvent.setText("Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name:");

        jButton1.setBackground(new java.awt.Color(31, 69, 106));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Edit Event");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Classification:");

        selectEventAgeClass.setBackground(new java.awt.Color(255, 195, 114));
        selectEventAgeClass.setForeground(new java.awt.Color(0, 0, 0));
        selectEventAgeClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FAMILY", "YOUNGER", "ADULT" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Organizer:");

        selectEventOrganizer.setBackground(new java.awt.Color(255, 195, 114));
        selectEventOrganizer.setForeground(new java.awt.Color(0, 0, 0));
        selectEventOrganizer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtEventCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(204, 204, 204))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtEventDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)
                                                .addComponent(jButton1))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtEventTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtEventStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(txtEventPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEventRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(selectEventOrganizer, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(selectEventAgeClass, javax.swing.GroupLayout.Alignment.LEADING, 0, 128, Short.MAX_VALUE))
                                    .addComponent(txtEventAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtEventCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEventAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEventPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEventStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEventRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEventDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtEventTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectEventAgeClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(selectEventOrganizer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (txtEvent.getText().trim().isEmpty() || txtCity.getText().trim().isEmpty() || txtEventCountry.getText().trim().isEmpty()
                || txtEventAddress.getText().trim().isEmpty() || txtEventPerson.getText().trim().isEmpty()
                || txtEventStore.getText().trim().isEmpty() || txtEventRestaurant.getText().trim().isEmpty()
                || txtEventDate.getText().trim().isEmpty() || txtEventTime.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please, you must complete all fields.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {

                String nameEvent = txtEvent.getText();
                String cityEvent = txtCity.getText();
                String countryEvent = txtEventCountry.getText();
                String addressEvent = txtEventAddress.getText();
                int maxPeople = Integer.parseInt(txtEventPerson.getText());
                int maxStore = Integer.parseInt(txtEventStore.getText());
                int maxRestaurant = Integer.parseInt(txtEventRestaurant.getText());
                // long organizerId = Long.parseLong("1");
                LocalDate dateEvent = LocalDate.parse(txtEventDate.getText());
                LocalTime timeEvent = LocalTime.parse(txtEventTime.getText());
                String ageClassification = selectEventAgeClass.getSelectedItem().toString();
                long organizer = Long.parseLong((String) selectEventOrganizer.getSelectedItem());

                EventBuilder eventBuild = new EventConcreteBuilder();
                System.out.println(idEvento);
                Event event = eventBuild.eventId(idEvento).nameEvent(nameEvent)
                        .country(countryEvent).city(cityEvent).address(addressEvent)
                        .peopleCapacity(maxPeople)
                        .storeCapacity(maxStore)
                        .restaurantCapacity(maxRestaurant)
                        .dateEvent(dateEvent)
                        .timeEvent(timeEvent)
                        .organizerId(organizer)
                        .ageClassificationEnum(ageClassification)
                        .statusEnum("ACTIVE").build();
                idEvento = 0;
                // Llama al método del controlador para actualizar el evento en la base de datos
                EventController.updateEvent(event);

                JOptionPane.showMessageDialog(this, "Event updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Restablecer campos después de la actualización exitosa
                txtEvent.setText("");
                txtCity.setText("");
                txtEventAddress.setText("");
                txtEventCountry.setText("");
                txtEventDate.setText("");
                txtEventPerson.setText("");
                txtEventRestaurant.setText("");
                txtEventStore.setText("");
                txtEventTime.setText("");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid numeric input.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Invalid date or time format.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ShowEventView show = new ShowEventView();
        show.setVisible(true);
        show.setLocationRelativeTo(null);
        this.dispose();;
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EventEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EventEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EventEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EventEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EventEdit().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> selectEventAgeClass;
    private javax.swing.JComboBox<String> selectEventOrganizer;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEvent;
    private javax.swing.JTextField txtEventAddress;
    private javax.swing.JTextField txtEventCountry;
    private javax.swing.JTextField txtEventDate;
    private javax.swing.JTextField txtEventPerson;
    private javax.swing.JTextField txtEventRestaurant;
    private javax.swing.JTextField txtEventStore;
    private javax.swing.JTextField txtEventTime;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    void initData(int eventId) {

        idEvento = eventId;
        EventController eventController = new EventController();
        Event eventData = eventController.getByIdEvent(eventId);
        System.out.println(eventData);
        if (eventData != null) {

            txtEvent.setText(eventData.getNameEvent());
            txtCity.setText(eventData.getCity());
            txtEventCountry.setText(eventData.getCountry());
            txtEventAddress.setText(eventData.getAddress());
            txtEventPerson.setText(String.valueOf(eventData.getPeopleCapacity()));
            txtEventStore.setText(String.valueOf(eventData.getStoreCapacity()));
            txtEventRestaurant.setText(String.valueOf(eventData.getRestaurantCapacity()));
            txtEventDate.setText(eventData.getDateEvent().toString());
            txtEventTime.setText(eventData.getTimeEvent().toString());
            selectEventAgeClass.setSelectedItem(eventData.getAgeClassification());
            selectEventOrganizer.setSelectedItem(eventData.getOrganizerId());
        } else {
            JOptionPane.showMessageDialog(this, "Event not found.", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
    }
}
