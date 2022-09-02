package question;


import java.util.*;
import java.lang.*;
import java.io.*;
public class NKnightproblem {

//	* package codechef; // don't place package name! */

	/* Name of the class has to be "Main" only if the class is public. */
	  // 	static int currCounter = 0;
		static int maxCounter;
	    static int currCounter;

	    static Scanner scn = new Scanner(System.in);
		public static void main (String[] args) throws java.lang.Exception{
		   
	        int t = scn.nextInt();
			int m, n;

			while (t > 0) {
				m = scn.nextInt();
				n = scn.nextInt();
				
				char[][] c = new char[m][n];
				
				for(int i=0; i<m;i++){
				    
				    String str = scn.next();
				    
				    for(int j=0; j<n; j++){
				        c[i][j] = str.charAt(j);
				    }
				}

				maxCounter = 0;
	            currCounter = 0;
	            knight(c, 0);
	            
				// System.out.println();
	            System.out.println(maxCounter);
				t--;
			}   
		}
		
		

		
		public static void print(char[][] c){
		    for(int i=0; i<c.length; i++){
		        for(int j =0; j<c[0].length; j++){
		            System.out.print(c[i][j]);
		        }
		        System.out.println();
		    }
		}

		   // knps = knights placed so far
		public static void knight(char [][] c, int cellData){

		    if(cellData >= ((c.length) * (c[0].length))){
	       
			//    print(c);
			//    System.out.println();
		       maxCounter = Math.max(currCounter, maxCounter);
		       
		       return;
		    }
		    
		    int row, col;
		    
		    
		    
	        // for( ;row < c.length; row++){
	        //     for( ; col < c[0].length; col++){
				for(int i = cellData; i < c.length*c[0].length; i++){

					row = i / c[0].length;
					col = i % c[0].length;

					int currCell = row*c[0].length + col;
	           
					boolean isValid = isValid(c, row, col);

					// System.out.println("for row, col -> "+row+","+col+ "-->" + isValid + "cell-> "+currCell);


		             if(isValid){
		                c[row][col] = 'K';


	                    
						// System.out.println("Printing while calling up. Current cell: "+currCell);
						// print(c);
						// System.out.println();
						// System.out.println();
						
						currCounter++;
						
	                    knight(c, currCell+1);
	                    currCounter--;

		                c[row][col] = '.';

						// System.out.println("Printing while backtracking. Current cell: "+currCell);
						// print(c);
						// System.out.println();
						// System.out.println();
		          }
				}
	        //     }
	        // }
		}
		
		public static boolean isValid(char[][] c, int i, int j){
		    if(c[i][j] == '#'){
		        return false;
		    }
		    
		   // i-2, j-1
		   if(i-2 >=0 && j-1 >= 0 && c[i-2][j-1] == 'K'){
		       return false;
		   }
		   
		   // i-1, j-2 (Rahul)
		   if(i-1 >= 0 && j-2 >= 0 && c[i-1][j-2] == 'K'){
	            return false;
		   }
		   
		   // i-2 , j +1 (Sarang)
		   if(i-2 >= 0 && j+1 < c[0].length && c[i-2][j+1]=='K'){
		       return false;
		   }
		   
	       // i-1, j+2 (Nikita)
	       if(i-1 >= 0 && j+2 < c[0].length && c[i-1][j+2] == 'K'){
	         return false;
	        }
	       
	        // i+1, j-2 (Pritam)
	        if(i+1 < c.length  &&  j-2 >= 0  && c[i+1][j-2]=='K'){
	            return false;
	        }
		   // i+2, j-1 (Akshay)
		   if(i+2 < c.length  &&  j-1 >= 0  && c[i+2][j-1]=='K'){
		       return false;
		   }
		   
	        // i+1, j+2 (Nupur)
	        if(i+1 < c.length  &&  j+2 < c[0].length  && c[i+1][j+2]=='K'){
	            return false;
	        }
	        // i+2, j+1 (Lanchenba)
	        if(i+2 < c.length && j+1 < c[0].length && c[i+2][j+1]=='K'){
	            return false;
	        }

		    return true;
		}
	}
