package modules;

 class modulesGCD {

	 public static void main(String[] args) {
		
		 System.out.println(gcd(15,20));
	 }
	 
//	 gcd (a,b) -> gcd(b, a % b)
	  public static int gcd(int a, int b) {
		
		  return a == 0 ? b : gcd(b % a, a);  // property of EQULID 
		  
	  }
}
