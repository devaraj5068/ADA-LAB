import java.util.*;
public class LCMCalculator {
    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int lcmArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 15, 20, 25};
         long  start=System.nanoTime(); 
        int result = lcmArray(numbers);
        System.out.println("LCM of the array is: " + result);
        long  stop=System.nanoTime(); 
long Time=stop-start; 
System.out.println();  
System.out.println("Time taken for execution="+Time); 

    }
}
// Output: LCM of the array is: 300
// Time taken for execution=18954100