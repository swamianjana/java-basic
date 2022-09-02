package question;

import java.util.*;
import java.lang.*;
import java.io.*;

public class maxSubarraySum {


//	class Main {
	    public static int maximumSubarraySum(int[] arr) {
	        int n = arr.length;
	        int maxSum = Integer.MIN_VALUE;
	        int currSum = 0;

	        for (int i = 0; i <= n - 1; i++) {
	            currSum += arr[i];

	            if (currSum > maxSum) {
	            maxSum = currSum;
	            }

	            if (currSum < 0) {
	            currSum = 0;
	            }
	        }

	        return maxSum;
	    }


	    public static void main(String args[]) {
	        // Your code goes here
	        int a[] = {1, 3, 8, -2, 6, -8, 5};
	        System.out.println(maximumSubarraySum(a));
	    }
	}
