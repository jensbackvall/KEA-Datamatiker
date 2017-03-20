import java.io.*;
import java.util.*;

public class HomeWork_463_19 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("leetIn.txt"));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            leetSpeak(line);
        }
    }

    public static void leetSpeak(String line) throws FileNotFoundException {
        Scanner data = new Scanner(line);
        PrintStream output = new Printstream(new File("leetOut.txt"));
        while (data.hasNext()) {
            output.print("(");
            for (int i = 0; i < (data.length() - 1) ; i++ ) {
                if (data.charAt(i) == "o") {
                    output.print("0");
                } else if (data.charAt(i) == "l") {
                    output.print("1");
                } else if (data.charAt(i) == "e") {
                    output.print("3");
                } else if (data.charAt(i) == "a") {
                    output.print("4");
                } else if (data.charAt(i) == "t") {
                    output.print("7");
                } else {
                    output.print(data.charAt(i));
                }
            }
            if (data.charAt((data.length() - 1)) == 's') {
                System.out.print("z");
            } else if (data.charAt((data.length() - 1)) == "o") {
                output.print("0");
            } else if (data.charAt((data.length() - 1)) == "l") {
                output.print("1");
            } else if (data.charAt((data.length() - 1)) == "e") {
                output.print("3");
            } else if (data.charAt((data.length() - 1)) == "a") {
                output.print("4");
            } else if (data.charAt((data.length() - 1)) == "t") {
                output.print("7");
            } else {
                output.print(data.charAt((data.length() - 1)));
            }
            output.print(") ");
        }
    }
}