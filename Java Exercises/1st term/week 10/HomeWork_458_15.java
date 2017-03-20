import java.io.*;
import java.util.*;

public class HomeWork_458_15 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new File("HomeWork_458_15.java"));
        while (file.hasNextLine()) {
            String text = file.nextLine();
            System.out.println(text);
        }
    }
}