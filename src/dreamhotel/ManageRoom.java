package dreamhotel;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ManageRoom extends javax.swing.JFrame {

    
    
    PreparedStatement pst=null;
    Statement st=null;
    ResultSet rs=null;
    Connection con=null; 
    
    public ManageRoom() {
        initComponents();
        
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dreemhotel","root","12345");
             
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ShowRecordInTable();
        
    }
    
    public void ShowRecordInTable(){
        int c=0;
        try {
            pst=con.prepareStatement("select * from manageroom");
            rs=pst.executeQuery();
            ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
            c=rsmd.getColumnCount();
            DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0);
            while(rs.next()){
                
                Vector columnData=new Vector();
                for(int i=1;i<=c;i++){
                    columnData.add(rs.getString("roomnumber"));
                    columnData.add(rs.getString("roomtype"));
                    columnData.add(rs.getString("bed"));
                    columnData.add(rs.getString("price"));
                    columnData.add(rs.getString("status"));
                }
                RecordTable.addRow(columnData);
                //System.out.println(columnData);

            } 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtroomnumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboroomtype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jCombobed = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manage.png"))); // NOI18N
        jLabel1.setText("Manage Room");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 15, 194, 71));

        jTable1.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Room Number", "Room Type", "Bed Type", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 971, -1));

        jLabel2.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 566, 140, 38));

        txtroomnumber.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        getContentPane().add(txtroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 566, 170, 38));

        jLabel3.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel3.setText("Room Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 636, 140, 39));

        jComboroomtype.setBackground(new java.awt.Color(255, 255, 51));
        jComboroomtype.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jComboroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC" }));
        getContentPane().add(jComboroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 636, 170, 39));

        jLabel4.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel4.setText("Bed");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 566, 89, 38));

        jCombobed.setBackground(new java.awt.Color(255, 255, 51));
        jCombobed.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jCombobed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        getContentPane().add(jCombobed, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 566, 148, 38));

        jLabel5.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 636, 89, 39));

        txtprice.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 636, 148, 39));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Room Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 566, 208, 38));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Swis721 BT", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 636, 208, 39));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admin Home.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    if(txtroomnumber.getText().equals("")){
        JOptionPane.showMessageDialog(this, "All Field is Requied");
           txtroomnumber.requestFocus();
    }
    else if(txtprice.getText().equals("")){
       JOptionPane.showMessageDialog(this, "All Field is Requied");
       txtprice.requestFocus();
    } 
      else{ 
        
        try{
            pst=con.prepareStatement("select * from manageroom where roomnumber=?");
            pst.setString(1, txtroomnumber.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this,"Room Number Already Exist");
            }
            else{
                pst=con.prepareStatement("insert into manageroom(roomnumber,roomtype,bed,price,status)values(?,?,?,?,?)");
                pst.setString(1, txtroomnumber.getText());
                pst.setString(2, jComboroomtype.getItemAt(jComboroomtype.getSelectedIndex()));
                pst.setString(3, jCombobed.getItemAt(jCombobed.getSelectedIndex()));
                pst.setString(4, txtprice.getText());
                pst.setString(5, "Not Booked");                       
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Room Added");
                ShowRecordInTable();
                txtprice.setText("");
                txtroomnumber.setText("");
            }
                 
        } catch (SQLException ex) {
            Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    }
    
    
    public static void main(String args[]) {
   

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCombobed;
    private javax.swing.JComboBox<String> jComboroomtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtroomnumber;
    // End of variables declaration//GEN-END:variables
}
