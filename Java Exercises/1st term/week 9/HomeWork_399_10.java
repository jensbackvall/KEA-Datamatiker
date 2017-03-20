import java.util.*;

public class HomeWork_399_10 {

    public static void main(String[] args) {
        zeroDigits(4093759);
        System.out.println("The above should be 1");
        zeroDigits(1000000000);
        System.out.println("The above should be 9");
        zeroDigits(850109506);
        System.out.println("The above should be 3");
        zeroDigits(123456789);
        System.out.println("The above should be 0");
        zeroDigits(1000);
        System.out.println("The above should be 3");
    }

    public static void zeroDigits(int i) {
        int count = 0;
        do {
            if (i % 10 == 0) {
                count++;
            }
            i = i / 10;
        } while (i > 1);
        System.out.println(count);
    }
}