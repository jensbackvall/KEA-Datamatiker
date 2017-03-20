public class HomeWork_85_13 {
   
   public static void main(String[] Args) {
      Figures();
   }
   
   public static void Figures() {
      TopTriangle();
      Line();
      StarEdges();
      Line();
      BottomTriangle();
      TopTriangle();
      for (int i = 0; i <= 3; i++) {
         Line();
      }
   }
   
   public static void TopTriangle() {
      System.out.println("   **");
      System.out.println("  * *");
      System.out.println(" *  *");
      System.out.println("*   *");
   }
   
   public static void Line() {
      System.out.println("*****");
   }
   
   public static void StarEdges() {
      for (int i = 0; i <= 3; i++) {
         System.out.println("*   *");
      }
   }
   
   public static void BottomTriangle() {
      System.out.println("*   *");
      System.out.println(" *  *");
      System.out.println("  * *");
      System.out.println("   **");
   }
}
