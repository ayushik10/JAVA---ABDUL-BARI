import java.time.*;
//import java.time.format.*;
import java.time.temporal.ChronoField;

public class DateTimeFormatterDemo 
{
    public static void main(String[] args) 
    {
        ZonedDateTime dt = ZonedDateTime.now();

        //DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        //System.out.println(df.format(dt));

        System.out.println((dt.get(ChronoField.DAY_OF_MONTH)));
    }
}
