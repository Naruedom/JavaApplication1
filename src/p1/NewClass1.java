package p1;
 
import  java.sql.*;   
  
public class NewClass1 {
     public static void main(String[] args) {
        try {   
            Connection cnn =  DriverManager.getConnection("jdbc:mysql://localhost/db","root","");  
            Statement stmt = cnn.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT * FROM user"); 
            
            while (rs.next()) {
                String name = rs.getString("u_name");
                //String mail = rs.getString("u_email");
                System.out.println(name ); 
             }
             
        } catch (Exception ex) {
            System.err.println("error conect.");
        }
    }
}