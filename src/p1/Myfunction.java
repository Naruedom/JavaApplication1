package p1; 

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Myfunction {
    
     static  Date todate(String x){  
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
         Date BD = null;
         try { BD = df.parse(x); } 
            catch (ParseException e) { e.printStackTrace(); } 
      return BD;
    }
    
    static Date getToday(){
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
        return Calendar.getInstance().getTime();  
    }
    
}
