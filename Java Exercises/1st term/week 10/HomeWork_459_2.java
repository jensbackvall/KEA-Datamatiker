import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class HomeWork_459_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File("numbers2.dat"));
        while (fileIn.hasNextLine()) {
            String nums = fileIn.nextLine();
            oddNumbers(nums);
        }
    }

    public static void oddNumbers(String nums) {
        Scanner data = new Scanner(nums);
        int count = 0;
        int total = 0;
        int odds = 0;
        while (data.hasNext()) {
            int currentNum = data.nextInt();
            total = total + currentNum;
            count++;
            if (currentNum % 2 != 0) {
                odds++;
            }
        }
        double c = count;
        double o = odds;
        double percentage = (o/c)*100;
        DecimalFormat df = new DecimalFormat("#.##");
        percentage = Double.valueOf(df.format(percentage));
        System.out.println(count + "numbers, " + "sum = " + total);
        System.out.println(odds + " odds " + "(" + percentage + "%)");
    }
}