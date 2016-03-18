/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import static p1.Function.checkid;
import static p1.Function.checknumber; 
import static p1.Myfunction.getToday;
import static p1.Myfunction.todate;
import static p1.cnn.Sql;
import static p1.cnn.cn;

/**
 *
 * @author YaneeSE
 */
public class regisCourse extends javax.swing.JFrame {
    public regisCourse() {
        initComponents();  
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel1.setText("รหัสคอร์ส");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 147, -1, -1));

        jLabel3.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 186, -1, -1));

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel4.setText("ชื่อคอร์ส");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 186, -1, -1));

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel5.setText("จำนวนชั่วโมง");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 225, -1, -1));

        jLabel6.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 225, -1, -1));

        jLabel7.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel7.setText("ชั่วโมง");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 225, -1, -1));

        jLabel8.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel8.setText("รหัสสมาชิก");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 87, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("สมัคร");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 309, 111, 38));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 89, 89, -1));

        jLabel2.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 147, -1, -1));

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel9.setText("ชื่อ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 115, -1, -1));

        jLabel10.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 115, -1, -1));

        jLabel11.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel11.setText("ผู้สอน");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 264, -1, -1));

        jLabel12.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 264, -1, -1));

        jLabel13.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel13.setText("สมัครเรียนคอร์สว่ายนํ้า");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 19, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("ยกเลิก");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 307, -1, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/bg5.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3710, -1930, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
  
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
     
           String input = jTextField1.getText();
           
           tn =  "นายสงขลา บุญช่วย";
           jLabel12.setText(tn);
           
         if(input.equals("")  ){
          JOptionPane.showMessageDialog(this, "กรุณากรอก ID ","Inane warning",JOptionPane.WARNING_MESSAGE ); 
          return; } 
          if(  !input.equals("") && !checkid( input )  )
        { JOptionPane.showMessageDialog(this, "ใส่ตัวเลข 9 หลักเท่านั้น","Inane warning",JOptionPane.WARNING_MESSAGE );
        return; }
          
          
           try {   
            ResultSet rs = cn().executeQuery("SELECT * FROM user where u_id = " + input); 
            if(!rs.next()){
             JOptionPane.showMessageDialog(this, "ไม่พบข้อมูลสมาชิก.","Inane warning",JOptionPane.WARNING_MESSAGE ); 
             return ; }   } catch (Exception ex) { System.out.println("excep error.");  return; }
            
          
           
        try {
           ResultSet  rs2 = cn().executeQuery("SELECT * FROM user where u_id = " + input ); 
            while(rs2.next()) {
                Name = rs2.getString("u_name"); 
                 BD  = rs2.getString("U_birth") ; 
                 age  =  (todate(BD).getYear()-getToday().getYear())-543 ;
                 System.out.print(todate(BD).getYear()-543+"-"+getToday().getYear()+"="+age);
                 Age  = age+""; 
                
               // age = Integer.parseInt(rs2.getString("u_age"));
                
                jLabel10.setText(Name);
                
                //-------------------------------------------------------//      
                 
                
                boolean agestatus ;
                
                //ต้องคำนวณจาก DB
                uid = input;
                jLabel10.setText(Name);
                if (age>=12){   
                    jLabel2.setText("5933001");
                    cid = "5933002";
                    jLabel3.setText("อายุเกิน 12 ปี");
                    jLabel6.setText("10");
                    
                }
                else if(age <12){
                    jLabel2.setText("5933002");
                    cid = "5933001";
                    jLabel3.setText("อายุไม่เกิน 12 ปี");
                    jLabel6.setText("10");
                }
                
                
            }
            //ต้องคำนวณชั่วโมงที่เหลือด้วย จ้า....
        } catch (SQLException ex) {
            Logger.getLogger(regisCourse.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    try {   
           
        //    ResultSet name1 = cn().executeQuery("SELECT u_name FROM user where u_id = " + input);
             ResultSet rs4 = cn().executeQuery("SELECT u_id FROM register where u_id = " + input);
           if (rs4.next()){ 
               JOptionPane.showMessageDialog(this, " ชื่อผู้ใช้นี้เคยสมัครแล้ว ","Warning",JOptionPane.ERROR_MESSAGE ); }
                           
           else if (!rs4.next()){  
                
               ResultSet rs3 = cn().executeQuery("SELECT * FROM user where u_id = " + input); 
               if (rs3.next()){
                    JOptionPane.showMessageDialog(this, "ยืนยันการสมัครเรียนคอร์สว่ายน้ำ ","Warning",JOptionPane.OK_CANCEL_OPTION );
                 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                 Calendar cal = Calendar.getInstance(); 
                 String data = dateFormat.format(cal.getTime()); 
                 Sql("INSERT INTO `register` ( `U_ID`, `C_ID`, `R_Date_Time`) VALUES ( '"+uid+"','"+cid+"','"+data+"');");
                                }
           }  } catch (Exception ex) { System.out.println("excep error.");  return; }  
       
           
   
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(regisCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regisCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regisCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regisCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regisCourse().setVisible(true);
            }
        });
    }
String uid;
String cid;
public int age = 0 ; 
 String Age ;
 String BD;
 String Name;
 String tn;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
