 package p1;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import static p1.Function.checknumber;
import static p1.cnn.Sql;
import static p1.cnn.cn3;

 
public class regis extends javax.swing.JFrame {

 
    public regis() {
        initComponents(); 
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        U_tel = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        U_address = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        U_name = new javax.swing.JTextField();
        U_age = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        U_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        jLabel3.setText("สมัครสมาชิก");

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel4.setText("เบอร์โทรศัพท์");

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel5.setText("ที่อยู่");

        U_tel.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        U_tel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                U_telFocusLost(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("ยืนยัน");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        U_address.setColumns(20);
        U_address.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        U_address.setRows(5);
        U_address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                U_addressFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(U_address);

        jLabel7.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel7.setText("ชื่อ");

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel9.setText("รหัสนักศึกษา");

        U_name.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        U_name.setToolTipText("");
        U_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                U_nameFocusLost(evt);
            }
        });

        U_age.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        U_age.setToolTipText("");
        U_age.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                U_ageFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel8.setText("อายุ");

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel1.setText("ปี");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(U_name, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(U_id))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(U_age, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(U_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jButton2)))
                        .addGap(0, 58, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(U_id, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(U_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(U_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(U_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       error = ""; 
        
        try {
           ResultSet rs = cn3().executeQuery("select * FROM user where  u_id = "+U_id.getText());
           
           if (rs.next()) 
            JOptionPane.showMessageDialog(this, "ผิดพลาด มีรหัสนักศึกษาอยู่ในระบบอยู่แล้ว","Inane warning",JOptionPane.WARNING_MESSAGE );  
           else
           {
               
                Sql("INSERT INTO `db`.`user` (`U_id`, `U_name`, `U_address`, `U_tel`, `U_age`, `U_type`) VALUES ('"+U_id.getText()+"', '"+U_name.getText()+"', '"+U_address.getText()+"', '"+U_tel.getText()+"', '"+U_age.getText()+"', 'ทั่วไป');");
      // System.out.println("INSERT INTO  `user` (`U_id`, `U_name`, `U_address`, `U_tel`, `U_age`, `U_type`)  VALUES (`"+U_id.getText()+"`, `"+U_name.getText()+"`, `"+U_address.getText()+"`, `"+U_tel.getText()+"`, `"+U_age.getText()+"`, `ทั่วไป`);");
       Page1 formPage1 = new Page1();   
            setVisible(false);
            formPage1.setVisible(true);
               
           }
           
        } catch (SQLException ex) { Logger.getLogger(regis.class.getName()).log(Level.SEVERE, null, ex);}
       
       
     
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void U_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_U_nameFocusLost
           if(!ing(U_name.getText()))
            U_name.setBackground(Color.decode(color)); 
            else
            U_name.setBackground(Color.white);  
           
    }//GEN-LAST:event_U_nameFocusLost

    private void U_telFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_U_telFocusLost
        
        if(U_tel.getText().length()<1){U_tel.setBackground(Color.white);return;}
        if(!checknumber(U_tel.getText()) || U_tel.getText().length()<9||U_tel.getText().length()>11) 
            U_tel.setBackground(Color.decode(color)); 
            else
            U_tel.setBackground(Color.white);  
             
    }//GEN-LAST:event_U_telFocusLost

    private void U_addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_U_addressFocusLost
         if(U_address.getText().length()>0 && U_address.getText().length()<5) 
            U_address.setBackground(Color.decode(color)); 
            else
            U_address.setBackground(Color.white);  
          
    }//GEN-LAST:event_U_addressFocusLost

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    private void U_ageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_U_ageFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_U_ageFocusLost
 
 
    public static void main(String args[]) { 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regis().setVisible(true);
            }
        });
    }

    void alert(String x){
        JOptionPane.showMessageDialog(this, x ,"Inane warning",JOptionPane.WARNING_MESSAGE ); 
    }
    
      boolean checknumber(String x){ //ตัวเลขเท่านั้น
        int i ; 
        try { i = Integer.parseInt(x); } 
        catch (NumberFormatException e) { return false; }  
        return true;
    }
      boolean ing(String val){
         String e="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";      
         boolean valOK = true;
         int i ;
         for (i=0; i<val.length() & valOK; i++){
         valOK = (e.indexOf(val.charAt(i))!= -1);
          }
        return valOK;
      }
      
      boolean noint(String val){
         String e="1234567890";      
         boolean valOK = false;
         int i ;
         for (i=0; i<val.length() & !valOK; i++){
         valOK = (e.indexOf(val.charAt(i))!= -1);
          }
        return valOK;
      }
      
      
      boolean checklength(String x , int i){ //ตัวเลข i ตัวเท่านั้น
        if(x.length()!=i || !checknumber(x))
            return false;
        else
            return true;
    }  
    String gender;
    String error ; 
    String color = "#FF3030";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea U_address;
    private javax.swing.JTextField U_age;
    private javax.swing.JTextField U_id;
    private javax.swing.JTextField U_name;
    private javax.swing.JTextField U_tel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
