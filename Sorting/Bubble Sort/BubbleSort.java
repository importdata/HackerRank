import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BubbleSort {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        boolean isSorted = false;
        int numSwaps = 0; 
        while(!isSorted)
        {
            isSorted = true;
            for(int i=0; i < a.length-1; i++)
            {
                if(a[i] > a[i+1]) // if the previous one is bigger than the next one
                {
                    int temp = a[i]; // store the bigger value in a temp variable
                    a[i] = a[i+1];  // swapping 
                    a[i+1] = temp; // now the smaller one is in temp
                    numSwaps++; // increment the number of swaps
                    isSorted = false; // if didn't have to swap, then not sorted
                }
            }
        }
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);       

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
