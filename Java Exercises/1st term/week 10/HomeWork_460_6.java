import java.util.*;
import java.io.*;

public class HomeWork_460_6 {
    public static void main(String[] args) throws FileNotFoundException  {
        readWriteFile();
    }

    public static void readWriteFile() throws FileNotFoundException {
        Scanner input = new Scanner(new File("hours.dat"));
        PrintStream output = new PrintStream(new File("hours2.dat"));
        while (input.hasNextLine()) {
            String nextLine = input.nextLine();
            output.println(nextLine);
        }
    }
}
