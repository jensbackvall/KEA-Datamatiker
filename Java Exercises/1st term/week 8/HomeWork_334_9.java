import java.util.*;

public class HomeWork_334_9 {
   public static void main (String[] Args) {
      oddSumMax();
   }

   public static void oddSumMax() {
      Scanner console = new Scanner(System.in);

      System.out.print("How many integers?: ");
      int num = console.nextInt();
      int oddSum = 0;
      int oddMax = 0;

      for (int i = 0; i < num; i++) {
         System.out.print("Next integer: ");
         int newint = console.nextInt();
         if (newint % 2 == 1) {
            if (newint > oddMax) {
               oddMax = newint;
            }
            oddSum = oddSum + newint;
         }
         System.out.println();
      }

      System.out.println("Odd sum = " + oddSum + ", Odd max = " + oddMax);

   }
}