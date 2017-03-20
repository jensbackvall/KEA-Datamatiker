public class Hello {
   public static int a = 0;
   public static void main(String[] args) {
      System.out.println("Hello, Dat17v2 in\n\"world\"!");
      box(a);
   }
   public static void box(int a) {
      if (a < 10) {
         System.out.println("H                           H");
         a = a + 1;
         box(a);
      }
   } 
}