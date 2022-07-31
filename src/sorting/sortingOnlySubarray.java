package sorting;
import java.util.Arrays;

 class sortingOnlySubarray {
	 public static void main(String[] args) {
		 
		int[] arr = {13, 7, 6, 45, 21, 3, 2, 100}; 
		
//		Arrays.sort(arr); 			// this is use to sort all array from index 0 to 7
						// 0 to 7 tk ye pura sort krega
		
		Arrays.sort(arr,1,5);		// this is use to sort array from index 1 to 5
	// if we want to sort any other index array we simply write index number
		
		System.out.println(Arrays.toString(arr));
	 }
}
