import java.util.*;

public class HomeWork_408_11 {

    public static void main(String[] args) {
        twoOdds();
    }

    public static void twoOdds() {
        Random r = new Random();
        int num = 0;
        String what = "";
        boolean odds = false;

        while (odds == false) {
            num = r.nextInt(99);
            if (num % 2 == 0) {
                System.out.print(num + "-Even ");
                what = "even";
            } else {
                System.out.print(num + "-Odd ");
                if (what.equals("odd")) {
                    System.out.println();
                    System.out.println("Two odd numbers in a row!");
                    odds = true;
                }
                what = "odd";
            }
        }
    }
}