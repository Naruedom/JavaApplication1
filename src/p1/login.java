 
package p1;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static p1.cnn.cn;

public class login {
    
    String Emp = "570000103";
    String ID;
    String Name ;
    String Address;
    String Tel;
    String Status;
    String Pass;
    
    static String getid(){
    return "570000103";}

    public  String getAddress() {
        return Address;
    }
 
    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getTel() {
        return Tel;
    }

    public String getStatus() {
        return Status;
    }

    public String getPass() {
        return Pass;
    }
    
    
    

    public   login(String emp  ) throws SQLException {
        
          
            ResultSet rs = cn().executeQuery("SELECT * FROM staff where sf_id = '"+emp+"';" );  
            if (rs.next()) 
               {
                ID = emp;
                Name = rs.getString("Sf_name"); 
                Address = rs.getString("Sf_address"); 
                Tel = rs.getString("Sf_tel");  
                Status = rs.getString("Sf_status"); 
                Pass  = rs.getString("Sf_pass");
               }   
            else
            {
                
                
                ResultSet rs2 = cn().executeQuery("SELECT * FROM trainer where t_id = '"+emp+"';" );  
            if (rs2.next()) 
               {
                ID = emp;
                Name = rs2.getString("t_name"); 
                Address = rs2.getString("t_address"); 
                Tel = rs2.getString("t_tel");  
                //Status = rs2.getString("t_status"); 
                //Pass  = rs2.getString("t_pass");
               }   
                
                
                
            }
                
                
            
            
            
    }
    
    
    
    
    static String EmpName(){
        
          try {   
            Connection cnn =  DriverManager.getConnection("jdbc:mysql://localhost/db","root","");  
            Statement stmt = cnn.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT * FROM staff"); 
            String name = null ;
            while (rs.next()) {
                name = rs.getString("Sf_name");
                //String mail = rs.getString("u_email");
           //     System.out.println(name );  //หลังstart1
             }
             return name;
             
        } catch (Exception ex) {
            System.err.println("error conect.");
            return "not conect.";
        }
          
    }
    
    
   
}
