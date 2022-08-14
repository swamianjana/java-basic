package basic.bit.manipulation;

public class Operations {

	public static void main(String[] args) { // this is a main function
		int xor = 1 ^ 2;			// ^ this is a symbole to representtion  xor
		System.out.println(decimalToBinary(xor));  // xor is a parameter
		
		System.out.println(decimalToBinary(4));
	}
	
	static int decimalToBinary(int decimal) {
		String binary = "";  // empty string to store values from down side
		
		while(decimal > 0) {		// (>) use greater than symbole
			int rem = decimal % 2;		// % this is a modules use for a reminder
			binary = rem + binary;	// binary is only a name of variable .we also put another name aswell
			decimal = decimal / 2;   // divide(/) use for totally divided 
		}
		 
		return Integer.valueOf(binary); // string to integer
	}
}
