package basic.matrix;

 class howToSortArray {
	 
	 public static void printArray(int arr[]) {
		 for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		 }
		 System.out.println();
	 }
	 
//	 code run from here
	public static void main(String args []) {
		int arr[] = {10,4,6,1,5,2};
		
//		time complixity O(n^2)
//		bubble sort
		for(int i = 0; i < arr.length-1; i++) {
		 for(int j = 0; j < arr.length-i-1; j++) {
			if(arr[j] > arr[j+1]) {
				
//				swap 
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		 }
		}
		printArray(arr);
	}
}
