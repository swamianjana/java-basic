package basic;

public class maxandminArray {

	public static void main(String[] args) {
//			System.out.println("Hello World");
////	 		------------------------ ||
//			int[] arr1 = {1,2,3,4,5};
//			int[] arr2 = {6,7,8,9,10, 11, 12, 14, 16};
//			
////	 		{7,9,11,13,15, 11, 12, 14, 16}
//	        // 7 9 11 13 15 11 12 14 16 
//			int[] arr3 = func(arr1, arr2);
//			
//			
//			for(int i=0; i<arr3.length; i++){
//			    System.out.print(arr3[i]+" ");
//			}
////	 		return an array -> That takes sum of 2 arrays;
//		}
//		
//		public static int[] func(int[] arr1, int[] arr2){
//		
//		   int[] arrFinal;
//		   
//		   int smallLength;
//		   int largeLength;
//		   
//		   if(arr1.length > arr2.length){
//		       smallLength = arr2.length;
//		       largeLength = arr1.length;
//		       arrFinal = new int[arr1.length];
//		   }else{
//		       smallLength = arr1.length;
//		       largeLength = arr2.length;
//		       arrFinal = new int[arr2.length];
//		   }
//		   
//		   int i;
//		   
//		   for(i =0; i<smallLength; i++){
//		       arrFinal[i] = arr1[i]+arr2[i];
//		   }
//		   
//		   // i = smallLength;
//		   
//		   for(int j = i; j<largeLength; j++){
//		       arrFinal[j] = j >= arr1.length? arr2[j]: arr1[j];
//		   }
//		   
//		   
//		   // check which array is bigger
//		   // arrFinal ki length = bigger array
//		   // for loop -> Chote array
//		   //Chote array ke bahar -> simply do another loop on bigger array 
//		   // i ki current value ((Chote array ki length -1)+1)
//		    
//		   return arrFinal;
//		}
//	}
//
//}
		int[] arr = { 1, 5, 6, 8, 5, 20 };
//FIND MAXIMUM ARRAY
		int max = arr[0]; // we make int of max name and we give value of arr at[0]-> value
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

//FIND MINIMUM ARRAY
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) { // i=1 -> then 2-> then 3 -> then 4 -> then 5 -> then 6.
				min = arr[i];
			}
		}
		System.out.println(min);
		
//FIND TWO MAXIMUM VALUE FROM ARRAY
	int[] arr1 = {5,6,1,3,10};
	int maxi = arr1[0];
	int secMaxi = Integer.MIN_VALUE; //to find second largest value (we always assume this value id -2^31)
	for(int i  = 0;i < arr1.length; i++) {
	if(arr1[i] > maxi) {
	secMaxi = maxi;
	maxi = arr1[i];
	} //here if conditon ends 
	else if(arr1[i] > secMaxi) {
		secMaxi = arr1[i];
	} //here else if condition ends
	} //here for loop ends 
	System.out.println(maxi);
	System.out.println(secMaxi);
	
// FIND TWO MINIMUM VALUE FROM ARRAY
	int mini = arr1[0];
	int secMini = Integer.MAX_VALUE;
	for(int i = 0; i < arr1.length; i++) {
	if(arr1[i] < mini) {
	secMini = mini;
	mini = arr1[i];
	}else if(arr1[i] < secMini) {
		secMini = arr1[i];
	}
	}
	System.out.println(mini);
	System.out.println(secMini);
	} //here main function ends
	}