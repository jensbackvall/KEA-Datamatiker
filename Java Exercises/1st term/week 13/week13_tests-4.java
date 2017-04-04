import java.io.*;
import java.util.*;

public class week13_tests_4 {
    public static void main(String[] args) {
        method1(-6, 38);
    }

    public static void method1(int a, int b) {
        int count = 0;
        for (int i = a; i < b; i++) {
            if ((i % 2 == 1) || (i % 2 == -1)) {
                count++;
            }
        }
        int[] odds = new int[count];
        int pos = 0;
        for (int j = a; j < b ; j++ ) {
            if ((j % 2 == 1) || (j % 2 == -1)) {
                odds[pos] = j;
                pos++;
            }
        }
        for (int k = 0; k < count; k++) {
            System.out.print(odds[k] + " ");
        }
    }

}