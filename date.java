//Write a java program to  display the system date and time in various format
import java.util.Date;
import java.text.SimpleDateFormat;
public class date {

	public static void main(String[] args) {
     Date date=new Date();
     SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
     String strDate=formatter.format(date);
     System.out.println("Current date is:" +strDate);
      
     formatter=new SimpleDateFormat("dd-MM-yyyy");
     strDate=formatter.format(date);
     System.out.println("Current date:" +strDate);
      
     formatter=new SimpleDateFormat("EEEEEE MMMM dd yyyy");
     strDate=formatter.format(date);
     System.out.println("Current date: " +strDate);
     
     
    formatter=new SimpleDateFormat("EEE MMMM dd hh:mm:ss z yyyy");
    strDate=formatter.format(date);
    System.out.println("Current date: " +strDate);
    
    
   formatter=new SimpleDateFormat("E MMMM dd hh:mm:ss a Z");
   strDate=formatter.format(date);
   System.out.println("Current date: " +strDate);
	
   formatter=new SimpleDateFormat(" hh:mm:ss ");
   strDate=formatter.format(date);
   System.out.println("Current Time is: " +strDate);
   
   formatter=new SimpleDateFormat("w");
   strDate=formatter.format(date);
   System.out.println("Current week of the year: " +strDate);
   
   formatter=new SimpleDateFormat("W");
   strDate=formatter.format(date);
   System.out.println("Current week of Month is: " +strDate);
   
   formatter=new SimpleDateFormat("D");
   strDate=formatter.format(date);
   System.out.println("Current day of the year: " +strDate);
   
	}
}