
package p1;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; 
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static p1.Bill.buildTableModel;
import static p1.Function.checkid;
import static p1.Function.checknumber;
import static p1.cnn.cn;
import static p1.cnn.cn2;

public class C1 extends javax.swing.JFrame {

    public C1() {
        initComponents();
        start();
        //this.setIconImage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(444, 222, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jButton1.setText("ชำระเงิน");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 324, -1, -1));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 199, 172, -1));

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel1.setText("ID ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 194, -1, -1));

        jLabel2.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel2.setText("Employee : xxxxxxxx");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 81, -1, -1));

        jLabel3.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        jLabel3.setText("ระบบชำระเงิน");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 11, -1, -1));

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel4.setText("ชื่อ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 256, -1, -1));

        jTextField2.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 252, 173, -1));

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel5.setText("อายุ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 252, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 255, 50, -1));

        jCheckBox1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jCheckBox1.setText("สมาชิก");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 199, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "เข้าใช้บริการสระนํ้า", "ค่าคอร์สเรียนว่ายนํ้า" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 127, 218, -1));

        jLabel6.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel6.setText("รายการชำระเงิน : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 132, -1, -1));

        jLabel7.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel7.setText("ปี");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 252, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/bg5.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setPreferredSize(new java.awt.Dimension(338, 268));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 600, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 440, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         
        String input = jTextField1.getText();
        String input2= jTextField2.getText();
        String input3= jTextField3.getText();
        combo = jComboBox1.getSelectedItem().toString();
        if(Check){ //สมาชิก
             System.out.print(combo);
             
              if (combo=="ค่าคอร์สเรียนว่ายนํ้า"){
               System.out.print(combo);
           ResultSet   rs4;
         try {
                rs4 = cn2().executeQuery("SELECT u_id FROM register where u_id = " + input);
                  if(!rs4.next()){
               JOptionPane.showMessageDialog(this, " คุณยังไม่ได้สมัครเรียนคอร์สว่ายน้ำ ","Warning",JOptionPane.WARNING_MESSAGE );
                return;
               }
            } catch (SQLException ex) {
               // Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
                 }
        
         try {
                ResultSet ChPayAgainC =cn2().executeQuery("SELECT b_id FROM bill where (b_name = 'ค่าคอร์สเรียนว่ายน้ำ') and u_id = " + input);
                if(ChPayAgainC.next()){
               JOptionPane.showMessageDialog(this, " คุณได้สมัครเรียนคอร์สว่ายน้ำและชำระเงินเรียบร้อยแล้ว ","Warning",JOptionPane.WARNING_MESSAGE );
               return;
               }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
           } 
              
              
              
         if(input.equals("")  ){
          JOptionPane.showMessageDialog(this, "กรุณากรอก ID ","Inane warning",JOptionPane.WARNING_MESSAGE ); 
          return;
         }
         
          if(  !input.equals("") && !checkid( input )  )
        {
        JOptionPane.showMessageDialog(this, "ใส่ตัวเลข 9 หลักเท่านั้น","Inane warning",JOptionPane.WARNING_MESSAGE );
        return;
        }
          
           try {   
            ResultSet rs = cn2().executeQuery("SELECT * FROM user where u_id = " + input); 
                 
            if(!rs.next()){
             JOptionPane.showMessageDialog(this, "ไม่พบข้อมูลสมาชิก.","Inane warning",JOptionPane.WARNING_MESSAGE ); 
             return ; 
                }  
        } catch (Exception ex) { System.out.println("excep error.");  return; }
           
           
           ///////
          
            
      
            
            C2 form2 = new C2();  
            try {  
                form2.setLinkObj(jTextField1,0,jComboBox1.getSelectedItem().toString());
            } catch (SQLException ex) {
                Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);
            form2.setDefaultCloseOperation(C1.HIDE_ON_CLOSE); 
            form2.setVisible(true);    
        
         }else{ //ถ้าไม่ใช่สมาชิก
            
                if(  input2.equals("")||checknumber(input2) ){
             JOptionPane.showMessageDialog(this, "กรุณา ใส่ชื่อให้ถูกต้อง","Inane warning",JOptionPane.WARNING_MESSAGE );
             return;
            }
                
            
             if(  input3.equals("")||!checknumber(input3) ){
             JOptionPane.showMessageDialog(this, "กรุณา ใส่เลขอายุให้ถูกต้อง","Inane warning",JOptionPane.WARNING_MESSAGE );
             return;
            }
             
              if(Integer.parseInt(input3)<9){
             JOptionPane.showMessageDialog(this, "ระบุอายุต่ำกว่าเกณฑ์กำหนด ( 9 ปี ) ","Inane warning",JOptionPane.WARNING_MESSAGE );
             return;   
            }
              
             
              
              
               C2 form2 = new C2();  
            try {  
                form2.setLinkObj(jTextField2  ,  Integer.parseInt(jTextField3.getText()) ,jComboBox1.getSelectedItem().toString());
            } catch (SQLException ex) {
                Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);
            //form2.setDefaultCloseOperation(C1.HIDE_ON_CLOSE); 
            form2.setVisible(true);    
            return;
             
        }
       
          
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        
     Check =  jCheckBox1.isSelected();// TODO add your handling code here:
     if(Check){ //ถ้าเป็นสมาชิก
         jTextField1.setEditable(true);
         jTextField1.setBackground( Color.WHITE );
         jTextField1.setText("");
         jTextField2.setEditable(false);
         jTextField2.setBackground( Color.LIGHT_GRAY);
         jTextField3.setEditable(false);
         jTextField3.setBackground( Color.LIGHT_GRAY );
         jComboBox1.enable();
        // jComboBox1. ให้คลิกได้
     }else{
         jTextField1.setEditable(false);
         jTextField1.setBackground( Color.LIGHT_GRAY);
         jTextField2.setEditable(true);
         jTextField2.setBackground( Color.WHITE );
         jTextField3.setEditable(true);
         jTextField3.setBackground( Color.WHITE );
         jComboBox1.disable();
         jComboBox1.setSelectedIndex(0);
        // jComboBox1. ให้คลิกไม่ได้
     }
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        
    }//GEN-LAST:event_jComboBox1MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(C1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C1().setVisible(true);
                
              
            }
            
            
        });
    }
    
      public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
 
    void start () {
          System.out.println("start1");  
          jLabel2.setText(  "พนักงาน : " + login.EmpName());
          jCheckBox1.setSelected(true);
          jTextField1.setEditable(true);
         jTextField1.setBackground( Color.WHITE );
         jTextField1.setText("");
         jTextField2.setEditable(false);
         jTextField2.setBackground( Color.LIGHT_GRAY);
         jTextField3.setEditable(false);
         jTextField3.setBackground( Color.LIGHT_GRAY );
         jComboBox1.enable();
    }
      boolean Check;
      String combo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
