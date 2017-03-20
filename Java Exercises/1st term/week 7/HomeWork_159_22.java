public class HomeWork_159_22 {

   public static void main(String[] Args) {
      PlusFigure();
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