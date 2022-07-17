package basic;

public class ArrayBasic {
	public static void main(String[] args) {
//		array  : combination of similar datatype

		// javascript
		// let studentName = [1, 2, 4];
		// studentName[3] = 10;

		// java
//		sytenx 
//		datatype arrayName = {1, 2,3, 4} // static
		
		
		int[] arr = {1, 2, 3, 4};
//		index: 0 1 2 3
//		value: 1 2 3 4

		System.out.println("intial array ");
		displayArray(arr);
		
		// dynamic 
//		syntex
//		1) datatype[]
//		2) variableName
//		3) new datatype[size];

		// example
//		marks of  all subject for a student
		int[] markArr = new int[5]; // create initial array with all value 0
//		index: 0 1 2 3 4
//		value: 0 0 0 0 0

//		update: 
//		variableName[index] = value
		markArr[0] = 15;

//		index: 0  1 2 3 4
//		value: 15 0 0 0 0

		markArr[4] = 18;
//		index: 0  1 2 3 4
//		value: 15 0 0 0 18

//      find length of array
//		variableName.length

		System.out.println("Length " + markArr.length);

//		%%%%%%% INSERTION NEW VALUE %%%%%%%%%%%%%%%%  NOT ALLOWED

//	    if you insert new value in array of index which is not array index range (0 to marks.length - 1) 
//		then it will throw exception (index out of bound exception)

//		markArr[-1] = 10;
//		markArr[5] = 20;

//		*********************************************
//		&&&&&&&&&&&&&& FETCH &&&&&&&&&&&&&&&
//		variableName[index];

		System.out.println("0th index " + markArr[0]);
		int fourthIndex = markArr[4];
		System.out.println("fourth index " + fourthIndex);

//		fetch all value in array
//		javaScript:	console.log(variableName);

//		java
		System.out.println(markArr); // display memory location

//		for (int i = 0; i < markArr.length; i++) {
//			System.out.println(markArr[i]);
//		}
		displayArray(markArr);

		markArr[2] = 19;

//		for (int i = 0; i < markArr.length; i++) {
//			System.out.println(markArr[i]);
//		}
		displayArray(markArr);

//		deltion: in actual it is not deletion in memory but we can replace it with some number 
//		so that we can know it is deltion (our own) %%%%%% NOT ALLOWED %%%%%%%%%

	}
	
//	arg: array 
//	retun void
	static void displayArray(int[] arr) {
		for(int i = 0; i< arr.length; i++ ) {
			System.out.println(arr[i]);
		}
	}



}
