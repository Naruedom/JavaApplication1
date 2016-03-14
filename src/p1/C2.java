 
package p1;
 
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import static p1.Function.checknumber; 
import static p1.Myfunction.getToday;
import static p1.Myfunction.todate;
import static p1.cnn.Sql2;
import static p1.cnn.cn;
 
import static p1.cnn.cn2;
 
public class C2 extends javax.swing.JFrame {
 
    public C2() {
        initComponents();
        jLabel2.setText("พนักงาน : "+ login.EmpName()); 
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel2.setText("Employee : xxxxxxxx");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, -1));

        jButton1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jButton1.setText("OK");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 342, 73, -1));

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel1.setText("General");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, -1, -1));

        jLabel3.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel3.setText("Pay    :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, -1, -1));

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel4.setText("ชำระเงิน");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 11, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 278, 231, 28));

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel5.setText("Name :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, -1, -1));

        jLabel6.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel6.setText("การชำระเงิน  :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 278, -1, -1));

        jButton2.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 342, -1, -1));

        jLabel7.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel7.setText("ประเภทรายการ : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/img/bgin.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-460, -40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 410, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

 
         
            String uid = userid;
            String sid = login.getid();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance(); 
            String data = dateFormat.format(cal.getTime()); 
            String type = "-";//jComboBox1.getSelectedItem().toString();
            
            if(!"Yearly".equals(User)){type = jComboBox1.getSelectedItem().toString();} 
            String Emp  =  login.EmpName();
            Sql2("INSERT INTO `bill` ( `U_id`, `Sf_id`, `B_money`, `B_type`, `B_date`, `B_name`) VALUES "
                    + "( '"+uid+"','"+sid+"','"+money+"' , '"+type+"', '"+data+"', '"+BName+"');");//'"+data+"'
              
            // System.out.println("Save to DB : "+dateFormat.format(cal.getTime()));
               System.out.println("Save to DB : "+data);
            C1 form1 = new C1();   
            setVisible(false);
            JOptionPane.showMessageDialog(this, 
                                "\nชื่อ       : "+name
                            + "\n\nอายุ      : "+Age+ " ปี"
                            + "\n\n"+BName
                            + "\n\nสถานะ    : "+User
                            + "\n\nค่าบริการ  : "+money+ " บาท"
                            + "\n\nชำระเงินโดย: "+type 
                            + "\n\n\nพนักงานชำระบิล :"+Emp
                            + "\n","Bill",JOptionPane.NO_OPTION );
            //form2.setDefaultCloseOperation(C1.HIDE_ON_CLOSE); 
            form1.setVisible(true);
             

         
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        C1 form1 = new C1();
        this.dispose();
        //setVisible(false);
        form1.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C2().setVisible(true);
            }
        });
    }

 
        public void setLinkObj(javax.swing.JTextField x,int y,String z) throws SQLException{
             DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
             Calendar cal2 = Calendar.getInstance(); 
          String data2 = dateFormat.format(cal2.getTime()); 
            
            String str = jLabel7.getText() +" "+z;
            String PC = "ค่าคอร์สเรียนว่ายนํ้า";
            String IC = "เข้าเรียนคอร์สว่ายน้ำ";
            jLabel7.setText(str);
            
            
            userid = x.getText();
   //         System.out.println(userid);
            if(checknumber(userid)){
             member = true;   
           
             try {   
             ResultSet rs2 = cn2().executeQuery("SELECT * FROM user where u_id = " + userid ); 
             
             while(rs2.next()) {
                       name = rs2.getString("u_name"); 
                       //Age  = rs2.getString("u_age");
                       User = rs2.getString("u_type");
                       // age = rs2.getInt("u_age") ;
                        BD  = rs2.getString("U_birth") ;
                     
                        age  = getToday().getYear() -  todate(BD).getYear() ;
                        Age  = ""+age;
                        
                jLabel1.setText(  "ชื่อ :" + name);
             //   System.out.print(age);
                
          //-------------------------------------------------------//      
                
                 
             }     
             jLabel5.setText( "( สมาชิกทั่วไป )");
             BName = "ใช้บริการสระน้ำ";
             
             
             if("รายปี".equals(User))
             {
                 money = "0" ;
                 jLabel5.setText("( สมาชิกรายปี )");
                 jComboBox1.disable();
                 jComboBox1.setSelectedItem("-");
                 User="สมาชิก "+User;
             }
             else if(age > 12)
                 money = "20" ;
             else 
                 money = "10" ;
             
              jLabel3.setText("ค่าบริการ : "+money +" บาท");
             
        } catch (Exception ex) { System.out.println("excep error."); }
             
            }
            
             else  if(!checknumber(userid)){//ถ้าไม่ใช่สมาชิก
             member = true; 
             BName = "ใช้บริการสระน้ำ";
            {   
                member = false;
                User = "ไม่เป็นสมาชิก";
                 int age = y ;  
                 Age = age+"";
                jLabel1.setText(  "ชื่อ :" + userid);
                name = userid;
                
              
             jLabel5.setText( "( สมาชิกทั่วไป )");
              
                 jLabel5.setText("( "+User+" )"); 
             if(age > 12)
                 money = "50" ;
             else 
                 money = "30" ;
             
              jLabel3.setText("ค่าบริการ : "+money +" บาท");
              
            }}
    
            ResultSet CheckRegisC = cn().executeQuery("SELECT R_ID FROM register where u_id = "+userid);
            if(CheckRegisC.next()){
            checkRegisC = CheckRegisC.getString("R_ID");
            }
            if ( member&&(z == PC)){
                if (checkRegisC!=null){
                 BName = "ค่าคอร์สเรียนว่ายน้ำ";
          //    int age = 20; //ต้องดึงจากดีบี
           
                 jLabel5.setText( "( สมาชิกทั่วไป )");
              
                 jLabel5.setText("( "+User+" )"); 
             if(age > 12){
                 money = "1000" ;}
             else {
                 money = "800" ;}
             
             
              jLabel3.setText("ค่าบริการ : "+money +" บาท");
                }
                else if(checkRegisC==null){
            JOptionPane.showMessageDialog(this, " ชื่อผู้ใช้นี้ยังไม่ได้สมัครเรียนคอร์สว่ายน้ำ กรุณาทำการสมัครเรียนคอร์สว่ายน้ำก่อน  ","Warning",JOptionPane.ERROR_MESSAGE ); 
            }
   
            }
      
            if(!member){ 
                //jButton4.setVisible(false);
            }
            
    }   
        String userid  ;
        String name ;
        String Age ;
        String money;
        String User ;
        String TypePay;
        public String BName;
        boolean member;
        private javax.swing.JTextField txtObjectB;
        private javax.swing.JList ListB;
        public int age = 0 ;  
        public String  BD = null ;
        public int statusInclss ;
        String  rid = "";
        String rid2;
        String rid3,chs;
        String  tid = "";
        String  sfid= "";
        String CheakTimeout;
        String CheakTimeIn;
        String checkRegisC;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void theQuery(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
