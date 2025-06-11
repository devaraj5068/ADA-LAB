import java.util.*;
public class SelectionSort{
    public static void sorting(int [] a){
        int n = a.length;
        for (int i=0; i<n-1; i++){
            int m=i;
        for(int j= i+1; j<n; j++ ) if (a[j]< a[m])m=j;
        int t= a[i];
        a[i]=a[m];
        a[m]=t;
        }
    }
    public static void printArray(int [] a){
        for (int n:a)  System.out.print(n+" ");
        System.out.println();
    }
    public static void main (String [] args){
        int [] a= { 34, 65, 12, 87, 37,59};
         long  start=System.nanoTime();
        System.out.println("Before Sorting");
        printArray(a);
        sorting(a);
        System.out.println("After Sorting");
        printArray(a);
         long  stop=System.nanoTime(); 
                long Time=stop-start; 
        System.out.println(); 
        System.out.println("Time taken for execution="+Time);

    }
}
// output:Before Sorting
//34 65 12 87 37 59 
//After Sorting
//12 34 37 59 65 87
//Time taken for execution=31696800