/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonProfile;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author pranavpatel
 */
public class PersonListJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    PersonDirectory personDirectory;

    /**
     * Creates new form PersonListJPanel
     */
    public PersonListJPanel(JPanel container , PersonDirectory directory) {
        initComponents();
        initComponents();
        userProcessContainer = container;
        personDirectory=directory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonList = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnDeletePerson = new javax.swing.JButton();
        txtSearchBox = new javax.swing.JTextField();
        lblManageAccount = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        tblPersonList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FName", "LName", "SSN", "Age", "Home Address", "Home Phone", "Work Address", "Work Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersonList);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnViewDetails.setText("ViewDetails");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnDeletePerson.setText("Delete Account");
        btnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePersonActionPerformed(evt);
            }
        });

        txtSearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBoxActionPerformed(evt);
            }
        });

        lblManageAccount.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblManageAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageAccount.setText("Person List");

        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblManageAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletePerson)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnViewDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManageAccount)
                    .addComponent(btnBack))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletePerson)
                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (!txtSearchBox.getText().isBlank()){
            String FName = txtSearchBox.getText();
            Person foundPerson  = personDirectory.searchPerson(FName);

            if(foundPerson != null){

                ViewPersonJPanel panel = new ViewPersonJPanel(userProcessContainer, personDirectory, foundPerson);
                userProcessContainer.add("ViewPersonJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);

            } else {
                JOptionPane.showMessageDialog(null, "Account not found, Please check the First Name and try again ", "warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "please type First Name to view", "warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPersonList.getSelectedRow();
        if (selectedRow >= 0) {
            Person selectedPerson = personDirectory.getPersons().get(selectedRow); // Modify this according to your implementation
            ViewPersonJPanel panel = new ViewPersonJPanel(userProcessContainer, personDirectory, selectedPerson);
            userProcessContainer.add("ViewPersonJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select an perosn from the list to view.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPersonList.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this person?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Person selectedPerson = personDirectory.getPersons().get(selectedRow); // Modify this according to your implementation
                personDirectory.deletPerson(selectedPerson);
                populateTable(); // Refresh the table
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select an account from the list to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletePersonActionPerformed

    private void txtSearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPersonList.getModel();
        model.setRowCount(0); // Clear existing data

        for (Person p : personDirectory.getPersons()) {
            Object[] row = new Object[8];
            row[0] = p.getFName();       // First Name
            row[1] = p.getLName();       // Last Name
            row[2] = p.getSSN();         // SSN
            row[3] = p.getAge();         // Age
            row[4] = p.getHSAdd() + ", " + p.getHUnitNum() + ", " + p.getHCity() + ", " + p.getHState() + " " + p.getHZip(); // Home Address
            row[5] = p.getHPhNum();      // Home Phone Number
            row[6] = p.getWSAdd() + ", " + p.getWUnitNum() + ", " + p.getWCity() + ", " + p.getWState() + " " + p.getWZip(); // Work Address
            row[7] = p.getWPhNum();      // Work Phone Number

            model.addRow(row); // Add the row to the table model
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeletePerson;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageAccount;
    private javax.swing.JTable tblPersonList;
    private javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables
}