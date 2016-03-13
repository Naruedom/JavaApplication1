package p1;

import java.awt.Component;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

 
public class Trainer extends javax.swing.JFrame {

    
    public Trainer() {
        initComponents();
        URL iconURL = getClass().getResource("pool.png"); 
        ImageIcon icon = new ImageIcon(iconURL);
         this.setIconImage(icon.getImage()); 
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt3 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/schedule.png"))); // NOI18N
        bt3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt3.setBorderPainted(false);
        bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt3MouseClicked(evt);
            }
        });
        getContentPane().add(bt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 105, 107, 102));

        bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/regisC.png"))); // NOI18N
        bt2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt2.setBorderPainted(false);
        bt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt2MouseClicked(evt);
            }
        });
        getContentPane().add(bt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 105, -1, 102));

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
        getContentPane().add(bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 105, -1, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("สมัครสมาชิก");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 225, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("สมัครเรียนคอร์ส");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 225, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("การเข้าเรียนคอร์ส");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 225, -1, -1));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 277, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\DRAFT\\Documents\\NetBeansProjects\\JavaApplication1\\src\\p1\\img\\bg2.jpg")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1420, -350, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));

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
    private javax.swing.JLabel empText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
