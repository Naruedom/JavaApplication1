/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.net.URL;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import static p1.C1.buildTableModel;
import static p1.cnn.cn;
import static p1.cnn.cn3;

/**
 *
 * @author DRAFT
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents(); 
        URL iconURL = getClass().getResource("pool.png"); 
        ImageIcon icon = new ImageIcon(iconURL);
         this.setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        empText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textid = new javax.swing.JTextField();
        texterror = new javax.swing.JLabel();
        bt5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("ระบบแอดมิน");

        empText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empText.setText("ผู้ดูแล : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("เพิ่มผู้ดูแล");

        bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/emp2.png"))); // NOI18N
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

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("แก้ไขข้อมูล");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("รหัสพนักงาน");

        textid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textid.setToolTipText("");
        textid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textidFocusGained(evt);
            }
        });

        texterror.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        texterror.setForeground(new java.awt.Color(255, 0, 0));
        texterror.setText("ID พนักงานไม่ถูกต้อง");

        bt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/emp1.png"))); // NOI18N
        bt5.setBorderPainted(false);
        bt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt5MouseClicked(evt);
            }
        });
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("รายชื่อพนักงาน");

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/schedule.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel2.setText("ประวัติการชำระบิล");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/schedule.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel6.setText("ประวัติการสมัครคอร์ส");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/schedule.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jLabel7.setText("ประวัติการเข้าเรียนคอร์ส");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(jLabel2)
                                            .addGap(73, 73, 73)
                                            .addComponent(jLabel6)
                                            .addGap(148, 148, 148))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(jLabel5)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(51, 51, 51)
                                                    .addComponent(jLabel3))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(23, 23, 23)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                            .addComponent(jLabel4)
                            .addComponent(empText)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(texterror)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)))))
                        .addGap(0, 36, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texterror))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt4MouseClicked

    private void textidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textidFocusGained
        texterror.setVisible(false);
    }//GEN-LAST:event_textidFocusGained

    private void bt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         id = textid.getText();
         
          try {   
            
            ResultSet rs = cn3().executeQuery("SELECT * FROM staff where sf_id = '"+id+"'");  
            if (rs.next()) {
                Admin_edit gui = new Admin_edit();
                login lg = new login(id);
                gui.setvalue(lg);
                setVisible(true);
                gui.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                gui.setVisible(true);
                System.out.println( id ); 
             }
            else
            {
                 ResultSet rs2 = cn3().executeQuery("SELECT * FROM trainer where t_id = '"+id+"'");  
            if (rs2.next()) {
                Admin_edittraner gui = new Admin_edittraner();
                login lg = new login(id);
                gui.setvalue(lg);
                setVisible(true);
                gui.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                gui.setVisible(true);
                System.out.println( id ); 
             }
            else
                texterror.setVisible(true);
            }
             
        } catch (Exception ex) {
            System.err.println("error conect.");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        login1 gui = new login1();
        setVisible(false);
        gui.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        Admin_add gui = new Admin_add();
        gui.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);
        gui.setVisible(true);
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        Admin_show gui;
        try {
            gui = new Admin_show(); 
            gui.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
            setVisible(true);
            gui.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_bt5ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
             try {
            
          ResultSet  rs = cn().executeQuery("select * from bill");
          JTable table = new JTable(buildTableModel(rs));
          JOptionPane.showMessageDialog(null, new JScrollPane(table));
          
        } catch (SQLException ex) {
            Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
        } 
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        try {
            
          ResultSet  rs = cn().executeQuery("select * from register");
          JTable table = new JTable(buildTableModel(rs));
          JOptionPane.showMessageDialog(null, new JScrollPane(table));
          
        } catch (SQLException ex) {
            Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
         try {
            
          ResultSet  rs = cn().executeQuery("select * from study");
          JTable table = new JTable(buildTableModel(rs));
          JOptionPane.showMessageDialog(null, new JScrollPane(table));
          
        } catch (SQLException ex) {
            Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

       public void add(login x) {
       login1 = x;
       empText.setText( "ผู้ดูแล : "+login1.getName() );
    }
    String id ;
    login login1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JLabel empText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel texterror;
    private javax.swing.JTextField textid;
    // End of variables declaration//GEN-END:variables
}
