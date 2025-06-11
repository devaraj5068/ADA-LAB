import java.util.*;
public class BSearch {

    // Recursive Binary Search Function
    static int s(int[] a, int t, int l, int h) {
        if (l > h) return -1;
        int m = (l + h) / 2;
        return a[m] == t ? m : (a[m] < t ? s(a, t, m + 1, h) : s(a, t, l, m - 1));
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;

        long start = System.nanoTime();  
        int result = s(arr, target, 0, arr.length - 1);
        long stop = System.nanoTime();   

       
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);

       
        long time = stop - start;
        System.out.println("Time taken for execution = " + time + " ns");
    }
}
//Output:Element found at index: 2
//Time taken for execution = 12345 ns
