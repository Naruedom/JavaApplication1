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
 
public class Staff extends javax.swing.JFrame {
 
    public Staff() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empText = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ชำระเงิน");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 225, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ประวัติการชำระเงิน");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 225, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ฝ่ายชำระเงิน");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, -1, -1));

        empText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empText.setForeground(new java.awt.Color(255, 255, 255));
        empText.setText("พนักงาน : ");
        getContentPane().add(empText, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 66, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/listPay.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 105, 110, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/cash-register-icon.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 105, 108, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/regisC.png"))); // NOI18N
        jButton4.setText("jButton4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 105, 121, 109));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("รายชื่อสมาชิก");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 225, -1, -1));

        jButton5.setText("ดูยอดเงินทั้งหมด");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 20, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/regisC.png"))); // NOI18N
        jButton6.setText("jButton6");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 105, 117, 109));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("รายชื่อสมาชิกคอร์ส");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 225, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/bg2.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -450, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        try {

            ResultSet  rs = cn2().executeQuery("select * from bill");
            JTable table = new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table)); 
        } catch (SQLException ex) {
            Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
        }

        //ไปไว้หน้าอื่น
         
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        C1 formC1 = new C1(); 
        setVisible(true); 
        formC1.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        formC1.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        login1 gui = new login1(); 
        setVisible(false);  
        gui.setVisible(true); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
         try {
            
          ResultSet  rs = cn2().executeQuery("select * from user");
          JTable table = new JTable(buildTableModel(rs));
          JOptionPane.showMessageDialog(null, new JScrollPane(table));
          
        } catch (SQLException ex) {
            Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
          try {
            
          ResultSet  rs = cn2().executeQuery("select sum(b_money) from bill");
          while (rs.next()){
          sum=rs.getString("sum(b_money)");
          sum2 =Integer.parseInt(sum);
          }
          JOptionPane.showMessageDialog(null,"มียอดเงินทั้งหมด " + sum2 + "บาท" );
          
        } catch (SQLException ex) {
            Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        
         try {
            
          ResultSet  rs = cn2().executeQuery("select * from register");
          JTable table = new JTable(buildTableModel(rs));
          JOptionPane.showMessageDialog(null, new JScrollPane(table));
          
        } catch (SQLException ex) {
            Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton6MouseClicked
 
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }
 
    public void add(login x) {
       login1 = x;
       empText.setText( "พนักงาน : "+login1.getName() );
    }
    
   
   login login1 ;
   String sum;
   int sum2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel empText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
