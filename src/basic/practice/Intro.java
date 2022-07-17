package basic.practice;

import java.util.*;

public class Intro {
	public static void main(String[] arg) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);

////input of int
		int a = sc.nextInt();
//  System.out.println(a);
//  
//  System.out.println( " a = " + a);
//  
////  input of char
//  char n = sc.next().charAt(0);
//  System.out.println(" n = " + n);
//  
////  input of string
//  String name = sc.nextLine();
//  System.out.println(" name = " + name);

//  int b = 5;
		int fact = 1;
		for (int b = a; b >= 1; b = b - 1) {
			fact = fact * b;

		}
		System.out.println(" fact = " + fact);

		int sum = 0;
		for (int i = 0; i <= a; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		int x = 55;
		int y = 55;
		int z = 2;

		if (x >= y && x >= z) {
			System.out.println('x');
		} else if (y >= z && y >= x) {
			System.out.println('y');
		} else {
			System.out.println('z');
		}
		
		

	}
}
