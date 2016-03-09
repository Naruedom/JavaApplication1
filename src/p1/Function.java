 
package p1;
  

public class Function {
    
  public static boolean checkid(String x){ //ตัวเลข 9 ตัวเท่านั้น
        if(x.length()!=9 || !checknumber(x))
            return false;
        else
            return true;
    }
    public static boolean checknumber(String x){ //ตัวเลขเท่านั้น
        int i ; 
        try { i = Integer.parseInt(x); 
         } catch (NumberFormatException e) { return false; }
        
        if(i+"" == x+"" )
            return false;
        else
            return true;
    }
    

}
