/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package currencyconverter;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author KIIT
 */
public class CurrencyConverter extends javax.swing.JFrame {

    /**
     * Creates new form CurrencyConverter
     */
    public CurrencyConverter() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JComboBox<>();
        txtTo = new javax.swing.JComboBox<>();
        Reset = new javax.swing.JButton();
        Convert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 144, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(174, 181, 192), new java.awt.Color(174, 181, 192), new java.awt.Color(174, 181, 192), new java.awt.Color(174, 181, 192)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        jButton1.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jButton1.setText("C u r r e n c y  C o n v e r t e r");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtAmount.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(204, 204, 204));
        txtAmount.setText("Enter the Amount");
        txtAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAmountFocusLost(evt);
            }
        });
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("Amount");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("From");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("To");

        txtFrom.setBackground(new java.awt.Color(220, 144, 255));
        txtFrom.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtFrom.setForeground(new java.awt.Color(153, 51, 255));
        txtFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "INR", "JPY", "AUD", "CAD", "CNY" }));
        txtFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromActionPerformed(evt);
            }
        });

        txtTo.setBackground(new java.awt.Color(220, 144, 255));
        txtTo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtTo.setForeground(new java.awt.Color(153, 102, 255));
        txtTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "INR", "JPY", "AUD", "CAD", "USD", "CNY", " " }));

        Reset.setBackground(new java.awt.Color(255, 204, 204));
        Reset.setText("Reset");
        Reset.setBorderPainted(false);
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Convert.setBackground(new java.awt.Color(255, 204, 204));
        Convert.setText("Convert");
        Convert.setBorderPainted(false);
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
        txtAmount.setText("Enter a Amount");
    }//GEN-LAST:event_txtAmountActionPerformed

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
               Double convert=0.0;
               Double amount=Double.parseDouble(txtAmount.getText());
               
               if(txtFrom.getSelectedItem().toString()=="USD" && txtTo.getSelectedItem().toString()=="INR"){
                   convert=amount * 82.69;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Rupees");
                   
               }
               else if(txtFrom.getSelectedItem().toString()=="USD" && txtTo.getSelectedItem().toString()=="EUR"){
                   convert=amount * 0.92;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Euro");
               }
               else if(txtFrom.getSelectedItem().toString()=="USD" && txtTo.getSelectedItem().toString()=="JPY"){
                   convert=amount * 143.72;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Japanese Yen");
               }
               else if(txtFrom.getSelectedItem().toString()=="USD" && txtTo.getSelectedItem().toString()=="AUD"){
                   convert=amount * 1.51;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Australian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="USD" && txtTo.getSelectedItem().toString()=="CAD"){
                   convert=amount * 1.34;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Canadian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="USD" && txtTo.getSelectedItem().toString()=="USD"){
                   convert=amount;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" United States Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="USD" && txtTo.getSelectedItem().toString()=="CNY"){
                   convert=amount*7.24;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Chinese Yuan");
               }
               else if(txtFrom.getSelectedItem().toString()=="INR" && txtTo.getSelectedItem().toString()=="USD"){
                   convert=amount * 0.012;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" United States Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="INR" && txtTo.getSelectedItem().toString()=="AUD"){
                   convert=amount * 0.018;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Australian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="INR" && txtTo.getSelectedItem().toString()=="CAD"){
                   convert=amount * 0.016;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Canadian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="INR" && txtTo.getSelectedItem().toString()=="EUR"){
                   convert=amount * 0.011;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Euro");
               }
               else if(txtFrom.getSelectedItem().toString()=="INR" && txtTo.getSelectedItem().toString()=="JPY"){
                   convert=amount * 1.74;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Japanese Yen");
               }
               else if(txtFrom.getSelectedItem().toString()=="INR" && txtTo.getSelectedItem().toString()=="INR"){
                   convert=amount;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Rupees");
               }
               else if(txtFrom.getSelectedItem().toString()=="INR" && txtTo.getSelectedItem().toString()=="CNY"){
                   convert=amount*0.088;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Chinese Yuan");
               }
               else if(txtFrom.getSelectedItem().toString()=="JPY" && txtTo.getSelectedItem().toString()=="USD"){
                   convert=amount * 0.0070;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" United States Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="JPY" && txtTo.getSelectedItem().toString()=="INR"){
                   convert=amount * 0.58;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Rupees");
               }
               else if(txtFrom.getSelectedItem().toString()=="JPY" && txtTo.getSelectedItem().toString()=="CAD"){
                   convert=amount * 0.0070;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Canadian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="JPY" && txtTo.getSelectedItem().toString()=="AUD"){
                   convert=amount * 0.010;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Australian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="JPY" && txtTo.getSelectedItem().toString()=="EUR"){
                   convert=amount * 0.0064;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Euro");
               }
               else if(txtFrom.getSelectedItem().toString()=="JPY" && txtTo.getSelectedItem().toString()=="JPY"){
                   convert=amount;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Japanese Yen");
               }
               else if(txtFrom.getSelectedItem().toString()=="JPY" && txtTo.getSelectedItem().toString()=="CNY"){
                   convert=amount*0.050;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Chinese Yuan");
               }
               else if(txtFrom.getSelectedItem().toString()=="EUR" && txtTo.getSelectedItem().toString()=="EUR"){
                   convert=amount;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Euro");
               }
               else if(txtFrom.getSelectedItem().toString()=="EUR" && txtTo.getSelectedItem().toString()=="INR"){
                   convert=amount * 90.04;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Rupee");
               }
               else if(txtFrom.getSelectedItem().toString()=="EUR" && txtTo.getSelectedItem().toString()=="AUD"){
                   convert=amount * 1.64;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Australian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="EUR" && txtTo.getSelectedItem().toString()=="CAD"){
                   convert=amount * 1.46;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Canadian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="EUR" && txtTo.getSelectedItem().toString()=="USD"){
                   convert=amount * 1.09;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Unites States Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="EUR" && txtTo.getSelectedItem().toString()=="JPY"){
                   convert=amount * 156.51;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Japaneses Yen");
               }
               else if(txtFrom.getSelectedItem().toString()=="EUR" && txtTo.getSelectedItem().toString()=="CNY"){
                   convert=amount*7.89;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Chinese Yuan");
               }
               else if(txtFrom.getSelectedItem().toString()=="CAD" && txtTo.getSelectedItem().toString()=="CAD"){
                   convert=amount;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Canadian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="CAD" && txtTo.getSelectedItem().toString()=="AUD"){
                   convert=amount*1.13;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Australian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="CAD" && txtTo.getSelectedItem().toString()=="INR"){
                   convert=amount*61.87;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Rupees");
               }
               else if(txtFrom.getSelectedItem().toString()=="CAD" && txtTo.getSelectedItem().toString()=="EUR"){
                   convert=amount*0.69;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Euro");
               }
               else if(txtFrom.getSelectedItem().toString()=="CAD" && txtTo.getSelectedItem().toString()=="USD"){
                   convert=amount*0.75;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" United States Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="CAD" && txtTo.getSelectedItem().toString()=="JPY"){
                   convert=amount*107.40;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Japanese Yen");
               }
               else if(txtFrom.getSelectedItem().toString()=="CAD" && txtTo.getSelectedItem().toString()=="CNY"){
                   convert=amount*5.42;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Chinese Yuan");
               }
               else if(txtFrom.getSelectedItem().toString()=="AUD" && txtTo.getSelectedItem().toString()=="CAD"){
                   convert=amount*0.89;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Canadian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="AUD" && txtTo.getSelectedItem().toString()=="AUD"){
                   convert=amount;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Australian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="AUD" && txtTo.getSelectedItem().toString()=="INR"){
                   convert=amount*54.87;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Rupees");
               }
               else if(txtFrom.getSelectedItem().toString()=="AUD" && txtTo.getSelectedItem().toString()=="EUR"){
                   convert=amount*0.61;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Euro");
               }
               else if(txtFrom.getSelectedItem().toString()=="AUD" && txtTo.getSelectedItem().toString()=="USD"){
                   convert=amount*0.66;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" United States Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="AUD" && txtTo.getSelectedItem().toString()=="JPY"){
                   convert=amount*95.26;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Japanese Yen");
               }
               else if(txtFrom.getSelectedItem().toString()=="AUD" && txtTo.getSelectedItem().toString()=="CNY"){
                   convert=amount*4.80;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Chinese Yuan");
               }
               else if(txtFrom.getSelectedItem().toString()=="CNY" && txtTo.getSelectedItem().toString()=="CAD"){
                   convert=amount*0.18;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Canadian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="CNY" && txtTo.getSelectedItem().toString()=="AUD"){
                   convert=amount*0.21;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Australian Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="CNY" && txtTo.getSelectedItem().toString()=="INR"){
                   convert=amount*11.42;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Rupees");
               }
               else if(txtFrom.getSelectedItem().toString()=="CNY" && txtTo.getSelectedItem().toString()=="EUR"){
                   convert=amount*0.13;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Euro");
               }
               else if(txtFrom.getSelectedItem().toString()=="CNY" && txtTo.getSelectedItem().toString()=="USD"){
                   convert=amount*0.14;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" United States Dollar");
               }
               else if(txtFrom.getSelectedItem().toString()=="CNY" && txtTo.getSelectedItem().toString()=="JPY"){
                   convert=amount*95.26;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Japanese Yen");
               }
               else if(txtFrom.getSelectedItem().toString()=="CNY" && txtTo.getSelectedItem().toString()=="CNY"){
                   convert=amount;
                   JOptionPane.showMessageDialog(this, "The converted Amount is "+ convert.toString()+" Chinese Yuan");
               }
                   

    }//GEN-LAST:event_ConvertActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        
            txtAmount.setText("Enter the Amount");
            txtAmount.setForeground(new Color(153,153,153));
        
    }//GEN-LAST:event_ResetActionPerformed

    private void txtFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromActionPerformed

    private void txtAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmountFocusLost
        // TODO add your handling code here:
        if(txtAmount.getText().equals("")){
            txtAmount.setText("Enter the Amount");
            txtAmount.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtAmountFocusLost

    private void txtAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmountFocusGained
        // TODO add your handling code here:
        if(txtAmount.getText().equals("Enter the Amount")){
            txtAmount.setText("");
            txtAmount.setForeground(new Color(204,77,220));
        }
    }//GEN-LAST:event_txtAmountFocusGained

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
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert;
    private javax.swing.JButton Reset;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JComboBox<String> txtFrom;
    private javax.swing.JComboBox<String> txtTo;
    // End of variables declaration//GEN-END:variables
}
