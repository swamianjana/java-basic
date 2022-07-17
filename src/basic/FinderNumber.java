package basic;

public class FinderNumber {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		int a = 10;

//		call
		String value = findNumber(a);
		int intValue = findNumberInInteger(a);
		
		switch (intValue) {
		case 1:
			System.out.println("Postive");
			break;
		case -1:
			System.out.println("Negative");
			break;
		default:
			System.out.println("Zero");
		}

//		switch (value) {
//		case "Postive":
//			System.out.println("Postive");
//			break;
//		case "Negative":
//			System.out.println("Negative");
//			break;
//		default:
//			System.out.println("zero");
//		}
	}
// static return data type methodName
	
	static String findNumber(int num) {
//		if (num > 0) {
//			return "Postive";
//		} else if (num < 0) {
//			return "Negative";
//		} else {
//			return "Zero";
//		}
		
//		(condition) ? true : false
		return (num > 0) ? "Postive" : (num < 0) ? "Negative" : "Zero";
	}
	
	static int findNumberInInteger(int num) {
//		if (num > 0) {
//			return "Postive";
//		} else if (num < 0) {
//			return "Negative";
//		} else {
//			return "Zero";
//		}
		
//		(condition) ? true : false
		return (num > 0) ? 1 : (num < 0) ? -1 : 0;
	}


}
