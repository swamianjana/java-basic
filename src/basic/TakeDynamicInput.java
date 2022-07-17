package basic;

import java.util.Scanner;

public class TakeDynamicInput {

	public static void main(String[] args) {
		String str = "Naveen";

		Scanner input = new Scanner(System.in);
		
//		String str1 = input.nextLine();
		System.out.println("enter array size");
		int size = input.nextInt(); // 3
		
		System.out.println("enter values");
		
		int[] arr = new int[size]; // create new array
//		index: 0 1 2
//		value: 0 0 0
		
		for(int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}
//		index: 0 1 2 3 4
//		value: 1 2 3 4 5
	
//		System.out.println("array " + arr );
		// fetch all values
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Hello " + str);
//		System.out.println("Hello " + str1);
		System.out.println("Hello " + size);
	}
}
