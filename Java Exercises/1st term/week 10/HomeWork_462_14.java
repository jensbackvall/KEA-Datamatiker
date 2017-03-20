import java.util.*;
import java.io.*;

public class HomeWork_462_14 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("duplicate.txt"));
        while (input.hasNextLine()) {
            String stuff = input.nextLine();
            printDuplicates(stuff);
        }
    }

    public static void printDuplicates(String stuff) throws FileNotFoundException  {
        Scanner data = new Scanner(stuff);
        String dupl = "";
        int count = 1;
        while (data.hasNext()) {
            String word = data.next();
            if (word.equals(dupl)) {
                count++;
            } else if (count > 1) {
                    System.out.print(dupl + "*" + count + " ");
                    count = 1;
            } else {
                count = 1;
            }
            dupl = word;
        }
        if (count > 1) {
            System.out.print(dupl + "*" + count + " ");
            count = 1;
        }
        System.out.println();
    }
}