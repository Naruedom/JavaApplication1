package p1;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import static p1.Bill.buildTableModel;
import static p1.Function.checkid; 
import static p1.cnn.Sql;
import static p1.cnn.cn;


/**
 *
 * @author YaneeSE
 */
public class InClass extends javax.swing.JFrame {
       DefaultTableModel model = new DefaultTableModel();;
      
 
    public InClass() throws Exception{
      
        initComponents();
         
        
        
        model.addColumn("ID");
        model.addColumn("รหัสลงทะเบียน");
        model.addColumn("รหัสผูสอน");
        model.addColumn("รหัสพนักงาน");
        model.addColumn("เวลาเข้า");
        model.addColumn("เวลาออก");
        
        try {
        ResultSet rs = cn().executeQuery("select * FROM study ");
      
        while (rs.next()){
            model.addRow(new Object[]{
                rs.getString("S_ID"),
                rs.getString("R_ID"),
                rs.getString("T_ID"),
                rs.getString("Sf_id"),
                rs.getString("S_Time_Start"),
                rs.getString("S_Time_End")});       
        }
      }   catch (Exception e) {System.out.print("error"); }
        
    jTable1.setModel(model);
}
    void  update_table(){
      try {
        ResultSet rs = cn().executeQuery("select * FROM study ");
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));  
      }   catch (Exception e) {System.out.print("error"); }
        
   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel1.setText("รหัสนักศึกษา");

        jTextField1.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jButton1.setText("เช็คชั่วโมงที่เหลือ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jButton2.setText("ลงชื่อเข้าเรียน");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jButton3.setText("ลงชื่อออก");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      if(CheckInput()) return;
       input = jTextField1.getText();
      ResultSet showHour;
           try {
               showHour = cn().executeQuery("SELECT * FROM register where u_id = "+input);
           while (showHour.next()){
                ShowAllR1 = showHour.getString("R_ID");
                ShowAllR2 = showHour.getString("U_ID");
                ShowAllR3 = showHour.getString("C_ID");
                ShowAllR4 = showHour.getString("R_hour");
             //   ShowAllR5 = showHour.getString("R_hour");
      }  } catch (SQLException ex) {  Logger.getLogger(InClass.class.getName()).log(Level.SEVERE, null, ex);   }
     
           ResultSet showUser;
           try {
               showUser = cn().executeQuery("SELECT * FROM user where u_id = "+input);
               while (showUser.next()) {
                   showUser1 = showUser.getString("U_ID");
                   showUser2 = showUser.getString("U_name");}
           } catch (SQLException ex) {      Logger.getLogger(InClass.class.getName()).log(Level.SEVERE, null, ex);     }
           try {
               ResultSet showInC = cn().executeQuery("SELECT t_name FROM trainer where t_id ="
                       + "(SELECT t_id FROM study where r_id ="
                       + "(SELECT r_id FROM register WHERE u_id = " +input +"))" );
               if( showInC.next()){  
               showTName=showInC.getString("T_Name");
               }
           } catch (SQLException ex) {
               Logger.getLogger(InClass.class.getName()).log(Level.SEVERE, null, ex);
           }
           
                    
             
           
            JOptionPane.showMessageDialog(this, 
                                "\nรหัสผู้ใช้      : "+showUser1
                            + "\n\nชื่อ     : "+ showUser2 
                                        
                            + "\n\nผู้สอน  : "+ showTName  
                            + "\n\nชั่วโมงที่เหลือ  : "+ShowAllR4  + " ชั่วโมง" 
                            + "\n","แสดงข้อมูล",JOptionPane.NO_OPTION );
      
          update_table();
          
      //  input = jTextField1.getText();
        
   
   // }  catch (SQLException ex) { Logger.getLogger(InClass.class.getName()).log(Level.SEVERE, null, ex);  }
            
    
    
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if(CheckInput()) return;
        input = jTextField1.getText();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
          Calendar cal22 = Calendar.getInstance(); 
          String data5 = dateFormat.format(cal22.getTime());
           System.out.print(input);
        try {
              ResultSet rsa1 = cn().executeQuery(
              "SELECT s_id FROM study where  S_Time_End ='' and r_id = (SELECT r_id FROM register where u_id = "+input+")");
            
                
              while(rsa1.next()){
                aa8=  rsa1.getString("S_ID");
                  //วางไว้ก่อน
             //     ResultSet    TEnd = cn().executeQuery("SELECT S_Time_End FROM study where r_id = (SELECT r_id FROM register where u_id = " + input+")");  
                    
             //     SELECT * FROM study where S_Time_End = '' and r_id = (SELECT r_id FROM register where u_id = '564259112')                  
             //SELECT s_id FROM study where S_Time_Start != '' and S_Time_End = ''  and r_id = (SELECT r_id FROM register where u_id = '564259112')    
// }
       }
              if(aa8!=null){
             
         Sql("UPDATE `study` SET `S_Time_End` = '"+data5+"' WHERE `S_ID` = "+ aa8 ); 
         jLabel2.setForeground(Color.decode("#01AE01"));
               jLabel2.setText("สมาชิกลงชื่อออกเรียบร้อยแล้ว");}
              else  if(aa8==null){
                  jLabel2.setForeground(Color.red);
               jLabel2.setText("สมาชิกไม่อยู่ในสถานะเข้าเรียน/ควรทำการลงชื่อเข้าเรียน");
              }
        } catch (Exception e) {System.out.print("ออก = error"); System.out.print(aa8);  }
        
        
        //ดึงค่า study  time_start ลบ time_start  ล่าสุดของ R-ID ปัจจุบัน  แล้วนำค่าเวลาที่ได้ลบกับค่า R_hour  จะเหลือชั่วโมงทั้งหมด
        //อัพเดท ลง R_hour
        
        System.out.println("\n input :"+input); 
        String start;
        String   end;
        String sumtime = null;
        try {
             ResultSet a = cn().executeQuery(
              "SELECT s_time_start,s_time_end FROM study where r_id = "
             +"( SELECT r_id FROM register where u_id = "+input+") order by s_id desc"); 
              if(a.next()){
                start=  a.getString("s_time_start");
                end  =  a.getString("s_time_end"); 
                sumtime = dotime(start.substring(11),"-",end.substring(11));
                System.out.println( "เวลาที่ใช้ :"+sumtime);
              }
              
              ResultSet b = cn().executeQuery(
              "SELECT * FROM register where u_id = "+input); 
              String r_hour = null;  
              if(b.next()){
                  
                r_hour =  b.getString("r_hour"); 
                 
              }
              
              //"SELECT ADDTIME( '"+r_hour+"', '-"+sumtime+"' )"
               Sql("UPDATE `register` SET `R_hour` = (SELECT ADDTIME( '"+r_hour+"', '-"+sumtime+"' )) WHERE `u_id` = '"+input+"';");
                
              update_table();
        } catch (Exception e) {
            System.out.println("error get time start2");
        }
        
     
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
          if(CheckInput()) return;
           
           
          DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
          Calendar cal2 = Calendar.getInstance(); 
          String data3 = dateFormat.format(cal2.getTime());
          input = jTextField1.getText();
        //ยังบ่เสร็จ
           
           try {
           ResultSet    rs4 = cn().executeQuery("SELECT u_id FROM register where u_id = " + input);
                 if (rs4.next()){ 
          ResultSet rs5 = cn().executeQuery("SELECT r_id  FROM register where u_id = " + input);
         if (rs5.next()){  rid = rs5.getString("R_ID"); } 
         ResultSet rs6 = cn().executeQuery("SELECT T_id  FROM trainer where T_id = '571000001'");
         if (rs6.next()){  tid = rs6.getString("T_ID");  }     
      //      String aa = login.EmpName();
         ResultSet rs7 = cn().executeQuery("SELECT Sf_id  FROM staff where Sf_name = 'นายสมชาย มงคล'");
         if (rs7.next()){  sfid = rs7.getString("Sf_id");} 
         //System.out.print(statusInclss+rid+tid+sfid);
         }
         try {
            ResultSet CHbill = cn().executeQuery("SELECT b_name from bill where b_name = 'ค่าคอร์สเรียนว่ายน้ำ' and u_id = "+input);
           if (CHbill.next()){
            checkPay = CHbill.getString("B_name");}
        } catch (SQLException ex) {
            Logger.getLogger(regisCourse.class.getName()).log(Level.SEVERE, null, ex);
        }  
                 
                 
          ResultSet    FindSIDTimeStartNonull = cn().executeQuery(
          "SELECT s_id FROM study where S_Time_Start != '' and S_Time_End = ''  "
                  + "and r_id = (SELECT r_id FROM register where u_id =" +input+")");       
           
          while (FindSIDTimeStartNonull.next()){
               Ssid = FindSIDTimeStartNonull.getString("S_ID");}
         
          if (checkPay==null){
           JOptionPane.showMessageDialog(this, " ชื่อผู้ใช้นี้ยังไม่ได้ชำระค่าเข้าเรียนคอร์ส ","Warning",JOptionPane.ERROR_MESSAGE ); 
           } 
          
          
          if (checkPay!=null){
           
          if (Ssid==null){
          Sql("INSERT INTO `db`.`study` (`R_id`, `T_id`, `Sf_id`, `S_Time_Start`,`S_Time_End`) VALUES "
                    + "( '"+rid+"','"+tid+"','"+sfid+"' , '"+data3+"', '' );"); 
           System.out.print("insert = yes");
              jLabel2.setForeground(Color.decode("#01AE01"));
              jLabel2.setText("สมาชิกอยู่ในสถานะเข้าเรียนเรียบร้อยแล้ว");}  } 
             
             else  if (Ssid!=null){
               //  JOptionPane.showMessageDialog(this, "สมาชิกอยู่ในสถานะเข้าเรียน /ควรทำการลงชื่อออกก่อน ","warning",JOptionPane.NO_OPTION );
               jLabel2.setForeground(Color.red);
               jLabel2.setText("สมาชิกอยู่ในสถานะเข้าเรียน /ควรทำการลงชื่อออกก่อน");
                 
            //หาวิธีรีเฟรชค่าด้วย มันจำค่าตอนกรอกแรกไว้
              
             } update_table();
           } catch (SQLException ex) {
               Logger.getLogger(InClass.class.getName()).log(Level.SEVERE, null, ex);
           }
                
             
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
       jLabel2.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked
 
     static String dotime(String start,String doo,String end) throws ParseException  { 
         String str1 = end;
         String str2 = start;   
         DateFormat formatter = new SimpleDateFormat("hh:mm:ss"); 
         Date date1 = (Date)formatter.parse(str1); 
         Date date2 = (Date)formatter.parse(str2); 
         long diff;
         if("+".equals(doo))
         { 
          diff =   date1.getTime() ; 
           long diffSeconds = diff / 1000;         
         long diffMinutes = diff / (60 * 1000);         
         long diffHours = diff / (60 * 60 * 1000);                      
              return diffHours +":"+ diffMinutes +":"+ diffSeconds ; 
         }
         else
         {
          diff =  date1.getTime() - date2.getTime();
         
         long diffSeconds = diff / 1000;         
         long diffMinutes = diff / (60 * 1000);         
         long diffHours = diff / (60 * 60 * 1000);                      
              return String.format("%02d", diffHours)
                      +":"+ String.format("%02d",diffMinutes)
                      +":"+ String.format("%02d",diffSeconds) ; 
         }
     }
  /*  public static void main(String args[]) throws SQLException {
         ResultSet rsm = cn().executeQuery("select * from study");
          JTable table = new JTable(buildTableModel(rsm));
          
          
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InClass().setVisible(true);
            }
        });
         
    }*/
    private boolean CheckInput(){
        input = jTextField1.getText();
     if(input.equals("")  ){
          JOptionPane.showMessageDialog(this, "กรุณากรอก ID ","Inane warning",JOptionPane.WARNING_MESSAGE ); return true;
         }
         else
          if(  !input.equals("") && !checkid( input )  )
        {
        JOptionPane.showMessageDialog(this, "ใส่ตัวเลข 9 หลักเท่านั้น","Inane warning",JOptionPane.WARNING_MESSAGE );
        return true;
        }
             else
           try {   
            ResultSet rs = cn().executeQuery("SELECT * FROM user where u_id = " + input); 
             
            if(!rs.next()){
             JOptionPane.showMessageDialog(this, "ไม่พบข้อมูลสมาชิก.","Inane warning",JOptionPane.WARNING_MESSAGE ); 
             return  true; 
                }  
        } catch (Exception ex) { System.out.println("excep error.");  return true; }
           
           ResultSet   rs4;
            try {
                rs4 = cn().executeQuery("SELECT u_id FROM register where u_id = " + input);
                  if(!rs4.next()){
               JOptionPane.showMessageDialog(this, " คุณยังไม่ได้สมัครเรียนคอร์สว่ายน้ำ ","Warning",JOptionPane.WARNING_MESSAGE );
                return true;
               }
            } catch (SQLException ex) {
               // Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
               
            }
// Logger.getLogger(C1.class.getName()).log(Level.SEVERE, null, ex);
                             
        try {
            ResultSet rs01 = cn().executeQuery("SELECT  u_id  FROM  register  where u_id = " + input);
            
            if (rs01.next()){ 
            id = rs01.getString("U_ID");
         //     JOptionPane.showMessageDialog(this, " คุณเป็นสมาชิกเรียนคอร์ส ","Warning",JOptionPane.WARNING_MESSAGE );
    
        }   else{ JOptionPane.showMessageDialog(this, " คุณไม่ได้เป็นสมาชิกของคอร์สใดๆ ","Warning",JOptionPane.WARNING_MESSAGE );  
            return true;}
        }   catch (Exception ex) {System.err.println("error conect.");}
        
        return  false;
    
    }
    String id ;
    String sid ;
    String rid = "";
    String tid ="";
    String sfid="" ;
    String ts, te;
    String input;
   String Ssid ;
    String rid2;
    String rid3;
    String chs;
    String aa8;
    String aa2;
    String aa3;
    String checkPay;
    String ShowAllR1,ShowAllR2,ShowAllR3,ShowAllR4,showUser1 ,showUser2 ;
    String ShowAllR5,showTName;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
