import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class calenderclass {
    public static void main(String[]args)
    {
       Calendar ronak= Calendar.getInstance();
    System.out.println(ronak.getCalendarType());
       // Calendar ronak= Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        //System.out.println(ronak.getCalendarType());
        //System.out.println(ronak.getTimeZone().getID());
        System.out.println(ronak.get(Calendar.HOUR_OF_DAY)+":"+ronak.get(Calendar.MINUTE)+":"+ronak.get(Calendar.SECOND)+":"+ronak.get(Calendar.MILLISECOND));
        GregorianCalendar meet=new GregorianCalendar();
        System.out.println(meet.isLeapYear(2020));
        System.out.println(TimeZone.getAvailableIDs()[5]);
        System.out.println(TimeZone.getDefault());
    


    }
    
}
