 package p1;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import static p1.Function.checknumber;
import static p1.Myfunction.getToday;
import static p1.Myfunction.todate;
import static p1.cnn.Sql;
import static p1.cnn.cn3;

 
public class regis extends javax.swing.JFrame {

 
   
    
    public regis() {
        initComponents(); 
        U_address.setLineWrap(true); 
        
         datetext.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
       // String bd = datetext.getText();
         
        
         /*
   
    int  ot = getToday().getYear() -  todate(bd).getYear() ;
     
        System.out.println("OUTput :"+ot);
                */
        //System.out.println("-"+s+"-");
        // DateFormat  s= datetext.getDateFormat();
       
         //      System.out.println( datetext.getText() );
        /*DateFormat df = new SimpleDateFormat("yyyy-dd-MM"); 
         Date today = Calendar.getInstance().getTime();         
        String output = df.format(today);
        System.out.println("Report Date: " + output);
*/ 
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        calendarUtils1 = new org.jdesktop.swingx.calendar.CalendarUtils();
        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
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
        jLabel8 = new javax.swing.JLabel();
        U_id = new javax.swing.JTextField();
        datetext = new datechooser.beans.DateChooserCombo();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        jLabel3.setText("สมัครสมาชิก");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel4.setText("เบอร์โทรศัพท์");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 192, -1, -1));

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel5.setText("ที่อยู่");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 238, -1, -1));

        U_tel.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        U_tel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                U_telFocusLost(evt);
            }
        });
        getContentPane().add(U_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 192, 200, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 357, 114, 41));

        U_address.setColumns(20);
        U_address.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        U_address.setRows(5);
        U_address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                U_addressFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(U_address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 238, 200, 85));

        jLabel7.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel7.setText("ชื่อ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 116, -1, -1));

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel9.setText("รหัสนักศึกษา");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 73, -1, -1));

        U_name.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        U_name.setToolTipText("");
        U_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                U_nameFocusLost(evt);
            }
        });
        getContentPane().add(U_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 112, 200, -1));

        jLabel8.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel8.setText("วันเกิด");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 153, -1, -1));

        U_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U_idActionPerformed(evt);
            }
        });
        getContentPane().add(U_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 75, 200, 33));

        datetext.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    try {
        datetext.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(1994, 2, 19),
            new java.util.GregorianCalendar(1994, 2, 19))));
} catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
    e1.printStackTrace();
    }
    datetext.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 17));
    datetext.setLocale(new java.util.Locale("th", "", ""));
    datetext.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 16));
    datetext.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
    getContentPane().add(datetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 161, 200, -1));

    jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton3.setText("ยกเลิก");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
        }
    });
    getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 357, -1, 41));

    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/bgin.jpg"))); // NOI18N
    jLabel1.setText("jLabel1");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, -220, -1, -1));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 440));

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       error = ""; 
        
        String UID   = U_id     .getText();
        String Uad   = U_address.getText();
        String Uname = U_name   .getText();
        String Utel  = U_tel    .getText();
       
       if(UID.length() == 0 || Uad.length() == 0 || Uname.length() == 0 || Utel.length() == 0){
            JOptionPane.showMessageDialog(this, "ยังกรอกข้อมูลไม่ครบ","Inane warning",JOptionPane.WARNING_MESSAGE );  
          
           return;
       }
        
        try {
           ResultSet rs = cn3().executeQuery("select * FROM user where  u_id = "+U_id.getText());
           
           if (rs.next()) 
            JOptionPane.showMessageDialog(this, "ผิดพลาด มีรหัสนักศึกษาอยู่ในระบบอยู่แล้ว","Inane warning",JOptionPane.WARNING_MESSAGE );  
           else
           {
               
               
           Sql("INSERT INTO  `user` (`U_id`, `U_name`, `U_address`, `U_tel`, `U_birth`, `U_type`) VALUES ('"+U_id.getText()+"', '"+U_name.getText()+"', '"+U_address.getText()+"', '"+U_tel.getText()+"', '"+datetext.getText()+"', 'ทั่วไป')");
           
           //System.out.println("INSERT INTO `db`.`user` (`U_id`, `U_name`, `U_address`, `U_tel`, `U_birth`, `U_type`) VALUES ('"+U_id.getText()+"', '"+U_name.getText()+"', '"+U_address.getText()+"', '"+U_tel.getText()+"', '"+datetext.getText()+"', 'ทั่วไป');");
           
           JOptionPane.showMessageDialog(null,"เพิ่มข้อมูลเรียบร้อยแล้ว");
           this.dispose();
           }
           
        } catch (SQLException ex) { Logger.getLogger(regis.class.getName()).log(Level.SEVERE, null, ex);}
       
       
     
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void U_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_U_nameFocusLost
        
           
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

    private void U_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_U_idActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
 
 
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
    private javax.swing.JTextField U_id;
    private javax.swing.JTextField U_name;
    private javax.swing.JTextField U_tel;
    private javax.swing.ButtonGroup buttonGroup1;
    private org.jdesktop.swingx.calendar.CalendarUtils calendarUtils1;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserCombo datetext;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
