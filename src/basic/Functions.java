package basic;

public class Functions {
	public static void main(String[] args) {
		
//		we can  not declare/inisilizaion function/method inside a function/method
//		but we can call method here (inside function)
		
	 	sum(12, 12); // called
		int prod = product(5, 2); // called
		System.out.println(prod);
	}
	//	how to create function/method
	// syntex
	// 1) data_type_for_return (int, char, array, float, void)
	//	i) functionName 
	//	ii) ()
	// iii) data_type parameters / arguments inside paranthisis ()
	// iv) function start with { // start
	// 		function code OR Logic or work
	// 		return somthing
	// } // function end

	// 2) CALL OR INVOKE FUNCTION
	// functionName() // zero parameter
	// functionName(para1) // single parameter
	// functionName(a1, a2) // 2 parameters (seperate by comma ,))
	
	// function qualities
	// 1) takes arguments -> int, String, boolean, array, char, float,....
	// 2) return something -> int ,String, array, boolean, ...., void .
//	example
//	sum of two numbers
//	1) arg: num1, num2
//	2) void (when we no need to return something)
	
	static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
//		we no need to return anything
	}
	
//	get product of two number
//	1) arg: num1, num2
//	return int (product of two number)

	static int product(int num1, int num2) {
		int prod = num1 * num2;
		return prod;
	}
}
