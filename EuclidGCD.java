import java.util.*;
public class EuclidGCD{
    public static int euclidGCD ( int a, int b){
        if(b==0){
            return a;
        }
        return euclidGCD (b, a%b);
    }
    public static void main (String [] args){
        int a= 56;
        int b= 98;
          long  start=System.nanoTime();
        int gcd = euclidGCD (a, b);
        System.out.println("The GCD of "+a+" and "+b+" is: "+ gcd);
         long  stop=System.nanoTime(); 
                long Time=stop-start; 
        System.out.println(); 
        System.out.println("Time taken for execution="+Time);
    }
}
// Output: The GCD of 56 and 98 is: 14
// Time taken for execution=22127400