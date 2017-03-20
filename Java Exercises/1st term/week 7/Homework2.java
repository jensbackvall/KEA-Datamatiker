public class Homework2 {

   public static double a;
   public static double v;
   public static double r;
   public static int i;
   public static int j;
   public static int k;
   
   public static void main(String[] args) {
   
      Homework(1);
      v = 10;
      System.out.println("The velocity is " + v);
      r = 2; 
      System.out.println("The radius is " + r);
      velocity();
      System.out.println("Thus, the acceleration is " + a);
      
      LineBreak();
      
      Homework(2);
      decrementMinusTwo();
      
      LineBreak();
      
      Homework(3);
      factorial(7);
      
      LineBreak();
      
      Homework(5);
      PlusPyr();
      
      LineBreak();
      
      Homework(6);
      NumPyr(7);
      
      LineBreak();
      
      Homework(8);
      NumPyr2(5);
      
      LineBreak();
      
      Homework(15);
      PrintTriangle();
      
      LineBreak();
      
      Homework(16);
      PlusHash();
      
      LineBreak();
      
      Homework(17);
      PlusHash2();
      
      LineBreak();
      
      Homework(22);
      PlusFigure();
      
      LineBreak();
            
   }
   
   public static void LineBreak() {
      System.out.println();
      System.out.println();
   }
   
   public static void Homework(int n) {
      System.out.println("Exercise number " + n + ":");
      System.out.println();
   }

   public static void velocity() {
      a = v * v / r;
   }
   
   public static void decrementMinusTwo() {
      j = 289;
      k = 33;
      for (i = 0; i < 9; i++) {
         System.out.print(j + " ");
         j = j - k;
         k = k - 2;
      }
   }
   
   public static void factorial(int x) {
      for (int n = x; n >= 1; n--) {
         j = n;
         for (i = n; i >= 2; i--) {
            j = j * (i - 1);
         }
         System.out.print(j + " ");
        }
   }
   
   public static void PlusPyr() {
      for (i = 4; i >= 0; i--) {
         for (int o = (i-1); o >= 0; o--) {
            System.out.print(" ");
         }
         for (int p = (5-i); p >= 1; p--) {
            System.out.print("+");
         }
         System.out.println();
         System.out.println();
      }
   }
   
   public static void NumPyr(int y) {
      for (int x = y; x >= 1; x--) {
         for (int n = x; n >= 1; n--) {
            System.out.print(x);
         }
         System.out.println();
      }
   }
   
   public static void NumPyr2(int y) {
      for (int x = y; x >= 1; x--) {
         for (int o = (y - x); o >= 0; o--) {
            System.out.print(" ");
         }
         for (int n = x; n >= 1; n--) {
            System.out.print(x);
         }
         System.out.println(); 
      }
   }
      
   public static void PrintTriangle() {
      for (int line = 1; line <= 5; line++) {
         for (int minus = 1; minus <= line * -1 + 6; minus++) {
            System.out.print("-");
         }
         for (int number = 1; number <= line * 2 - 1; number++) {
            System.out.print(number);
         }
         for (int minus = 1; minus <= line * -1 + 6; minus++) {
            System.out.print("-");
         }
      System.out.println();
      }
   }
   
   public static void PlusHash() {
      for (int line = 1; line <= 6; line++) {
         for (int st = 1; st <= (line * -2 + 12); st++) {
            System.out.print("<");
         }
         for (int plus = 1; plus <= (line * 4 - 2); plus++) {
            System.out.print("+");
         }
         for (int gt = 1; gt <= (line * -2 + 12); gt++) {
            System.out.print(">");
         }
         System.out.println();
      }
   }
   
   public static final int SIZE = 9;
   public static void PlusHash2() {
      for (int line = 1; line <= SIZE; line++) {
         for (int st = 1; st <= (line * -2 + SIZE * 2); st++) {
            System.out.print("<");
         }
         for (int plus = 1; plus <= (line * 4 - 2); plus++) {
            System.out.print("+");
         }
         for (int gt = 1; gt <= (line * -2 + SIZE * 2); gt++) {
            System.out.print(">");
         }
         System.out.println();
      }
   }
   
   public static final int SIZE2 = 7;
   public static void PlusFigure() {
      for (int line = 1; line <= SIZE2; line++) {
         for (int curvy = 1; curvy <= (line * -2 + SIZE2 * 2); curvy++) {
            System.out.print("~");
         }
         for (int plus = 1; plus <= line; plus++) {
            System.out.print("+");
         }
         for (int curvy = 1; curvy <= line * 2; curvy++) {
            System.out.print("~");
         }
         for (int plus = 1; plus <= line; plus++) {
            System.out.print("+");
         }
         for (int curvy = 1; curvy <= (line * -2 + SIZE2 * 2); curvy++) {
            System.out.print("~");
         }
      System.out.println();
      }
   }
}