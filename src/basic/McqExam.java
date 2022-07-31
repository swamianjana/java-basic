package basic;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class McqExam {


	// don't change the name of this class
	// you can add inner classes if needed
	    public static void main (String[] args) {
	         // Your code here
	         Scanner scn = new Scanner(System.in);
	         int p = scn.nextInt();             
	         int q = scn.nextInt();             
	         int r = scn.nextInt();             
	         int s = scn.nextInt();  
	   

	         if(p > q && p > r && p > s) {
	           System.out.println(p);
	         }else if (q > r &&  q > s && q > p){
	           System.out.println(q);
	         }else if(r > s && r > q && r > p){
	           System.out.println(r);
	         }else{
	             System.out.println(s);
	         }
	}
}
//}89
//o0p10;