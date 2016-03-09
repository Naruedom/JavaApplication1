
package p1;
 
import  java.sql.*;    
import static p1.cnn.cn;

public class show {
     public static void main(String[] args) {
         
        /*   
          Insert("INSERT INTO `db`.`bill` (`B_id`, `U_id`, `S_id`, `B_money`, `B_type`, `B_date`, `B_name`) VALUES "
                    + "(NULL,'1','2','50' , 'card', '1/1/1', 'ใช้บริการสระน้ำ');");
           }*/
      try {   
            
            ResultSet rs = cn().executeQuery("SELECT * FROM user"); 
            
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