package HashMap.questions;

public class LongestSubArrayWithSumK {

	public static void main(String[] args) {
		int[] arr = {-5, 8, -14, 2, 4, 12};
		
		int res = longestSubArray(arr, -5);
		System.out.println(res);
	}
	
	static int longestSubArray(int[] arr, int k ) {
		int longestSubArrayLength = 0;
		for(int i = 0; i < arr.length; i++) {
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
}
