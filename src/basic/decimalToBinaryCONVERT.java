package basic;

 class decimalToBinaryCONVERT {
	
	public static void convert(int n) {
		int Arr[] = new int[10];
//		BINARY ARRAY
		int i = 0;
		while (n > 0) {
//			SORTING REMINDER TO BINARY ARRAY
			Arr[i] = n % 2;
			n = n / 2;
			i++;
		}
		
//		PRINT BINARY ARRAY IN REVERSE ORDER
		for(int j = i-1; j >=0; j--) {
			System.out.print(Arr[j]);
		}
		System.out.println();
	}

//  to run the code 
public static void main (String [] args) {
convert( 9);
convert(8);
convert (10);
}
}