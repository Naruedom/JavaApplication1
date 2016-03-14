
package p1;
 
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import static p1.cnn.cn;


public class Profile extends javax.swing.JFrame {


    public Profile() {
        initComponents();
         setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        //start();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldtel = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextFieldname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        datetext = new datechooser.beans.DateChooserCombo();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("สมาชิก ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 197, -1, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("เบอร์โทร ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 256, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("ชื่อ          ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 91, -1, -1));

        jLabel8.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel8.setText("วันเกิด");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("ข้อมูลสมาชิก");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTextFieldtel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 199, 34));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ทั่วไป", "รายปี" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 199, -1));

        jTextFieldname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 199, 34));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 180, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 100, 40));

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
    getContentPane().add(datetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 200, 30));

    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/bgin.jpg"))); // NOI18N
    jLabel4.setText("jLabel1");
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, -220, -1, -1));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnameActionPerformed

    private void jTextFieldtelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtelActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
        
        name = jTextFieldname.getText();
        bd = datetext.getText();
        System.out.println("-"+bd);
        type = (String) jComboBox1.getSelectedItem();
        tel = jTextFieldtel.getText();
        try { 
            
        String sql  = "update user set U_name='"+name+"' ,U_birth='"+bd+"', "
                + "U_type= '"+type+"' ,U_tel= '"+tel+"'  where U_id='"+uuid+"'";
        cn().executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            C2 form1 = new C2(); 
            JOptionPane.showMessageDialog(null,
		"ข้อมูลถูกแก้ไขแล้ว");
            this.dispose();
            //setVisible(false);
           // form1.setVisible(true);   
            
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
 
            this.dispose(); 
    }//GEN-LAST:event_jButton2MouseClicked
 
    public static void main(String args[]) { 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }
    
    public void setLinkObj(String x){
        uuid = x;
        System.out.print(uuid);
        
        try {   
          
            ResultSet rs = cn().executeQuery("SELECT * FROM user where u_id="+uuid); 
            
            if (rs.next()) {
                 name = rs.getString("u_name");
                 tel  = rs.getString("u_tel");
                 //age  = rs.getString("u_age");
                 bd =  rs.getString("u_birth");
                 type = rs.getString("u_type");
                 datetext.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
                 datetext.setText(bd);
                 //System.out.println(name ); 
             }
             
        } catch (Exception ex) {
            System.out.println("error conect.");
        }   
    jTextFieldname.setText(name);
   // jTextFieldage.setText(age);
    jTextFieldtel.setText(tel);
    jComboBox1.setSelectedItem(type);
    
    }
    

    String name , bd , tel , type ;
    String uuid ;//= "000000001";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo datetext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JTextField jTextFieldtel;
    // End of variables declaration//GEN-END:variables
}
