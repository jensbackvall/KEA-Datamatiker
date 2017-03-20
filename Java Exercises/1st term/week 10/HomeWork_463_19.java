import java.io.*;
import java.util.*;
import java.lang.*;

public class HomeWork_463_19 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("leetIn.txt")); //Initiates new scanner to read leetIn.txt file
        PrintStream output = new PrintStream(new File("leetOut.txt")); //Initiates PrintStream which creates and output file
        while (input.hasNextLine()) { //Checks if there is a line of input to work with(stops after last line)
            String line = input.nextLine(); //Set the variable line to use as input in the leetSpeak method
            leetSpeak(line, output); //This line gives output to the new file leetOut.txt
            leetSpeak(line, System.out); //This line gives output to the console, showing if the result is good
        }
    }

    public static void leetSpeak(String line, PrintStream output) throws FileNotFoundException {
        Scanner data = new Scanner(line); //This scanner gives us the current line of the input file to work with
        while (data.hasNext()) { //Checks if there is a word to work with(stops after last word)
            String word = data.next(); //Sets a string for the current word
            output.print("(");
            for (int i = 0; i < ((word.length() - 1)) ; i++ ) { //Runs a loop for all but the last letter of each word
                Character letter = word.charAt(i); //Sets a variable for the current letter of the current word
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
            Character letter = word.charAt((word.length() - 1)); //Sets a variable for the last letter of the current word
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