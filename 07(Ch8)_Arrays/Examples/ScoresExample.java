public class ScoresExample {

   public static void main(String[] args) {
   
      int[] scores = {79, 87, 94, 82, 67, 98, 87, 81, 74, 91};
   
      for (int i = 0; i < scores.length; i++) {
         System.out.print(scores[i] + " ");
      }
      
      System.out.println();  
      
      for (int i : scores) {
         System.out.print(i + " ");
      }
      
      System.out.println();
   }
}