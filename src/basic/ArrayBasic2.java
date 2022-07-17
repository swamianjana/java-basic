package basic;

public class ArrayBasic2 {
	// main = functionName
//	 args = variableName
	public static void main(String[] args) {

		// variables: it is use for store values
		// datatype variableName = value
//		exmple
		int marks = 56;
//		int = dataype
//		marks = variableName
//		56 = value

		// array: comination of similar data types
		// int
//		String[] (datatype para1,  datatype para) -- wrong

//		Array syntex
//		datatype[] variableName = {value1, value 2};
		
		// array of int
		int[] markArr = {1, 2, 4}; // intisilization with values
		
		// fetch
		System.out.println(markArr[0]);
		System.out.println(markArr[1]);
		System.out.println(markArr[2]);
		System.out.println("-------------------");
		for(int i = 0; i < markArr.length; i++) {
			System.out.println(markArr[i]);
		}
		
		System.out.println("--------------------");
		
		// crate array with size not with values
//		datatype[] variableName = new datatype[size];
		int[] colony = new int[5];
		
		// fetch value for 0th index(ploat)
		System.out.println(colony[0]);
		System.out.println(colony[1]);
		
		System.out.println("-------------------");
		// update
		// varialbeName[index] = value
		// we have update oth index(ploat) in array (colony) with value(building) = 10
		colony[0] = 10;
		System.out.println(colony[0]);

		// function : javascript
		// function functionName(parameter1, para2) {
//			logic
		// return variableName;
//	}

		// java
		// static datatype functionName(datatype para1, datatype para2){
//	 		 logic
//			return variableName;
//			}
		
			

	}
}
