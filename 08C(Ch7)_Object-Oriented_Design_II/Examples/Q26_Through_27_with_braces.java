public class Q26_Through_27_with_braces {
   public static void main(String[] args) {
      int i = 5;
   
      if (i < 3) {
         i++;
      }
      else if (i < 5) {
         if (i < 7) {
            i -= 2;
         }
         else {
            i++;
         }
      }
      else {
         i += 2;
      }
      i++;
      
      System.out.println(i);
   }
}