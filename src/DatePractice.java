import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class DatePractice {
    public static void main(String args[]){
        //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDate = new SimpleDateFormat("hh:mm:ss");
        System.out.println(simpleDate.format(date));

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(date));

        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWeekFormat.format(date));

        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(date));

        LocalDate today = LocalDate.now();
        LocalDate findDate = LocalDate.of(2023, 12, 25);
        int days = Period.between(today, findDate).getDays();
        System.out.println(days);

    }
}
