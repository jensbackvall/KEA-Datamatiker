import java.util.*;
import java.math.*;

public class HomeWork_399_11 {

    public static void main(String[] args) {

        //Random r = new Random();

        //int num = r.nextInt(1000);
       /* 
        do {
            System.out.println("Random number: " + num);
            num = r.nextInt(1000);
        } while (num < 900);
        System.out.println("Random number: " + num); */
        
        double sum = 0;
        double num2 = 0;
        for (int i = 0; i < 64; i++) {
           num2 = Math.pow(2, i);
           sum = sum + num2;
        }
        System.out.println(sum);
    }
}