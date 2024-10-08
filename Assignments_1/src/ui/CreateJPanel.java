/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import model.Product;
/**
 *
 * @author pranavpatel
 */
public class CreateJPanel extends javax.swing.JPanel {
    Product product;

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(Product p) {
        product = p;
        
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

        lblTitle = new javax.swing.JLabel();
        lblFName = new javax.swing.JLabel();
        lblLName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblDLNum = new javax.swing.JLabel();
        lblDLState = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtDLNum = new javax.swing.JTextField();
        txtDLState = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        lblADL1 = new javax.swing.JLabel();
        lblADL2 = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        lblTeleNum = new javax.swing.JLabel();
        lblFaxNum = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        ADL1jScrollPane = new javax.swing.JScrollPane();
        txtADL1 = new javax.swing.JTextArea();
        ADL2jScrollPane = new javax.swing.JScrollPane();
        txtADL2 = new javax.swing.JTextArea();
        lblCountry = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtTeleNum = new javax.swing.JTextField();
        txtFaxNum = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblOccu = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        txtOccu = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtGender = new javax.swing.JTextField();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Person Profile");

        lblFName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFName.setText("First Name");

        lblLName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLName.setText("Last Name");

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmail.setText("Email");

        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhone.setText("Phone");

        lblDLNum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDLNum.setText("Drivers License Number");

        lblDLState.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDLState.setText("Drivers License State");

        lblSSN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSSN.setText("Social Security Number");

        txtFName.setText("FName");
        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });

        txtLName.setText("LName");
        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });

        txtEmail.setText("Email Add");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtPhone.setText("Phone Num");
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        txtDLNum.setText("DL Num");

        txtDLState.setText("Dl state");
        txtDLState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDLStateActionPerformed(evt);
            }
        });

        txtSSN.setText("SSN");

        lblADL1.setText("Address Line 1");

        lblADL2.setText("Address Line 2");

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCity.setText("City");

        lblState.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblState.setText("State");

        lblZip.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblZip.setText("Zip");

        lblTeleNum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTeleNum.setText("Telephone Number");

        lblFaxNum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFaxNum.setText("Fax Number");

        txtCity.setText("city");

        txtADL1.setColumns(20);
        txtADL1.setRows(5);
        ADL1jScrollPane.setViewportView(txtADL1);

        txtADL2.setColumns(20);
        txtADL2.setRows(5);
        ADL2jScrollPane.setViewportView(txtADL2);

        lblCountry.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCountry.setText("Country/Region");

        txtState.setText("state");

        txtCountry.setText("Country");

        txtZip.setText("Zip");

        txtTeleNum.setText("Tele Num");

        txtFaxNum.setText("Fax Num");

        lblGender.setText("Gender");

        lblDOB.setText("Date of Birth");

        lblOccu.setText("Occupation");

        txtDOB.setText("MM/DD/YYYY");

        txtOccu.setText("Occupation");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLName)
                    .addComponent(lblEmail)
                    .addComponent(lblPhone)
                    .addComponent(lblDLNum)
                    .addComponent(lblDLState)
                    .addComponent(lblSSN)
                    .addComponent(lblFName)
                    .addComponent(lblADL1)
                    .addComponent(lblFaxNum)
                    .addComponent(lblADL2)
                    .addComponent(lblState)
                    .addComponent(lblCountry)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZip)
                    .addComponent(lblTeleNum)
                    .addComponent(lblGender)
                    .addComponent(lblDOB)
                    .addComponent(lblOccu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTeleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFaxNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(126, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCity)
                            .addComponent(txtEmail)
                            .addComponent(txtPhone)
                            .addComponent(txtDLNum)
                            .addComponent(txtDLState)
                            .addComponent(txtSSN)
                            .addComponent(txtLName, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(txtFName, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(ADL2jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtDOB)
                            .addComponent(txtOccu)
                            .addComponent(ADL1jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtGender))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ADL1jScrollPane, ADL2jScrollPane, txtCity, txtCountry, txtDLNum, txtDLState, txtEmail, txtFName, txtFaxNum, txtLName, txtPhone, txtSSN, txtState, txtTeleNum, txtZip});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCity, lblCountry, lblFaxNum, lblState, lblTeleNum, lblZip});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFName)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLName)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDLNum)
                    .addComponent(txtDLNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDLState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDLState, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSSN))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblGender))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDOB)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOccu)
                    .addComponent(txtOccu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ADL1jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblADL1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ADL2jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblADL2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZip)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeleNum)
                    .addComponent(txtTeleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFaxNum)
                    .addComponent(txtFaxNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtDLStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDLStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDLStateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String fname=txtFName.getText();
        String lname=txtLName.getText();
        String email=txtEmail.getText();
        String phone=txtPhone.getText();
        String dlnum=txtDLNum.getText();
        String dlstate=txtDLState.getText();
        String ssn=txtSSN.getText();
        String adl1=txtADL1.getText();
        String adl2=txtADL2.getText();
        String city=txtCity.getText();
        String state=txtState.getText();
        String zip=txtZip.getText();
        String faxnum=txtFaxNum.getText();
        String occu=txtOccu.getText();
        String dob=txtDOB.getText();
        String country=txtCountry.getText();
        String telenum=txtTeleNum.getText();
        String gender=txtGender.getText();
        
        product.setFName(fname);
        product.setLName(lname);
        product.setEmail(email);
        product.setPhone(phone);
        product.setDLNub(dlnum);
        product.setDLstate(dlstate);
        product.setSSN(ssn);
        product.setADL1(adl1);
        product.setADL2(adl2);
        product.setCity(city);
        product.setState(state);
        product.setZip(zip);
        product.setTeleNum(telenum);
        product.setFaxNum(faxnum);
        product.setOccu(occu);
        product.setDOB(dob);
        product.setCountry(country);
        product.setGender(gender);
        
        JOptionPane.showMessageDialog(this, "Profile Saved!", "Success", JOptionPane.PLAIN_MESSAGE);
        
        txtFName.setText("");
        txtLName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtDLNum.setText("");   
        txtDLState .setText("");       
        txtSSN.setText(""); 
        txtADL1.setText("");
        txtADL2.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZip.setText("");
        txtTeleNum.setText("");
        txtFaxNum.setText("");        
        txtOccu.setText("");        
        txtDOB.setText("");        
        txtCountry.setText("");
        txtGender.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ADL1jScrollPane;
    private javax.swing.JScrollPane ADL2jScrollPane;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblADL1;
    private javax.swing.JLabel lblADL2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblDLNum;
    private javax.swing.JLabel lblDLState;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblFaxNum;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblOccu;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTeleNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextArea txtADL1;
    private javax.swing.JTextArea txtADL2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDLNum;
    private javax.swing.JTextField txtDLState;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFaxNum;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtOccu;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTeleNum;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
