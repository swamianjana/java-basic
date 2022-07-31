
//Minimize XOR
//Easy
//
//Time Limit: 2 sec
//Memory Limit: 128000 kB
//Problem Statement
//Given an integer array A of N integers, find the pair of integers in the array 
//which have minimum XOR value. Report the minimum XOR value.
//Input
//First line denotes N, the size of the array.
//Next line denotes N space-separated array elements.
//
//Constraints:
//2 <= N <= 100000
//0 <= A[i] <= 10^7
//Output
//Print a single integer denoting minimum xor value
//Example
//Sample Input
//4
//0 2 5 7
//
//Sample Output
//2
//
//Explanation:
//0 xor 2 = 2
//
//Sample Input
//4
//0 4 7 9
//
//Sample Output
//3
package bitManipulation;

//public class minimizeXOR {
	import java.io.*; // for handling input/output
	import java.util.*; // contains Collections framework

	// don't change the name of this class
	// you can add inner classes if needed
	class minimizeXOR {
	    public static void main (String[] args) {
	         Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int[] a = new int[n];
	        for(int i=0; i<n; i++){
	            a[i] = scn.nextInt();
	        } 
	        int min = Integer.MAX_VALUE;
	        for(int i=0; i<n-1; i++){
	            for(int j=i+1; j<n; j++){
	                int xor = a[i]^a[j];
	                if(xor == 0){
	                    System.out.println(xor);
	                    return;
	                }
	                min = Math.min(min, xor);
	            }
	        }
	        System.out.println(min);

	    }

	    
	}

