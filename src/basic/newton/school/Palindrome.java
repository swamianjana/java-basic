package basic.newton.school;

public class Palindrome {
	public static void main(String[] args) {
	boolean palindrome = isPalindrome(123321);	
	System.out.println(palindrome);
	
	System.out.println(isPalindrome1(123));
	
	
	
	}
	
	// method
	// 2way
	static boolean isPalindrome(int N) {
		
		// 1 way: string
		String str = Integer.toString(N);
		String reverseInt = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseInt = reverseInt + str.charAt(i);
		}
//		System.out.println(reverseInt);
		if(str.equals(reverseInt)) {
			return true;
		}else {
			return false;
		}
	}
	
	static boolean isPalindrome1(int N) {
		
		// 2 way: number
		// N = 123 // 321
		int temp = N;
		int reverseNumber = 0;
		while(N > 0) {
			int lastDigit = N % 10; // 3
			reverseNumber = reverseNumber * 10 + lastDigit;
			N = N / 10; // N / 10 => 123 / 10 => 12.3 =>  12 			
		}
		if(temp == reverseNumber) {
			return true;
		} else {
			return false;
		}
	}
	
}
