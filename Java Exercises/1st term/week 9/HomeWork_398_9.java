import java.util.*;

public class HomeWork_398_9 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = "y";

        do {
            System.out.println("She sells seashells at the seashore.");
            System.out.print("Do you want to hear it again?");
            input = console.next();
        } while (input.equals("y"));
    }
}