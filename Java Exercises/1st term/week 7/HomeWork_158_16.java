public class HomeWork_158_16 {

   public static void main(String[] Args) {
      PlusHash();
      PlusHash2();
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

}