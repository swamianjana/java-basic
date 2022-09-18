package SortingOfDifferentType;

// worst case occure when pivot is always the smallest or the largest element
// time complixity :
// worst case = O(n^2)
// average case = O(nlogn)

public class QuickSort {
	
	public static int partition(int arr[],int low, int high) {
		int pivot = arr[high];
		int i = low-1;		// this i track krega ki kiti jgha khali hini chaiye hmare array me jo hmare
//		pivot se chote element ko bhae ske.
		
//		triverse the array
		for(int j= low; j <high; j++ ) {
			if(arr[j] < pivot) {
			i++;		// khali jgha track kr rha h jgha pivot se chote elemet store hoge
			
//			swap  
//			ab mila usko or phle khali jgha vala mila usko
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
	}
//	pivot ko khali jgha lae k leye
	i++;
	int temp =  arr[i];
	arr[i] = pivot;
	arr[high] = temp;
	return i;  // pivot index
}
	
	public static void QuickSort(int arr[], int low, int high) {
		if(low < high) {
			int pidx = partition(arr, low, high);					// pidx = pivot index
			
			QuickSort(arr, low, pidx-1);
			QuickSort(arr, pidx+1, high);
			
		}
		
		
	}
		public static void main(String args[]) {
			int[] arr = {6,3,9,5,2,8};
			int n = arr.length;
			
			QuickSort(arr, 0, n-1);
			
//			print
			for(int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
}
