import java.io.*;

public class Hello4 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("hello.txt"));
        output.println("Hello, World.");
        output.println();
        output.println("This program produces four");
        output.println("lines of output... in a file");
    }
}