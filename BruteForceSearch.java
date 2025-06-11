// Sequential search
import java.util.*;
public class BruteForceSearch {
   public BruteForceSearch() {
   }

   public static int search(int[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{4, 2, 7, 1, 3};
      long var2 = System.nanoTime();
      System.out.println(search(var1, 7));
      long var4 = System.nanoTime();
      long var6 = var4 - var2;
      System.out.println();
      System.out.println("Time taken for execution=" + var6);
   }
}
// Output: 2
// Time taken for execution=431100
