import java.util.*;

public class HomeWork_399_11 {

    public static void main(String[] args) {

        Random r = new Random();

        int num = r.nextInt(1000);

        do {
            System.out.println("Random number: " + num);
            num = r.nextInt(1000);
        } while (num < 900);
        System.out.println("Random number: " + num);
    }

}