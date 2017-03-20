import java.io.*;
import java.util.*;

public class chapter_6_example_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("hours.dat"));
        while (input.hasNextLine()) {
            String text = input.nextLine();
            processLine(text);
        }
    }

    public static void processLine(String text) {
        Scanner data = new Scanner(text);
        int id = data.nextInt();
        String name = data.next();
        double sum = 0.0;
        while (data.hasNextDouble()) {
            sum += data.nextDouble();
        }
        System.out.println("Total hours worked by " + name + ("(id#" + id + ") = " + sum));
    }
}