/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
 
import javax.swing.JOptionPane;  
import static p1.cnn.Sql3;
 
public class Admin_edittraner extends javax.swing.JFrame {
 
    public Admin_edittraner() {
        initComponents();  
        textadd.setLineWrap(true); 
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textadd = new javax.swing.JTextArea();
        texttel = new javax.swing.JTextField();
        textname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textadd.setColumns(20);
        textadd.setRows(5);
        jScrollPane1.setViewportView(textadd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 120, 179, -1));

        texttel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttelActionPerformed(evt);
            }
        });
        getContentPane().add(texttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 94, 179, -1));

        textname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnameActionPerformed(evt);
            }
        });
        getContentPane().add(textname, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 64, 179, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("ชื่อ        :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("เบอร์โทร :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ที่อยู่      :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 120, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("แก้ไข");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 242, 112, 41));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("แก้ไขข้อมูล ผู้สอน");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, -1, 36));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("ลบ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 242, -1, 41));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/bgin.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, -220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void texttelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttelActionPerformed

    private void textnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        String name;
        String tel;
        String add;
        String status;
        String pass;

        name = textname.getText(); 
        tel  = texttel.getText();
        add  = textadd.getText(); 

         
         Sql3("UPDATE `trainer` SET `t_name` = '"+name+"', `t_address` = '"+add+"'    WHERE `trainer`.`t_id` = '"+id+"';");
          
          
        JOptionPane.showMessageDialog(null,
		"แก้ไขข้อมูลเรียบร้อยแล้ว");
          this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        int n = JOptionPane.showConfirmDialog(
	    null,
	    "ต้องการข้อมูลนี้หรือไม่ !",
	    "ยืนยันการลบข้อมูล",
	    JOptionPane.YES_NO_OPTION); 
        if(n==0)
        { 
         System.err.println("ลบแล้ว"); 
         Sql3("DELETE FROM `trainer` WHERE `trainer`.`t_id` = '"+id+"'"); 
         JOptionPane.showMessageDialog(null,
		"ข้อมูลถูกลบแล้ว");
         this.dispose();
        } 
        
    }//GEN-LAST:event_jButton2ActionPerformed
 
    public static void main(String args[]) { 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_edittraner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_edittraner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_edittraner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_edittraner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_edittraner().setVisible(true);
            }
        });
    }

    public void setvalue (login id){
        
          this.id = id.getID();
          textadd.setText(id.getAddress()); 
               textname.setText(id.getName()); 
               texttel.setText(id.getTel());  
         
    }
    String id ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textadd;
    private javax.swing.JTextField textname;
    private javax.swing.JTextField texttel;
    // End of variables declaration//GEN-END:variables
}
