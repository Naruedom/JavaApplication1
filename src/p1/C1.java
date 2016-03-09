
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(444, 222, 0, 0));
        setResizable(false);

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

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel1.setText("ID ");

        jLabel2.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel2.setText("Employee : xxxxxxxx");

        jLabel3.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        jLabel3.setText("ระบบชำระเงิน");

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel4.setText("ชื่อ");

        jTextField2.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel5.setText("อายุ");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCheckBox1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jCheckBox1.setText("สมาชิก");
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

        jComboBox1.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "เข้าใช้บริการสระนํ้า", "ค่าคอร์สเรียนว่ายนํ้า" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel6.setText("รายการชำระเงิน : ");

        jLabel7.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel7.setText("ปี");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel7)))
                        .addGap(10, 10, 10)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextField3)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox1)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         
        String input = jTextField1.getText();
        String input2= jTextField2.getText();
        String input3= jTextField3.getText();
        
        if(Check){ //สมาชิก
            
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
        
            
            
      
            
            C2 form2 = new C2();  
            try {  
                form2.setLinkObj(jTextField1,0,jComboBox1.getSelectedItem().toString());
            } catch (SQLException ex) {
                Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);
            //form2.setDefaultCloseOperation(C1.HIDE_ON_CLOSE); 
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
