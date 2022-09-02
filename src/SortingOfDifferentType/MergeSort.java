package SortingOfDifferentType;

 class MergeSort {
	 
	 public static void conqure(int arr[], int si,int mid, int ei) {
		 int merged[] = new int[ei - si + 1];
		 int idx1 = si;
		 int idx2 = mid+1;
		 int x = 0;
		 
		 while(idx1 <= mid && idx2 <= ei) {
			 if(arr[idx1] <= arr[idx2]) {
				 merged[x++] = arr[idx1++];
				  }else {
					  merged[x++] = arr[idx2++];
				  }
		 }
		 while(idx1 <= mid) {
			 merged[x++] = arr[idx1++];
		 }
		 while(idx2 <= mid) {
			 merged[x++] = arr[idx2++];
		 }
//		 now hme original array ko merged k andr copy krna h
		 
		 for(int i=0, j=si; i < merged.length; i++,  j++) {
			 arr[j] = merged[i];
		 }
	 }
	 
	 public static void divide(int arr[], int si, int ei) {
//		si = start number
//		 ei = ending number
//		 (si + ei)/2 = use to find middle number
		 if(si >= ei) {
			 return;
		 }
		int mid = si+ (ei-si)/2;
		 divide(arr,si,mid);
		 divide(arr,mid+1,ei);
		 conqure(arr,si,mid,ei);
		 
	 }
	 
 public static  void main(String[] args) {
	 
	 int arr[] = {6,3,9,5,2,8};
	 int n = arr.length;
	divide(arr,0,n-1);
	
	for(int i=0; i<n; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
//	 divide and conqure technique followed in merge sorting
//	 1 --> to divide into equal half
//	 2 --> to conqure means sort
	
	
//	output is 2 3 5 0 6 0 
 }
}
