package dreamhotel;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Checkin extends javax.swing.JFrame {
    
    PreparedStatement pst=null;
    Statement st=null;
    ResultSet rs=null;
    Connection con=null; 

   
    public Checkin() {
       initComponents();
       SimpleDateFormat obj = new SimpleDateFormat ("yyyy/MM/dd");
       Date date = new Date();
       txtcheckin.setText(obj.format(date));
      
       
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dreemhotel","root","12345");
             
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        shanideo();
        
    }
    public void shanideo(){
        try {
            pst=con.prepareStatement("Select roomnumber from manageroom where bed=? and roomtype=? and status=?");
            pst.setString(1, combobed.getItemAt(combobed.getSelectedIndex()));
            pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
            pst.setString(3, "NOT-BOOKED");
            rs=pst.executeQuery();
            while(rs.next()){
                comboroomno.addItem(rs.getString("roomnumber"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Checkin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtfathername = new javax.swing.JTextField();
        txtaadhar = new javax.swing.JTextField();
        combogender = new javax.swing.JComboBox<>();
        txtmobile = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtcheckin = new javax.swing.JTextField();
        combobed = new javax.swing.JComboBox<>();
        comboroomtype = new javax.swing.JComboBox<>();
        comboroomno = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jLabel2.setText("Father Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jLabel4.setText("Aadhar No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jLabel5.setText("Mobile No");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jLabel6.setText("E-Mail");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 244, -1));

        jLabel7.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 244, 25));

        jLabel8.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jLabel8.setText("Checkin Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 233, -1));

        jLabel9.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jLabel9.setText("Bed Type");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 233, 25));

        jLabel10.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jLabel10.setText("Room Type");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 274, -1));

        jLabel11.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jLabel11.setText("Room No");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 244, 39));
        getContentPane().add(txtfathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 244, 37));

        txtaadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaadharActionPerformed(evt);
            }
        });
        getContentPane().add(txtaadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 244, 33));

        combogender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        getContentPane().add(combogender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 244, 34));
        getContentPane().add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 244, 37));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 244, 35));

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 244, 33));

        txtcheckin.setEditable(false);
        txtcheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcheckinActionPerformed(evt);
            }
        });
        getContentPane().add(txtcheckin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 233, 39));

        combobed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SINGLE", "DOUBLE" }));
        combobed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobedItemStateChanged(evt);
            }
        });
        getContentPane().add(combobed, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 233, 34));

        comboroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC" }));
        comboroomtype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboroomtypeItemStateChanged(evt);
            }
        });
        comboroomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboroomtypeActionPerformed(evt);
            }
        });
        getContentPane().add(comboroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 233, 30));

        comboroomno.setEditable(true);
        comboroomno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboroomnoActionPerformed(evt);
            }
        });
        getContentPane().add(comboroomno, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 357, 230, 40));

        jLabel12.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jLabel12.setText("Price");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 218, -1));

        txtprice.setEditable(false);
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 233, 35));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Check IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 132, 35));

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/check in background.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaadharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaadharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaadharActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtcheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcheckinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcheckinActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void combobedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobedItemStateChanged
        // TODO add your handling code here:
         PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dreemhotel","root","12345");
            pst=con.prepareStatement("select roomnumber from manageroom where status=? AND roomtype=? AND bed=?");
            pst.setString(1,"Not Booked");
            pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
            pst.setString(3, combobed.getItemAt(combobed.getSelectedIndex()));
            rs=pst.executeQuery();
            comboroomno.removeAllItems();
            while(rs.next()){
                comboroomno.addItem(rs.getString("roomnumber"));
            }
            pst=con.prepareStatement("select price from manageroom where roomnumber=?");
            pst.setString(1,comboroomno.getItemAt(comboroomno.getSelectedIndex()));
            rs=pst.executeQuery();
            if(rs.next())
            txtprice.setText(rs.getString("price"));
        }catch(ClassNotFoundException | SQLException e){
        }
        

    }//GEN-LAST:event_combobedItemStateChanged

    private void comboroomtypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboroomtypeItemStateChanged
        // TODO add your handling code here:
        
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dreemhotel","root","12345");
            pst=con.prepareStatement("select roomnumber from manageroom where status=? AND roomtype=? AND bed=?");
            pst.setString(1,"Not Booked");
            pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
            pst.setString(3, combobed.getItemAt(combobed.getSelectedIndex()));
            rs=pst.executeQuery();
            comboroomno.removeAllItems();
            while(rs.next()){
                comboroomno.addItem(rs.getString("roomnumber"));
            }
            pst=con.prepareStatement("select price from manageroom where roomnumber=?");
            pst.setString(1,comboroomno.getItemAt(comboroomno.getSelectedIndex()));
            rs=pst.executeQuery();
            if(rs.next())
            txtprice.setText(rs.getString("price"));
        }catch(ClassNotFoundException | SQLException e){
        }
        

    }//GEN-LAST:event_comboroomtypeItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(txtname.getText().equals("")){
      JOptionPane.showMessageDialog(this, "All Field is Requied");
      txtname.requestFocus();
    }
    else if(txtfathername.getText().equals("")){
       JOptionPane.showMessageDialog(this, "All Field is Requied");
       txtfathername.requestFocus();
    }
    else if(txtemail.getText().equals("")){
      JOptionPane.showMessageDialog(this, "All Field is Requied");
      txtemail.requestFocus();
    }
    
    else if(txtaadhar.getText().equals("")){
      JOptionPane.showMessageDialog(this, "All Field is Requied");
      txtaadhar.requestFocus();
    }
    else if(txtmobile.getText().equals("")){
       JOptionPane.showMessageDialog(this, "All Field is Requied");
       txtmobile.requestFocus();
    }
    else if(txtaddress.getText().equals("")){
       JOptionPane.showMessageDialog(this, "Sorry, This type of Room Not avaible Select another room ");
       txtaddress.requestFocus();
    }
     else if(txtprice.getText().equals("")){
       JOptionPane.showMessageDialog(this, "Sorry, This type of Room Not avaible Select another room ");
       txtaddress.requestFocus();
     } 
     else if(txtmobile.getText().length()!=10){
        JOptionPane.showMessageDialog(this, "Mobile Number Should be 10 Digit.");
    }
    else if(txtaadhar.getText().length()!=12){
        JOptionPane.showMessageDialog(this, "Adhar Number Should be 12 Digit.");
    }
      else{
        try{
        long l=Long.parseLong(txtmobile.getText());
        l=Long.parseLong(txtaadhar.getText());
        
        try {
            PreparedStatement pst;
            ResultSet rs;
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dreemhotel","root","12345");
            pst=con.prepareStatement("insert into customer(name,fathername,gender,aadharno,mobileno,email,address,indate,bed,roomtype,roomnumber,price,status)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, txtname.getText());
            pst.setString(2, txtfathername.getText());
            pst.setString(3, combogender.getItemAt(combogender.getSelectedIndex())); 
            pst.setString(4, txtaadhar.getText());
            pst.setString(5, txtmobile.getText());
            pst.setString(6, txtemail.getText().toLowerCase());
            pst.setString(7, txtaddress.getText());
            pst.setString(8, txtcheckin.getText());
            pst.setString(9,(String) combobed.getSelectedItem());
            
            pst.setString(10, (String) comboroomtype.getSelectedItem());
            pst.setString(11, (String) comboroomno.getSelectedItem());
            pst.setString(12, txtprice.getText());
            
            pst.setString(13,"NULL");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Room Alloted");
            pst=con.prepareStatement("update manageroom set status=? where roomnumber=?");
            pst.setString(1,"Booked" );
            pst.setString(2, (String) comboroomno.getSelectedItem());
            pst.executeUpdate();
            pst=con.prepareStatement("select roomnumber from manageroom where status=? AND roomtype=? AND bed=?");
            pst.setString(1,"Not Booked");
            pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
            pst.setString(3, combobed.getItemAt(combobed.getSelectedIndex()));
            rs=pst.executeQuery();
            comboroomno.removeAllItems();
            while(rs.next()){
                comboroomno.addItem(rs.getString("roomnumber"));
            }
            pst=con.prepareStatement("select price from manageroom where roomnumber=?");
            pst.setString(1,comboroomno.getItemAt(comboroomno.getSelectedIndex()));
            rs=pst.executeQuery();
            if(rs.next()){
            txtprice.setText(rs.getString("price"));
            }
            txtname.setText("");
            txtmobile.setText("");
            
            txtemail.setText("");
            txtaadhar.setText("");
            txtaddress.setText("");
            combogender.setSelectedIndex(0);
            combobed.setSelectedIndex(0);
            comboroomtype.setSelectedIndex(0);
            if(comboroomno.getItemCount()==0)
                txtprice.setText("");
            }catch(HeadlessException | ClassNotFoundException | SQLException e){
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Either Mobile Number or Adhar Number Not valied");
                }
    }
      
      
      
      
      
      
      
      
      
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
       
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboroomnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboroomnoActionPerformed
        // TODO add your handling code here:
          PreparedStatement pst;
            ResultSet rs;
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dreemhotel","root","12345");
            pst=con.prepareStatement("select price from rohit where roomnumber=?");
            pst.setString(1,comboroomno.getItemAt(comboroomno.getSelectedIndex()));
            rs=pst.executeQuery();
            if(rs.next())
            txtprice.setText(rs.getString("price"));       
            }catch(ClassNotFoundException | SQLException e){
        }
        
    }//GEN-LAST:event_comboroomnoActionPerformed

    private void comboroomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboroomtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboroomtypeActionPerformed

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
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobed;
    private javax.swing.JComboBox<String> combogender;
    private javax.swing.JComboBox<String> comboroomno;
    private javax.swing.JComboBox<String> comboroomtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField txtaadhar;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcheckin;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfathername;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables

    private void autoID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
