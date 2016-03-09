package p1; 
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class cnn  { 
    
     
    
     public static Statement  cn() throws SQLException {  //i
            String host = "jdbc:mysql://localhost/db?useUnicode=true&characterEncoding=UTF-8"; 
            Connection cnn = DriverManager.getConnection(host,"root",""); 
            Statement stmt = cnn.createStatement(); 
            return stmt; 
        }  
          public static Statement  cn2() throws SQLException { //c
            String host = "jdbc:mysql://localhost/db?useUnicode=true&characterEncoding=UTF-8"; 
            Connection cnn = DriverManager.getConnection(host,"root",""); 
            Statement stmt = cnn.createStatement(); 
            return stmt; 
        }  
             public static Statement  cn3() throws SQLException { //a
            String host = "jdbc:mysql://localhost/db?useUnicode=true&characterEncoding=UTF-8"; 
            Connection cnn = DriverManager.getConnection(host,"root",""); 
            Statement stmt = cnn.createStatement(); 
            return stmt; 
        } 
      
     public static  void Sql(String x) {
        try {  cn().executeUpdate(x);      
             } catch (Exception ex) { System.out.println("Insert Error."); } }    
     
     public static  void Sql2(String x) {
        try {  cn2().executeUpdate(x);      
             } catch (Exception ex) { System.out.println("Insert Error."); } }    
          
     public static  void Sql3(String x) {
        try {  cn3().executeUpdate(x);      
             } catch (Exception ex) { System.out.println("Insert Error."); } }    

     public static  ResultSet Select(String x) throws SQLException {
          return cn().executeQuery(x); 
     }

     public static void main(String[] a) throws SQLException{
         
         /*  try {   
            
            ResultSet rs = cn().executeQuery("SELECT * FROM staff");  
            while (rs.next()) {
                String name = rs.getString("sf_name");
                //String mail = rs.getString("u_email");
                System.out.println(name ); 
             }
             
        } catch (Exception ex) {
            System.err.println("error conect.");
       }*/
         
           Sql("UPDATE `register` SET `R_hour` = (SELECT ADDTIME( '10:00:10', '-00:00:09' )) WHERE `u_id` = '564259130';");
   
     }

    
     
}


