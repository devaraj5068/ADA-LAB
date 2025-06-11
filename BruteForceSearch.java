import java.util.*;
public class BruteForceSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 3};
         long start = System.nanoTime(); 
        System.out.println(search(arr, 7)); 
         long stop = System.nanoTime();
        long Time = stop - start;
         System.out.println("Time taken for execution=" + Time);
    }
}
// Output: 2
// Time taken for execution=859500