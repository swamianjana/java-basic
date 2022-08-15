package sorting;
import java.util.*;

 class noOfRotationInArray {
 
	public static void main(String[] args) {
		int[] arr1 = {4, 5, 6, 7, 8, 9, 0, 1, 2, 3};
		int[] arr2 = {4, 5, 6, 7, 8, 9, 0, 1, 2, 3};
		
	System.out.println(findSmallestElement(arr2));
	}
	
	public static int findSmallestElement(int[] arr) {
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo <= hi) {
			int mid = (lo+hi)/2;
			if(arr[lo] <= arr[hi]) return lo;
			
			int previous = (mid - 1 + arr.length) % arr.length;
			int next = (mid +1 ) % arr.length;
			
			if (arr[mid] < arr[previous] && arr[mid] < arr[next]) {
				return mid;
			}else if(arr[mid] > arr[lo]) {
				lo = mid + 1;
			}else if(arr[mid] < arr[hi]) {
				hi = mid -1;
			}
 		}
		return -1;
	}
}
