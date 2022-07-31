package basic.bit.manipulation;

public class SumOfBitInPair {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5};
		int result = countSumOfBitAmongAllPair(arr);
		System.out.println(result);
//		printAllPairs(arr);
//		System.out.println();
//		printAllPairsDiagonal(arr);
	}

	static int countSumOfBitAmongAllPair(int[] arr) {
		int countBitDiff = 0;
		// find pairs
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				int xor = arr[i] ^ arr[j];
				countBitDiff += decimalToBinaryAndCount1(xor) * 2;
			}
		}

		return countBitDiff;
	}
	
	static int decimalToBinaryAndCount1(int decimal) {
		int count = 0;
		
		while(decimal != 0) {
			if(decimal % 2 == 1) {
				count++;
			}
			decimal /= 2; 
		}
		
		return count; // string to integer
	}

	/**
	 * This is for display all pair of array
	 * 
	 * arr = {1, 3, 5}
	 * 
	 * @param arr
	 */
	static void printAllPairs(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i] + "," + arr[j] + " | ");
			}
			System.out.println();
		}
	}
	
	static void printAllPairsDiagonal(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(arr[i] + "," + arr[j] + " | ");
			}
			System.out.println();
		}
	}

}
