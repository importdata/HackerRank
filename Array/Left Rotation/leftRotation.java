/*
A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if left rotations are performed on array , then the array would become .

Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

Function Description

Complete the function rotLeft in the editor below. It should return the resulting array of integers.

rotLeft has the following parameter(s):

An array of integers .
An integer , the number of rotations.
Input Format

The first line contains two space-separated integers  and , the size of  and the number of left rotations you must perform. 
The second line contains  space-separated integers .

Constraints

Output Format

Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
Explanation

When we perform  left rotations, the array undergoes the following sequence of changes:

*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Java program that rotates an array by d elements 
  
public class leftRotation {
    public static int[] arrayLeftRotation(int[] a, int n, int d)     {
        // Figure out number of rotations actually needed by modding
        // the value - we can only have max n-1 rotations.
        int actualRotations = d % n;
        int newArray[]      = new int[n];
        int currentIndex    = 0;

        for (int i = actualRotations ; i < n ; i++ ) {
            newArray[currentIndex] = a[i];
            currentIndex++;
        }

        for (int i = 0; i < actualRotations; i++ ) {
            newArray[currentIndex] = a[i];
            currentIndex++;
        }

        return newArray;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();

        }

        int[] output = new int[n];

        output = arrayLeftRotation(a, n, k);

        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();
    }
}
