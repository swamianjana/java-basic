package modules;

 class gcdEqulid {
//	/ Online Java Compiler
	// Use this editor to write, compile and run your Java code online

//	class HelloWorld {
		
	    public static void main(String[] args) {
	       
	        
	        Pair pair = euclid(20,15);
	        
	        System.out.println(pair.x+"   "+pair.y);
	        
	    }
	    
	    static class Pair{
	      int x;
	      int y;
	      int gcd;
	      
	      public Pair(){}}  // oops concept
	    
	    // x = y2
	    // y = x2 - (a/b)*y2;
	    
	    
	    
	    public static Pair euclid(int a, int b){
	        if(b  == 0){
	            Pair baseAnswer = new Pair();
	            baseAnswer.x = 1;
	            baseAnswer.y = 1;
	            baseAnswer.gcd = a;
	            
	            return baseAnswer;
	        }
	        
	        Pair recursiveAns = euclid(b, a%b);
	        
	        Pair finalAns = new Pair();
	        finalAns.x = recursiveAns.y;
	        finalAns.y = recursiveAns.x - (a/b)*(recursiveAns.y);
	        finalAns.gcd = recursiveAns.gcd;
	        
	        return finalAns;
	    }
	}


