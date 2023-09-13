import java.time.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class LocalDateTime 
{
    public static void main(String args[]) 
    {
        /*Date d = new Date();
        d.setHours(21);
        System.out.println(d);*/

       //LocalDate ld = LocalDate.now();
       //LocalDate ld = LocalDate.now(ZoneId.of("Asia/Kolkata"));
       //LocalDate ld = LocalDate.of(2020, Month.MARCH,10);
       //LocalDate ld = LocalDate.ofEpochDay(1);
       LocalDate ld = LocalDate.parse("2020-01-03");
       LocalDate ld1 = ld.plusMonths(6);
       System.out.println(ld1);

       LocalTime lt = LocalTime.now();
       System.out.println(lt);
       LocalTime lt1 = lt.minusHours(3);
       System.out.println(lt1);

    }
}
