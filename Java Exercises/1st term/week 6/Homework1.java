public class Homework1 {
   public static void main(String[] args) {
      Homework(1);
      LineBreak();
      HatLine();
      Intro();
      HatLine();
      LineBreak();
      Homework(2);
      StarLine();
      for (int i = 0; i <= 3; i++) {
         StarEdges();
      }
      StarLine();
      LineBreak();
      Homework(5);
      LineBreak();
      Approximate();
      LineBreak();
      Homework(9);
      Rombus();
      LineBreak();
   }
   
   public static void LineBreak() {
      System.out.println();
      System.out.println();
   }
   
   public static void Homework(int n) {
      System.out.println("Exercise number " + n + ":");
   }
   
   public static void Intro() {
      System.out.println("!!  Introduction to Java Programming        !!");  
   }
   
   public static void HatLine() {
      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
   }
   
   public static void StarLine() {
      System.out.println("********************");
   }
   
   public static void StarEdges() {
      System.out.println("*                  *");
   }
   
   public static void Approximate() {
      System.out.println("Most of the people think that");
      System.out.println("\'kilo\' in \'kilobytes\' means 1000");
      System.out.println("as in the metric system.");
      System.out.println("But the fact is that");
      System.out.println("2^10 is \"approximately equal\" to 1000 bytes");
      System.out.println("IT actually equals 1024 bytes!");
   }
   
   public static void Rombus() {
      RombusTop();
      RombusLine();
      RombusBottom();
   }
   
   public static void RombusTop() {
      System.out.println("   $$$");
      System.out.println("  $   $");
      System.out.println(" $     $");
   }
   
   public static void RombusBottom() {
      System.out.println(" $     $");
      System.out.println("  $   $");
      System.out.println("   $$$");
   }
   
   public static void RombusLine() {
      System.out.println("\"_\'_\"_\'_\"");
   }
}