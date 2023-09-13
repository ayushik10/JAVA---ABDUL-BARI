import java.time.*;

public class ZonedDateTimeDemo 
{
    public static void main(String[] args) 
    {
       //ZonedDateTime zdt = ZonedDateTime.now();
       ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); 
       System.out.println(zdt);

       MonthDay md = MonthDay.now(); 

       Period p = Period.of(2, 2, 10);
       System.out.println(p.addTo(LocalDate.now()));

       Instant i =Instant.now();
       System.out.println(i);
    }
}
