package basic.newton.school;



	public class lcmAndHcf{
	
		public static void main(String[] args) {
			
		}
//	 		System.out.println("Hello World");
//	      Pythagoras -> Done
//	 		GCD
//	      LCM
//	      Benjamin bulbs
//	      Fibonnaci
//	      Count digits in a Number
//	      Reverse a number

	    // a,b,c
	    // either 
	    // a-sq + b-sq = c-sq
	    // or
	    // b-sq + c-sq = a-sq        
	    // or
	    // a-sq + c-sq = b-sq
	    
	    
	    
	    // int x = -3;
	    // int y = 4;
	    // int z = 5;
	    
	    // boolean isPyTrip = pyTrips(y,x,z);
	    
	    // System.out.println(isPyTrip);
	    
	    
	    int n1 = 24;
	    int n2 = 36;
	    
	    int gcd = alsoGCD(n1,n2);
//	    System.out.println(gcd);
	     
	    
	    
	    // lcm -> (n1*n2)/(gcd);
	    
	    // 4 * 8
	    // 32 -> max ()
	    // max -> 32
	    
		
//	 	n1 -> 24 -> 36 -> 24
	// n2 -> 36 -> 24 -> 12
	// rem -> 24 -> 12 
	// 
		
		public static int alsoGCD(int n1, int n2){
		    while(n1%n2 !=0){
		        int rem = n1%n2;
		        n1 = n2;
		        n2 = rem;
		    }
		    return n2;
		}
		
//	 	n1->24 
	//  n2 ->36
	// answer -> 12
	// min -> 24
	//i -> 1,2,3,4,5,6,7,8,9,10,11,12
		
		public static int gcd(int n1, int n2){
		    int answer = 1;
		    int min = n1>n2 ? n2: n1; //Math.min(n1,n2);
		    
		    for(int i=1; i<= min; i++){
		        if(n1%i == 0 && n2%i == 0){
		            answer = i;
		        }
		    }
		    return answer;
		}
		
		
//	 	public static boolean pyTrips(int a, int b, int c){
//	 	    if(a < 0 || b< 0 || c <0){
//	 	        return false;
//	 	    }
		    
//	 	    if(a > b && a > c){
//	 	        if(a*a == (b*b + c*c)){
//	 	            return true;
//	 	        }
//	 	    }else if(b > a && b > c){
//	 	        if(b*b == (a*a + c*c)){
//	 	            return true;
//	 	        }
//	 	    }else{
//	 	        if(c*c == (a*a + b*b)){
//	 	            return true;
//	 	        }
//	 	    }
//	 	    return false;
	}
//	 	}
	

