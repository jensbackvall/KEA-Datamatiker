import java.util.*;

public class conCat {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Write a word: ");
        String s1 = console.next();
        System.out.print("Write another word: ");
        String s2 = console.next();
        String text = editText(s1, s2);
        System.out.println(text);
    }

    public static String editText(String t1, String t2) {
        String result = (t1 + " " + t2);
        return result;
    }
}
