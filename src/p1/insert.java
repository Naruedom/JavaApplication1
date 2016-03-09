
package p1;

import java.sql.*;

public class insert {
     
        public static void main(String[] args){
           try {
                Class.forName("com.mysql.jdbc.Driver");
                            //"jdbc:mysql://localhost/ชื่อดาตาเบส?useUnicode=true&characterEncoding=UTF-8"
                String host = "jdbc:mysql://localhost/db?useUnicode=true&characterEncoding=UTF-8";
                Connection conn = DriverManager.getConnection(host,"root",""); //<-- ( HOST , user , pass ) DB
                Statement stmt = conn.createStatement(); //<-- เชื่อมต่อเสร็จ
               
                //Insert
                String sql = "insert into user ( u_id , u_name , U_address , u_tel , u_type , u_age)"
                        + " values ( 11 , 'ทดสอบ' ,'dd' , '1' ,'1','1')";
                if (stmt.executeUpdate(sql) != -1)  //ถ้า insert ได้
                       System.out.println("Insert Successfully");
                 else  System.out.println("NOT OK"); 
                
           } catch (Exception e){ System.out.println("Program error"+e); }
           
           
           
           //Select
           try {   
                Class.forName("com.mysql.jdbc.Driver");
                String host = "jdbc:mysql://localhost/db?useUnicode=true&characterEncoding=UTF-8";
                Connection conn = DriverManager.getConnection(host,"root","");  
                Statement stmt = conn.createStatement();  
                
            ResultSet rs = stmt.executeQuery("SELECT * FROM user"); 
            
            while (rs.next()) {
                String name = rs.getString("u_name");
                String mail = rs.getString("u_email");
                System.out.println( name + "----" + mail ); 
             }
             
        } catch (Exception ex) { System.err.println("error conect."); }
           
    }
           
           
           
        } 