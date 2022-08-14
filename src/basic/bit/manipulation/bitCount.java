package basic.bit.manipulation;
import java.lang.Integer;

class bitCount {
	// Java program to demonstrate working
	// of java.lang.Integer.bitCount() method

	
		// driver code
		public static void main(String args[])
		{
			int a = 7;

			// Convert integer number to binary format
			System.out.println(Integer.toBinaryString(a));

			// to print number of 1's in the number a
			System.out.println(Integer.bitCount(a));
		}
	}


