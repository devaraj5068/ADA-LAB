import java.util.*;
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[++i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        long  start=System.nanoTime(); 
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) System.out.print(num + " ");
         long  stop=System.nanoTime(); 
                long Time=stop-start; 
        System.out.println(); 
        System.out.println("Time taken for execution="+Time);
    }
}
// Output: 1 5 7 8 9 10
// Time taken for execution=24619900
