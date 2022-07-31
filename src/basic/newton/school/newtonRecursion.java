package basic.newton.school;


//Multiplication
//Easy
//
//Problem Statement
//Given two numbers m and n, multiply them using only "addition" operations.
//Input
//User Task:
//Since this will be a functional problem, you don't have to take input.
//You just have to complete the function Multiply() that takes the integer M and N as a parameter.
//
//Constraints:
//1 ≤ T ≤ 100
//0 ≤ M, N ≤ 100
//Output
//Return the product of N and M.
//Example
//Sample Input
//2
//2 3
//3 4
//
//Sample Output
//6
//12
//package basic.newton.school;

  public class newtonRecursion {
	  public static void main(String[] args) {
	
	  }
	 
	 static int  Multiply_by_recursion(int m, int n) 
	    { 
	      if(n==0 || m==0){return 0;}
	    if (m == 1){ 
	        return n;
	    }
	    return n + Multiply_by_recursion(n,m-1); 
	    }
}
