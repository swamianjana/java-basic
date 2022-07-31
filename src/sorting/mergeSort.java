package sorting;

public class mergeSort {
	
	public static void main(String[] args) {
        int[] arr = {1,45,85,6, 25,3,-1,0};
        sort(arr, 0, arr.length-1);
        
        for(int element : arr){
            System.out.print(element+" ");
        }
        
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void sort(int[] arr, int start, int end){
        if(start >= end){return;}
         
        int mid = (start+end)/2;
        
        sort(arr, start, mid);
        sort(arr,mid+1,end);
        merge(arr, start, mid, end);
    
        return;
    }
    
    public static void merge(int[] arr, int start, int mid, int end){
        int[] larr = new int[mid - start + 1];
        int[] rarr = new int[end - mid];
        
        // fill left arr
        // copy pointer
        int lcp = start;
        for(int i=0; i<larr.length; i++){
            larr[i] = arr[lcp];
            lcp++;
        }
        
        // fill right arr
        lcp = mid+1;
        for(int j=0; j<rarr.length; j++){
            rarr[j] = arr[lcp];
            lcp++;
        }
        
        // fill main array using left and right array
        int left =0; int right = 0;
        int k =start;
        while(left < larr.length && right < rarr.length){
            if(larr[left] < rarr[right]){
                arr[k] = larr[left];
                left++;
            }else{
                arr[k] = rarr[right];
                right++;
            }
            k++;
        }
        
        while(left < larr.length){
            arr[k] = larr[left];
            left++;
            k++;
        }
        
        while(right < rarr.length){
            arr[k] = rarr[right];
            right++;
            k++;
        }
        
    }
    
}


