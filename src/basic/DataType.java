// to run java file
// Alt + shift + X then j
package basic;

public class DataType {
	
	public static void main(String[] arg) {

//		data types;

		//		syntex
//		dataType variableName = value;

		//		boolean; true or false
//		char; A or B or C
//		int; -2^31 to 2^31 ( 1 or 2 ... )
//		float; -2^31 to 2^31 (deciaml values 1.1 or 1.5 or 10.0)
//		long; -2^61 to 2^61 ( 1 or 2 ... )
//		double -2^61 to 2^61 (deciaml values 1.1 or 1.5 or 10.0)
		
//		boolean
//		jS: let isPased = true;
		boolean isPassed = false;		// java written in this type
//		
//		console.log("is passed value" + isPassed)
		System.out.println("is passed value =  " + isPassed);
		
//		int: for integer ( 1 2----- ). does not include decimal value;
		
		int num1 = 3;
		System.out.println("num1 value " + num1);
		
//		int num2 = 3.1; gives error for missmatch
		
//		char: for single character
//		A, a , 1, 3, . , 
		
		char vowelChar = 'A';
		char vowelChar1 = '!';
		
		char var1 = 'A', var2 = 'B', var3 = 'd';
		
//		console.log(vowelChar);
		System.out.println("vowel Value " + vowelChar);
		
		System.out.println("vowel Value " + vowelChar1);
		System.out.println("var1 Value " + var1);
		System.out.println("var2 Value " + var2);
		System.out.println("var3 Value " + var3);
		
//		float: decimal value
//		1.21 or 5.2234234, 6.0, 4.3
//		use f end of the line
		float percentage = 99.99f;
		
		System.out.println("Percenatge = " + percentage);
		
//		long: use for integer but bigger than int range
//		use l end of the line
		long phoneNumber = 123345567852l;
	}
}
