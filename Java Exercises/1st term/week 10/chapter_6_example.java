import java.io.*;
import java.util.*;

public class chapter_6_example {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("numbers.dat"));

        double sum = 0.0;
        // for (int i = 1; i <= 7 ; i++) {
        //     double next = input.nextDouble();
        //     System.out.println("number " + i + " = " + next);
        //     sum += next;
        // }
        int count = 0;
        while (input.hasNextDouble()) {
            double next = input.nextDouble();
            count++;
            System.out.println("number " + count + " = " + next);
            sum += next;
        }
        System.out.println("Sum = " + sum);
    }
}
