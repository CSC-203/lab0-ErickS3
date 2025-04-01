import java.util.ArrayList;
import java.util.List;

public class Lab00
{
   public static void main(String[] args)
   {
      int x = 5;
      String y = "hello";
      float z = 9.8F;

      System.out.println("x: " + x + " y: " + y + " z: " + z);

      List<Integer> nums = new ArrayList<>();
      nums.add(3);
      nums.add(6);
      nums.add(-1);
      nums.add(2);

      for(int num : nums) {
         System.out.println(num);
      }
   }
}
