package basic;

class binaryToDecimal {
	static int convert(int n) {
		int num = n;
		int dec_value = 0;

//	initializing base value to 1,so it 2^0
		int base = 1;
		int temp = num;
		while (temp > 0) {
			int lastDigit = temp % 10;
			temp = temp / 10;
			dec_value += lastDigit * base;
			base = base * 2;
		}
		return dec_value;
	}

	public static void main(String[] args) {
		int num = 1000;
		int num1 = 1001;
		System.out.println(convert(num));
		System.out.println(convert(num1));
	}

}
