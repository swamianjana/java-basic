package question;

// fibonacie series means phle or dusre no ko add krege 3rd no. print krna

 class fibonacieSeries {
	 public static void printFactorial(int a, int b, int n) {
		 if(n == 0) {
		 return;
		 }
		 System.out.println(a);
		 printFactorial(b, a+b, n-1);
		 }
		 public static void main(String args[]) {
		 printFactorial(0, 1, 5);
		 }
}
