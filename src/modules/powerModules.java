package modules;

 class powerModules {
	public static void main(String[] args) {
		System.out.println(power(2,63));  // call main function of line 11
		
		long a = 2147483648L;   //  2 power(^) of 31 value is 2147483648   -> ^ this is power sign 
		long b = 1000000007L;   //  10 ^ 9 + 7 value is   1000000007
		
		System.out.println(a % b);   // % this is a modules sign 
		
	}

	public static long power(long a, long b) {
		long m = 1000000007;
		if(b == 0) {
			return 1;
		}else {
			long res = ((a % m)*(power(a,b-1) % m)) % m;  // property of modules
			return res;
		}
	}
	}


