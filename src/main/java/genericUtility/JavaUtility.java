package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;



/**
 * This is an utility class which stores the functionality from java Library.
 * @author SANIYA ANJUM
 * @version 26-03-25
 */


public class JavaUtility {
	/**
	 * This is generic method to generate random number
	 * @param pattern
	 * @return
	 */
	
	
   public String getCalenderDetails(String pattern) {
	   Calendar cal= Calendar.getInstance();
	   Date d=cal.getTime();
	   SimpleDateFormat sdf=new SimpleDateFormat(pattern);
	   String value =sdf.format(d);
	   return value;
	   
	   
	   
   }

   
   /**
    * This is the generic method to generate random number
    * @param bound
    * @return
    */


     public int getRandomNumber(int bound) {
    	 Random r=new Random();
    	 int num=r.nextInt(bound);
    	 return num;
     }
    	 
     }
