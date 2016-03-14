package p1;
 
import javax.swing.JOptionPane;  
import static p1.cnn.Sql3;
 
public class Admin_edit extends javax.swing.JFrame {
 
    public Admin_edit() {
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
        jLabel3 = new javax.swing.JLabel();
        textpass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textadd.setColumns(20);
        textadd.setRows(5);
        jScrollPane1.setViewportView(textadd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 206, 149, -1));

        texttel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttelActionPerformed(evt);
            }
        });
        getContentPane().add(texttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 168, 149, -1));

        textname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnameActionPerformed(evt);
            }
        });
        getContentPane().add(textname, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 62, 149, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("ชื่อ        :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 58, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("เบอร์โทร :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 164, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ที่อยู่      :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 206, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("สถานะ    :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 128, -1, -1));

        textpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpassActionPerformed(evt);
            }
        });
        getContentPane().add(textpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 97, 149, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("รหัส      :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 93, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("แก้ไข");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 324, 82, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("แก้ไขข้อมูล");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 11, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cashier", "information ", "admin" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 128, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("ลบ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 324, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/bgin.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-730, -180, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void texttelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttelActionPerformed

    private void textnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnameActionPerformed

    private void textpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        String name;
        String tel;
        String add;
        String status;
        String pass;

        name = textname.getText();
        pass = textpass.getText();
        tel  = texttel.getText();
        add  = textadd.getText();
        status=jComboBox1.getSelectedItem().toString();

         
         Sql3("UPDATE `staff` SET `Sf_name` = '"+name+"', `Sf_address` = '"+add+"', `Sf_status` = '"+status+"', `sf_pass` = '"+pass+"' WHERE `staff`.`Sf_id` = '"+id+"';");
          
          
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
         Sql3("DELETE FROM `staff` WHERE `staff`.`Sf_id` = '"+id+"'"); 
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
            java.util.logging.Logger.getLogger(Admin_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_edit().setVisible(true);
            }
        });
    }

    public void setvalue (login id){
        
          this.id = id.getID();
          textadd.setText(id.getAddress()); 
               textname.setText(id.getName());
               textpass.setText(id.getPass());
               texttel.setText(id.getTel()); 
               jComboBox1.setSelectedItem(id.getStatus()); 
         
    }
    String id ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textadd;
    private javax.swing.JTextField textname;
    private javax.swing.JTextField textpass;
    private javax.swing.JTextField texttel;
    // End of variables declaration//GEN-END:variables
}
