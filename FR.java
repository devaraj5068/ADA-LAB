import java.util.*;
public class FR {

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1); 
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
        long  start=System.nanoTime(); 
        long  stop=System.nanoTime(); 
            long Time=stop-start; 
        System.out.println(); 
        System.out.println("Time taken for execution="+Time); }
}
// Output: 120
// Time taken for execution=400