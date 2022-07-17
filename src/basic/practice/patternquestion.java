package basic.practice;

//import java.util.Scanner;


public class patternquestion {
	public static void main(String[] args) {
//		NOTE always print "J" 
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
		for(int i=1; i<=5; i++) {
		for(int j=1; j<=i; j++) {
		System.out.print("* ");	
		}
		System.out.println();                           //0 th code
	}
		System.out.println("----------00------");
//we print below pattern 
//		1 
//		2 1 
//		3 2 1 
//		4 3 2 1 
//		5 4 3 2 1 
		int n = 5;                           //1 st code
		for(int i = 1; i <=n; i++){ // start from i = 1,then condition true then comes to j=1,then condition true
//then print j=1 then i++ then j>=1 if it true then code run otherwise code comes to i++ then i <=n then j=1 then
	// it run as written in rough notebook.
		for(int j = i; j >=1; j--) { // 
		System.out.print(j + " "); //code comes here when code comes to true and it run till code true
		}
		System.out.println();//code comes here when code  comes to false condition 		System.out.println("----------------");
		}
		System.out.println("------------1---------");
//we print below pattern
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
		int a = 5;
		for(int i = 0;i < a; i++) {
		for(int j = 0; j <=i; j++) {                       //2 nd code 2 likha h uske uper vala h 2nd code
		System.out.print("* ");
		}
		System.out.println();
		}
		System.out.println("----------2--------------");
		
//print this below pattern
//		* * * * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		int space = 6;
		for(int i = space-1; i >= 0;i--) {
		for(int j = 0;j <=i;j++) {
		System.out.print("*" + " ");                       // 3 rd code
		}
		System.out.println();
		}
		System.out.println("-------3-------");
// print this below pattern
//		 *
//	     **
//	    ***
//	   ****
//	  *****
//	 ******
//	*******
		int space1 = 5;
		for(int i = 0; i<= space1; i++) {
		for(int j = 1; j<= space1-i; j++) {                          
		System.out.print(" ");
		}
		for(int x = 0; x <=i; x++) {		// 4 th code
		System.out.print("*");
		}
		System.out.println();
		}
		System.out.println("-----------4----------------");
		  
// we print below pattern
//	* * * * * 
//	  * * * * 
//	   * * * 
//	    * * 
//	     *	
	int space2 = 5;
	for(int i = 0; i <= space2-1; i++) {
	for(int j = 0;j <= i; j++){
	System.out.print(" ");
	}
	for(int k = 0; k <= space2-1-i;k++) {
	System.out.print("*" + " ");	
	}
	System.out.println();
	}
	System.out.println("---------5------------");
	
//we print below pattern	
//	*****
//	 ****                                    5th code
//	  ***
//	   **
//	    *
	}
}
	
