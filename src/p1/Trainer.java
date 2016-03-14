package p1;

import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import static p1.C1.buildTableModel;
import static p1.cnn.cn;
import static p1.cnn.cn2;

 
public class Trainer extends javax.swing.JFrame {

    
    public Trainer() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt3 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/schedule.png"))); // NOI18N
        bt3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt3.setBorderPainted(false);
        bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt3MouseClicked(evt);
            }
        });
        getContentPane().add(bt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 265, 107, 102));

        bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/regisC.png"))); // NOI18N
        bt2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt2.setBorderPainted(false);
        bt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt2MouseClicked(evt);
            }
        });
        getContentPane().add(bt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, 102));

        bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/addMember.png"))); // NOI18N
        bt1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt1.setBorderPainted(false);
        bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt1MouseClicked(evt);
            }
        });
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("สมัครสมาชิก");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("สมัครเรียนคอร์ส");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ฝ่ายข้อมูล");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, -1, -1));

        empText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empText.setForeground(new java.awt.Color(255, 255, 255));
        empText.setText("พนักงาน : ");
        getContentPane().add(empText, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 66, -1, -1));

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 407, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/schedule.png"))); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 265, 102, 96));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("รายชื่อสมาชิก");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 379, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("รายชื่อสมัครเรียนคอร์ส");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 379, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/schedule.png"))); // NOI18N
        jButton3.setText("jButton3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 265, 97, 96));

        bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/addMember.png"))); // NOI18N
        bt4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt4.setBorderPainted(false);
        bt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt4MouseClicked(evt);
            }
        });
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        getContentPane().add(bt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("การเข้าเรียนคอร์ส");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("แก้ไขข้อมูล");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/bg2.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-390, -400, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseClicked
        
        InClass In = null;
        try {
            In = new InClass();
        } catch (Exception ex) {
            Logger.getLogger(Page1.class.getName()).log(Level.SEVERE, null, ex);
        } 
        setVisible(true); 
        In.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        In.setVisible(true);
        return;

    }//GEN-LAST:event_bt3MouseClicked

    private void bt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseClicked
        regisCourse formregisCourse = new regisCourse(); 
        formregisCourse.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true); 
        formregisCourse.setVisible(true);
    }//GEN-LAST:event_bt2MouseClicked
        
    private void bt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseClicked
        regis formRegis = new regis(); 
        setVisible(true); 
        formRegis.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        formRegis.setVisible(true);  
    }//GEN-LAST:event_bt1MouseClicked

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login1 gui = new login1(); 
        setVisible(false);  
        gui.setVisible(true); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            
          ResultSet  rs = cn().executeQuery("select * from user");
          JTable table = new JTable(buildTableModel(rs));
          JOptionPane.showMessageDialog(null, new JScrollPane(table));
          
        } catch (SQLException ex) {
            Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       try {
            
          ResultSet  rs = cn().executeQuery("select * from register");
          JTable table = new JTable(buildTableModel(rs));
          JOptionPane.showMessageDialog(null, new JScrollPane(table));
          
        } catch (SQLException ex) {
            Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton3MouseClicked

    private void bt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt4MouseClicked

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        edituser gui = new edituser();
        setVisible(false); 
        gui.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        gui.setVisible(true);
    }//GEN-LAST:event_bt4ActionPerformed
 
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trainer().setVisible(true);
            }
        });
    }
 
    public void add(login x) {
       login1 = x;
       empText.setText( "พนักงาน : "+login1.getName() );
    }
    
   
   login login1 ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JLabel empText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
