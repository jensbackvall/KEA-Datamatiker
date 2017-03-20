import java.util.*;
import java.io.*;

public class FileIn {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("AliceInWonderland.txt");
        Scanner input = new Scanner(f);
        int count = 0;
        while (input.hasNext()) {
            String word = input.next();
            count++;
        }
        System.out.println("total words in Alice: " + count);
    }
}