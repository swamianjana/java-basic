package basic.newton.school;

//public class RAMGrade {
	
	import java.io.*; // for handling input/output
	import java.util.*; // contains Collections framework

	// don't change the name of this class
	// you can add inner classes if needed
	class RAMGrade {
	    public static void main (String[] args) {
	                      // Your code here
	       Scanner Scn = new Scanner(System.in);
	       int a = Scn.nextInt();           
	       int b = Scn.nextInt();           
	       int c = Scn.nextInt();           
	       int d = Scn.nextInt();  
	       float total = a + b + c + d;
	       // System.out.println( ((float)total / 400.0f));
	       float per = (total / 400) * 100;

	       //System.out.println((int)per);
	        System.out.println((a + b +c +d) * 100 / 400);
	    }
	}

