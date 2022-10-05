package HashMap.questions;

import java.util.HashMap;

public class LongestSubArrayWithSumK {

	public static void main(String[] args) {
		int[] arr = {-5, 8, -14, 2, 4, 12};
		
//		int res = longestSubArray(arr, -5);
		int res = longestSubArrayWithMap(arr, -5);
		System.out.println(res);
	}
	
	// brute-force approach
	static int longestSubArray(int[] arr, int k ) {
		int longestSubArrayLength = 0;
		for(int i = 0; i < arr.length; i++) { // n
			int sum = 0;
			for(int j = i; j < arr.length; j++) {
				sum += arr[j]; //sum = sum + arr[j]; 
				int length = j - i + 1;
				if(sum == k && longestSubArrayLength < length ) {
					longestSubArrayLength = length;
				}
			}
		}
		return longestSubArrayLength;
	}
	
	// optimize
	static int longestSubArrayWithMap(int[] arr, int k) {
		int longestSubArrLen = 0;
		HashMap<Long, Integer> sumIndexMap = new HashMap<>();
		
		long sum = 0;
		
		sumIndexMap.put(0l, -1);
		for(int i =0; i < arr.length; i++) {
			sum += arr[i];
			long searchKey = sum - k;
			if(sumIndexMap.containsKey(searchKey)) {
				int index = sumIndexMap.get(searchKey);
				int len = i - index;
				if(longestSubArrLen < len) {
					longestSubArrLen = len;
				}
			}
			if(!sumIndexMap.containsKey(sum)) {
				sumIndexMap.put(sum, i);
			}
		}
		
		
		return longestSubArrLen;
	}
}
