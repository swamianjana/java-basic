
package sorting;

 class sortingBasics {
	 public static void main(String[] args) {
		 int[] arr = {2, 3, 5, 7, 9};
		 int n;			// to be given
		 
//  find index of n in the array or return -1
		 System.out.println(binary(arr, 5));
		 
	 }
	public static int binary(int[] arr, int n) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
		int mid = (start + end)/2;
		if(arr[mid] == n) {
		return mid;
		}else if(arr[mid] > n) {
			end = mid -1;
		}else {
			start = mid + 1;
		}
	 }
	return -1;
	}
 }
