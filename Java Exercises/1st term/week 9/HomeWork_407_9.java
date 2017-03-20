import java.util.*;

public class HomeWork_407_9 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a whole, positive number: ");
        int num = console.nextInt();
        if (num < 1) {
            System.out.println("You did not enter a whole, positive number. You entered: " + num);
            System.out.println("GOODBYE!");
            return;
        }
        System.out.println();
        System.out.println("The first ten multiples of " + num + " are: ");
        printMultipes(num);
    }

    public static void printMultipes(int n) {
        System.out.print(n);
        for (int i = 2; i <= 10; i++) {
            System.out.print(" and " + (n * i));
        }
    }
}