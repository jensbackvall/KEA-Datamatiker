import java.util.*;

public class HomeWork_335_11 {

    public static void main(String[] args) {
        shortestName(4);
    }

    public static void shortestName(int n) {
        Scanner console = new Scanner(System.in);
        String shortName = "";
        int shortest = 10000;

        System.out.println("This program compares names to find the shortest one.");
        System.out.println();
        System.out.println("Please input " + n + " names");
        for (int i = 1; i <= n; i++) {
            System.out.print("name #" + i + ": ");
            String name = console.next();
            System.out.println();
            if (shortest > name.length()) {
                shortest = name.length();
                shortName = name;
            }
        }
        System.out.println(shortName + "'s name is the shortest");
    }
}