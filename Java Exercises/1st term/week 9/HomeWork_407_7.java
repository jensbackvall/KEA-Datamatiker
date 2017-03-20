import java.util.*;

public class HomeWork_407_7 {

    public static void main(String[] args) {

        diceThrows();

        Scanner console = new Scanner(System.in);

        Random r = new Random();

        System.out.print("Please input a number between 1 and 36, contained within the array above: ");
        int playerChoice = console.nextInt();
        if ((playerChoice < 1) || (playerChoice > 36)) {
            System.out.print("You have input an integer outside the desired range! Goodbye!");
        } else {
            System.out.print("Desired dice product: " + playerChoice);
        }

        int diceProduct = 0;
        int rolls = 0;
        while (diceProduct != playerChoice) {
            System.out.println("rolling dice");
            int d6_1 = r.nextInt(6) + 1;
            int d6_2 = r.nextInt(6) + 1;
            diceProduct = d6_1 * d6_2;
            System.out.println(d6_1 + " times " + d6_2 + " = " + diceProduct);
            rolls++;
        }
        System.out.println("The dice were rolled " + rolls + " times.");

    }

    public static void diceThrows() {
        int prod = 0;
        for (int d1 = 1; d1 < 7; d1++) {
            for (int d2 = 1; d2 < 7; d2++) {
                prod = d1 * d2;
                System.out.print(prod + " ");
            }
        System.out.println();
        }
    }

}