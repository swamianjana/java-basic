package basic.bit.manipulation;

public class Operations {

	public static void main(String[] args) {
		int xor = 1 ^ 2;
		System.out.println(decimalToBinary(xor));
		
		System.out.println(decimalToBinary(4));
	}
	
	static int decimalToBinary(int decimal) {
		String binary = "";
		
		while(decimal != 0) {
			binary = (decimal % 2) + binary;
			decimal /= 2; 
		}
		
		return Integer.valueOf(binary); // string to integer
	}
}
