import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class GettingCurrentDate {

    public static String day = "";
    public static int hour = 0;
    public static DateFormat time = new SimpleDateFormat("HH:mm:ss");
    public static DateFormat date = new SimpleDateFormat("dd/MM/yy");
    public static boolean discount = false;

    public static void main(String[] args) {
       getDayTimeDate();
       discountCheck();
    }

    public static void getDayTimeDate() {
        DateFormat thisDay = new SimpleDateFormat("E");
        DateFormat thisHour = new SimpleDateFormat("HH");
        Date dateobj = new Date();
        day = thisDay.format(dateobj);
        String tempHour = thisHour.format(dateobj);
        hour = Integer.parseInt(tempHour);
        System.out.println(day);
        time = time.format(dateobj);
        System.out.println(hour);
        date = date.format(dateobj);
    }

    public static void discountCheck() {
        while (discount == false) {
            if (day == "Sun") {
                System.out.println("No discount on Sundays!");
                return;
            } else if (day == "Sat") {
                System.out.println("No discount on Saturdays!");
                return;
            }
            if (hour < 14) {
                discount = true;
                System.out.println("It's your lucky day. You get a 20% discount!!!");
                return;
            }
        }
    }
}