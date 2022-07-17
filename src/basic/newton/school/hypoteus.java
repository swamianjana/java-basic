package basic.newton.school;

public class hypoteus {
	public static boolean pyTrips(int a, int b, int c){
	    if(a < 0 || b< 0 || c <0){
	        return false;
	    }
	    
	    if(a > b && a > c){
	        if(a*a == (b*b + c*c)){
	            return true;
	        }
	    }else if(b > a && b > c){
	        if(b*b == (a*a + c*c)){
	            return true;
	        }
	    }else{
	        if(c*c == (a*a + b*b)){
	            return true;
	        }
	    }
	    return false;
	}
}
