
public class Lab00
{
   public static void main(String[] args)
   {
      //declaring and initializing variables
      int x = 5;
      String y = "hello";
      float z = 9.8F;


      //printing the variables
      System.out.println("x: " + x + " y: " + y + " z: " + z);


      //a list of integers
      int[] nums = {3, 6, -1, 2};
      for(int num : nums) {
         System.out.println(num);
      }


      //calling a function
      int numFound = char_count(y, 'l');
      System.out.println("Found:" + " " + numFound);


      //a counting for loop
      for(int i = 1; i < 11; i++){
         System.out.print(i + " ");
      }

   }


   public static int char_count(String s, char c){
      int count = 0;
      for(char ch: s.toCharArray()){
         if(ch == c){
            count = count + 1;

         }

      }
       return count;
   }

}
