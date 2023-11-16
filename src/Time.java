import java.util.Date;

public class Time {
    public static void main(String args[]) {
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.toString());
        date.setTime(10983);
        System.out.println(date.toString());
    }

}
