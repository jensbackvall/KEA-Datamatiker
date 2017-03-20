import java.io.*;

public class HomeWork_458_19 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("message.txt"));
        output.println("Testing,");
        output.println("1, 2, 3.");
    }
}