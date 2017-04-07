import java.util.*;

public class week13_tests_2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures?: ");
        int numDays = console.nextInt();
        int[] temps = new int[numDays];

        int sum = 0;
        for (int i = 0; i < numDays; i++ )
        {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }
        double average = (double) sum /numDays;

        int above = 0;
        for (int i = 0; i < temps.length; i++)
        {
            if (temps[i] > average)
            {
                above++;
            }
        }

        System.out.println();
        System.out.println("Average = " + average);
        System.out.println("Number of days above average = " + above);
    }
}