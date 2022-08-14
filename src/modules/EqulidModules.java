package modules;

 class EqulidModules {
	
public static void main(String[] args) {
	System.out.println(power(2,4));  // call main function of line 11
	

}

public static int power(int a, int b) {
	if(b == 0) {
		return 1;
	}else {
		return a*power(a,b-1);
	}
}
}
