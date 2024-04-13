/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dreamhotel;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author budhd
 */
public class Checkout extends javax.swing.JFrame {
    int days;
    double pri;
    Connection con=null;
    Statement st=null;
    PreparedStatement pst=null;
    ResultSet rs=null;

   
    public Checkout() {
        initComponents();
       
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd ");
        Date d = new Date();
        txtdateout.setText(date.format(d));
       
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dreemhotel","root","12345");
             
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }

         s();
    }
    
    public void  s() {
        
        try {
        pst = con.prepareStatement("Select * from customer where status=?");
        pst.setString(1, "NULL");
        rs = pst.executeQuery();
        java.sql.ResultSetMetaData ob =  rs.getMetaData();
        int n=ob.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        df.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (int i = 1; i <= n; i++) {
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("mobileno"));
                    columnData.add(rs.getString("aadharno"));
                    columnData.add(rs.getString("roomnumber"));
                    columnData.add(rs.getString("bed"));
                    columnData.add(rs.getString("roomtype"));
                    columnData.add(rs.getString("indate"));
                    columnData.add(rs.getString("address"));
                    columnData.add(rs.getString("price"));
                    

                }
                df.addRow(columnData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null,ex);

        }
    
        
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtroomnumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmobileno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtaadhar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpriceperday = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcheckindate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdateout = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtnumberofdays = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel1.setText("Room Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, -1));
        getContentPane().add(txtroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 270, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 90, -1));

        jLabel2.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel2.setText("Customer Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, -1));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 270, -1));

        jLabel3.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel3.setText("Mobile Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, -1));
        getContentPane().add(txtmobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 270, -1));

        jLabel4.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel4.setText("Aadhar Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 140, -1));
        getContentPane().add(txtaadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 270, -1));

        jLabel5.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel5.setText("Price Per Day");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, -1));
        getContentPane().add(txtpriceperday, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 270, -1));

        jLabel6.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel6.setText("Check in Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, -1));
        getContentPane().add(txtcheckindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 242, 270, 30));

        jLabel7.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel7.setText("Check Out Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, -1));
        getContentPane().add(txtdateout, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 270, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer Name", "Mobile Number", "Aadhar Number", "Room Number", "Bedtype", "Room Type", "Checkin Date", "Address", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 650, 371));

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CheckOut");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 100, 40));

        jButton3.setBackground(new java.awt.Color(0, 51, 255));
        jButton3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 90, 40));

        jLabel8.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel8.setText("Number Of Days");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, -1));
        getContentPane().add(txtnumberofdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 270, 30));

        jLabel9.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel9.setText("Total Amount");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 120, -1));
        getContentPane().add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 270, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/checkout.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1370, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     if (txtroomnumber.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Room Number And Search it,Then Check Out Customer");
        } else {
            try {
                PreparedStatement pst = null;
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dreemhotel", "root", "12345");
                pst = con.prepareStatement("update customer set status=? where roomnumber=?");
                pst.setString(1, "check out");
                pst.setString(2, txtroomnumber.getText());
                pst.executeUpdate();
                pst = con.prepareStatement("update customer set amount=?,outdate=?,days=? where roomnumber=? AND indate=?");
                pst.setString(1, txtamount.getText());
                pst.setString(2, txtdateout.getText());
                pst.setString(3, txtnumberofdays.getText());
                pst.setString(4, txtroomnumber.getText());
                pst.setString(5, txtcheckindate.getText());
                pst.executeUpdate();
                pst = con.prepareStatement("update manageroom set status=? where roomnumber=?");
                pst.setString(1, "Not Booked");
                pst.setString(2, txtroomnumber.getText());
                pst.executeUpdate();
                //JOptionPane.showMessageDialog(this,"Check Out Successfully\n Goto to Cutomer Bill Details menu and Print Bill");
                int yes=JOptionPane.showConfirmDialog(this,"Check out Successfully.\nDo you want to see & print bill?","Check outed",JOptionPane.YES_NO_OPTION);
                if(JOptionPane.YES_OPTION==yes)
                
                
                
                s();
                txtname.setText("");
                
                
                txtmobileno.setText("");
                txtaadhar.setText("");
                txtpriceperday.setText("");
                txtcheckindate.setText("");
                txtcheckindate.setText("");
                txtamount.setText("");
                txtroomnumber.setText("");
                txtnumberofdays.setText("");
                        }
             catch (ClassNotFoundException | SQLException e) {
            }

        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            pst=con.prepareStatement("select * from customer where roomnumber = ? and status = ?");
            pst.setString(1, txtroomnumber.getText());
            pst.setString(2, "NULL");
            rs=pst.executeQuery();
            if(rs.next()){
                
                txtname.setText(rs.getString("name"));
                txtmobileno.setText(rs.getString("mobileno"));
                txtaadhar.setText(rs.getString("aadharno"));
                txtpriceperday.setText(rs.getString("price"));
                txtcheckindate.setText(rs.getString("indate"));
               
            
            }
           
            String s1,s2;
            s1=txtdateout.getText();
            s2=rs.getString("indate");
            SimpleDateFormat formate=new SimpleDateFormat("yyyy/MM/dd");
            
            Date d1=formate.parse(s1);
            Date d2= formate.parse(s2);
            long diff=d1.getTime()-d2.getTime();
            int days=(int)diff/(24*60*60*1000);
            if (days==0)
                days=1;
            txtnumberofdays.setText(String.valueOf(days));
            double price=Double.parseDouble(rs.getString("price"))* days;
            txtamount.setText(String.valueOf(price));
              
            
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaadhar;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtcheckindate;
    private javax.swing.JTextField txtdateout;
    private javax.swing.JTextField txtmobileno;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnumberofdays;
    private javax.swing.JTextField txtpriceperday;
    private javax.swing.JTextField txtroomnumber;
    // End of variables declaration//GEN-END:variables

    private void showDataInTOTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
