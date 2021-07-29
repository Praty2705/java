import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
public class newJavaFile {
static String S ="";
    public static void main(String args[]) 
    {
       Scanner myObj = new Scanner(System.in);  
       for(int i=0;i<6;i++)
       {
           S = myObj.nextLine();
           S = S+",";
       }
        Date date=new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(int(S));
        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
        System.out.println("Day of week in text:"+dayWeekText);
    }
}
