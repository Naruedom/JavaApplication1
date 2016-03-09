 
package p1;
 
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import static p1.Function.checknumber; 
import static p1.cnn.Sql2;
 
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
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel2.setText("Employee : xxxxxxxx");

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

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel1.setText("General");

        jLabel3.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel3.setText("Pay    :");

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel4.setText("ชำระเงิน");

        jComboBox1.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Card" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel5.setText("Name :");

        jLabel6.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel6.setText("การชำระเงิน  :");

        jButton2.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jButton3.setText("แก้ไขข้อมูล");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel7.setText("ประเภทรายการ : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(34, 34, 34)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

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

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String input = userid;
       
            try {
                ResultSet rs = cn2().executeQuery("SELECT * FROM user where u_id = " + input);

                if(!rs.next()){
                    JOptionPane.showMessageDialog(this, "No data found.","Inane warning",JOptionPane.WARNING_MESSAGE );
                    return ;
                }
            } catch (Exception ex) { System.out.println("excep error.");  return; }

            Profile Pro = new Profile();
            Pro.setLinkObj(userid);
            setVisible(false);
            //form2.setDefaultCloseOperation(C1.HIDE_ON_CLOSE);
            Pro.setVisible(true);
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
                       Age  = rs2.getString("u_age");
                       User = rs2.getString("u_type");
                age = Integer.parseInt(rs2.getString("u_age"));
                
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
    
            if ( member&&(z == PC)){
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
            if ( member&&(z == IC)){
                 BName = "เข้าเรียนคอร์สว่ายน้ำ";
                 jLabel5.setText( "( สมาชิกทั่วไป )");
              
                 jLabel5.setText("( "+User+" )"); 
                 money = "0" ;
                 jLabel3.setText("ค่าบริการ : "+money +" บาท");
               
               
                ResultSet rs4 = cn2().executeQuery("SELECT u_id FROM register where u_id = " + userid);
                if (rs4.next()){ 
           /*     try {
                ResultSet rsCheakTimeIn = cn().executeQuery("SELECT s_time_start  FROM study where r_id = (SELECT r_id  FROM register where u_id =)" + userid);
                if (rsCheakTimeIn.next()){ CheakTimeIn = rsCheakTimeIn.getString("S_Time_Start"); }
                    System.out.print("CheakTimeIn ="+CheakTimeIn);
                } catch (Exception e) {
                    System.out.print(CheakTimeIn);
                    System.out.print("CheakTimeIn =error");
                }
          
                try {
                 ResultSet rsCheakTimeout = cn().executeQuery("SELECT s_time_end  FROM study where s_id = (SELECT s_id  FROM register where u_id =)" + userid);
                 if (rsCheakTimeout.next()){ CheakTimeout = rsCheakTimeout.getString("S_Time_End"); }            
                System.out.print("CheakTimeout ="+CheakTimeout);
                } catch (Exception e) {
                    System.out.print(CheakTimeout);
                    System.out.print("CheakTimeout =error");
                }
          */
                  
               
         ResultSet rs5 = cn2().executeQuery("SELECT r_id  FROM register where u_id = " + userid);
         if (rs5.next()){  rid = rs5.getString("R_ID"); } 
         ResultSet rs6 = cn2().executeQuery("SELECT T_id  FROM trainer where T_id = '571000001'");
         if (rs6.next()){  tid = rs6.getString("T_ID");  }     
      //      String aa = login.EmpName();
         ResultSet rs7 = cn2().executeQuery("SELECT Sf_id  FROM staff where Sf_name = 'นายสมชาย มงคล'");
         if (rs7.next()){  sfid = rs7.getString("Sf_id");} 
         //System.out.print(statusInclss+rid+tid+sfid);
         
         try {    
         ResultSet rsTR = cn2().executeQuery("SELECT r_id  FROM study where r_id =(select r_id FROM register where u_id = "+userid+"  ;);");
        
         if (rsTR.next()){rid2 = rsTR.getString("R_ID"); }
         ResultSet rsTR2 = cn2().executeQuery("select r_id FROM register where u_id = "+userid);
         if (rsTR2.next()){rid3 = rsTR2.getString("R_ID");}
         ResultSet CHs = cn2().executeQuery("select s_id FROM study where r_id = "+rid3);
         if (CHs.next()){chs = CHs.getString("S_ID");}
         
   //      if(rid2 == null&&CheakTimeIn==null){  //  if(rid2 == null ? rid3 != null : !rid2.equals(rid3)){
   //          Insert("INSERT INTO `db`.`study` (`R_id`, `T_id`, `Sf_id`, `S_Time_Start`) VALUES "
      //              + "( '"+rid+"','"+tid+"','"+sfid+"' , '"+data2+"',  );");}
   //      if (CheakTimeout!=null&&CheakTimeout==null){
      //   }
         
         
         
          /*   if (rsTR.next()){  rid2 = rsTR.getString("R_ID");    
              theQuery("UPDATE `study` SET `S_Time_End` = '' WHERE `study`.`R_ID` ="+ rid+"  ;);");}  */
      //      Insert("UPDATE `study` SET `S_Time_End` = '' WHERE `study`.`R_ID` ="+ rid+"  ;);");
                  }  catch (Exception e) {System.out.print("rsTR.next=error");}
          } 
       //  if(rid2==""){
                 Sql2("INSERT INTO `db`.`study` (`R_id`, `T_id`, `Sf_id`, `S_Time_Start`,`S_Time_End`) VALUES "
                    + "( '"+rid+"','"+tid+"','"+sfid+"' , '"+data2+"', '' );");}
        //   } 
          
               else {
            //   JOptionPane.showMessageDialog(this, " คุณยังไม่ได้สมัครเรียนคอร์สว่ายน้ำ ","Warning",JOptionPane.ERROR_MESSAGE );
               
            }
            
            if(!member){
                jButton3.setVisible(false);
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
        public int statusInclss ;
        String  rid = "";
        String rid2;
        String rid3,chs;
        String  tid = "";
        String  sfid= "";
        String CheakTimeout;
        String CheakTimeIn;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    private void theQuery(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
