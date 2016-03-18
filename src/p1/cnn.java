package p1; 
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;    
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class cnn  { 
    
    static String host = "jdbc:mysql://192.168.1.24/db?useUnicode=true&characterEncoding=UTF-8"; 
  // static String host = "jdbc:mysql://localhost/db?useUnicode=true&characterEncoding=UTF-8"; 
     public static void main(String[] a) throws SQLException{
         
       //  Sql3("UPDATE `staff` SET `Sf_name` = '1', `Sf_address` = '1', `Sf_status` = '5', `sf_pass` = '1' WHERE  `Sf_id` = '1';");
          
          try {  
            ResultSet rs = cn3().executeQuery("SELECT * FROM staff");  
            while (rs.next()) {
                String name = rs.getString("sf_name"); 
                System.out.println(name+"-" ); 
             } 
        } catch (Exception ex) { System.err.println("error conect."); }        
        }///////////////////////////////////////////////////////      
         public static Statement  root() throws SQLException {  //root 
            Connection cnn = DriverManager.getConnection(host,"root",""); 
            Statement stmt = cnn.createStatement(); 
            return stmt; 
        } 
     
     public static Statement  cn() throws SQLException {  //information
            Connection cnn = DriverManager.getConnection(host,"infor","1234"); 
            Statement stmt = cnn.createStatement(); 
            return stmt; 
        } 
     
          public static Statement  cn2() throws SQLException { //cash 
            Connection cnn = DriverManager.getConnection(host,"cash","1234"); 
            Statement stmt = cnn.createStatement(); 
            return stmt; 
        }  
             public static Statement  cn3() throws SQLException { //admin 
            Connection cnn = DriverManager.getConnection(host,"admins","1234"); 
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

    

    
     
}


