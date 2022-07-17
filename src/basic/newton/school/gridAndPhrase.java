package basic.newton.school;

//Grid and phrase
//Easy
//
//Time Limit: 2 sec
//Memory Limit: 128000 kB
//Problem Statement
//You are given an n*m grid which contains lower case English letters. How many times does the phrase "saba" appear horizontally, vertically, and diagonally in the grid?
//Input
//First line: Two integer n and m, where n denotes the number of rows and m denotes the number of columns in the grid
//Next n lines: Each line must contain a string of length m which contains lower- case English letters only
//
//Constraints:
//1<=n, m<=100
//Output
//Print the number of times the word “saba” appears in the grid.
//
//Example
//Sample Input 1:
//5 5
//s a f e r
//a m j a d
//b a b o l
//a a r o n
//s o n g s
//
//Sample Output 1:
//2

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class gridAndPhrase {
    public static void main (String[] args) {
         Scanner sc =new Scanner(System.in);
                      int n =sc.nextInt();
                      int m =sc.nextInt();
                      char arra[][]=new char[n][m];
                      for(int i=0;i<n;i++){
                          for(int j=0;j<m;j++){
                         arra[i][j]=sc.next().charAt(0);
                          }
                      }
                      int ans =0;
                      for(int i = 0; i < n; i++) {
    			      for(int j = 0 ; j < m; j++) {
    				if(arra[i][j]=='s') {
    					if(j<=m-4) {
    						if(arra[i][j+1]=='a' && arra[i][j+2]=='b' && arra[i][j+3]=='a')
							 ans++;
    					}
    					if(i<=n-4) {
    						if(arra[i+1][j]=='a' && arra[i+2][j]=='b' && arra[i+3][j]=='a') 
							ans++;
    					}
    					if(i<=n-4 && j<=m-4) {
    						if(arra[i+1][j+1]=='a' && arra[i+2][j+2]=='b' && arra[i+3][j+3]=='a') 
							ans++;
    					}
    					if(i>=3 && j<=m-4) {
    						if(arra[i-1][j+1]=='a' && arra[i-2][j+2]=='b' && arra[i-3][j+3]=='a') 
							ans++;
    					}
    				}
    			}
    		}
            System.out.println(ans);

    }
}