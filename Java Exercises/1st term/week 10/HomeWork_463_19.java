import java.io.*;
import java.util.*;
import java.lang.*;

public class HomeWork_463_19 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("leetIn.txt"));
        PrintStream output = new PrintStream(new File("leetOut.txt"));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            leetSpeak(line, output);
            leetSpeak(line, System.out);
        }
    }

    public static void leetSpeak(String line, PrintStream output) throws FileNotFoundException {
        Scanner data = new Scanner(line);
        while (data.hasNext()) {
            String word = data.next();
            output.print("(");
            for (int i = 0; i < ((word.length() - 1)) ; i++ ) {
                Character letter = word.charAt(i);
                if (letter.equals('o')) {
                    output.print("0");
                } else if (letter.equals('l')) {
                    output.print("1");
                } else if (letter.equals('e')) {
                    output.print("3");
                } else if (letter.equals('a')) {
                    output.print("4");
                } else if (letter.equals('t')) {
                    output.print("7");
                } else {
                    output.print(letter);
                }
            }
            Character letter = word.charAt((word.length() - 1));
            if (letter.equals('s')) {
                output.print("z");
            } else if (letter.equals('o')) {
                output.print("0");
            } else if (letter.equals('l')) {
                output.print("1");
            } else if (letter.equals('e')) {
                output.print("3");
            } else if (letter.equals('a')) {
                output.print("4");
            } else if (letter.equals('t')) {
                output.print("7");
            } else {
                output.print(letter);
            }
            output.print(") ");
        }
        output.println();
    }
}