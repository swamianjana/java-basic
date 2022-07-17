package basic.practice;

public class Partern {

	public static void main(String[] args) {
		int num = 5;
		
		// dispaly number from 1 to num
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------------");
		for(int i = 1; i <= num; i++) {
			System.out.print(i  + " ");
		}
		System.out.println();
		System.out.println("dispaly from 5 to 1 horizontal");
		for(int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("dispaly from 5 to 1 verticle");
		for(int i = num; i >= 1; i--) {
			System.out.println(i + " ");
		}
		
		System.out.println("------------------------");
		
		for(int i = 1; i  <= 4; i++) { // verticle
			for(int j = 1; j <= 4; j++) { // horizontal
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 1; i <=5; i++ ) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
//		ASCII values (33 - 126)
		System.out.println("----------------ASCII----------------");
		// find char from ASCII value
		char asciiValue = 33;
		// convert to char
//		charName
		System.out.println("char for ascii value 33 = " + asciiValue);
		
		// find ascii value from char
//		you have to find ascii value of A
		char ch = 'A';
//		(int)charName
		System.out.println((int)ch + 1);
		
		char a = 'a';
		System.out.println((int)a);
		
//		char A = 65;
		char A1 = 97;
		// char + int => int
		System.out.println(A1);
		System.out.println( (char)(A1 + 1));
		System.out.println( (char)(A1 + 25));
		
		for(int i = 0; i < 5; i++ ) {
			char A  = 'A';
			for(int j = 0; j <= i; j++ ) {
				char displayValue = (char)(A + j);
				System.out.print(displayValue + " ");
			}
			System.out.println();
			
System.out.println("pattern number");
		for(int w = 1; w < 6; w++ ) {
//			int A2  = '1';
				for(int j = 1; j <= w; j++ ) {
//					char displayValue = (char)(A2 + j);
					System.out.print( w + " ");
				}
				System.out.println();
			
		}
	}
}
}
