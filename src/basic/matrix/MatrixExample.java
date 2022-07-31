
//Rotate the matrix
//Easy
//
//Time Limit: 2 sec
//Memory Limit: 128000 kB
//Problem Statement
//Given a matrix of N*N dimensions (Mat). Print the matrix rotated by 90 degree and 180 degree.
//Input
//First line contains N.
//N lines follow each containing N space seperated integers.
//
//2 <= N <= 100
//1 <= Mat[i][j] <= 10000
//Output
//Output 2*N+1 lines.
//First N lines should contain the Matrix rotated by 90 degrees.
//Then print a blank line.
//Then N lines should contain the Matrix rotated by 180 degrees.
//Example
//Sample Input
//2
//3 4
//7 6
//
//Sample Output
//7 3
//6 4
//
//6 7
//4 3
//
//Sample Input:
//2
//1 2
//3 4
//
//Sample Output:
//3 1
//4 2

//4 3
//2 1
package basic.matrix;

import java.util.Scanner;

//https://kbroman.org/github_tutorial/pages/init.html
public class MatrixExample {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row size");
		int rowLength = scan.nextInt();
		
		System.out.println("Enter column size");
		int colLength = scan.nextInt();
		int[][] matrix = new int[rowLength][colLength];
		
		for(int row = 0; row < rowLength; row++) {
			System.out.println("please insert values for "+ row + "th row");
			for(int col = 0; col < colLength; col++) {
				matrix[row][col] = scan.nextInt();
			}
		}
		
		System.out.println("original Matrix");
		display2DArray(matrix);

		System.out.println("after 90 degree Roate matrix");
		roate90Matrix2nWay(matrix, rowLength, colLength);
		
//		rotateMatrixBy90Degree(matrix, rowLength, colLength);
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
//	1 ways but it take too much time 
     static void rotateMatrixBy90Degree(int[][] matrix, int rowLength, int columnLength) {
    	 int[][] roateMatrix = new int[columnLength][rowLength];
    	 for(int col = 0, roateRow = 0;  col < columnLength; col++, roateRow++ ) {
    		 for(int row = rowLength-1, roateCol = 0; row >= 0; row--, roateCol++) {
    			 roateMatrix[roateRow][roateCol] = matrix[row][col];
    		 }
    	 }
    	 display2DArray(roateMatrix);
     }
//     2 ways 
     static void roate90Matrix2nWay(int[][] matrix, int rowLength, int columnLength) {
    	 
    	 //transpose matrix
    	 for(int row = 0; row < rowLength; row++ ) {
    		 for(int col = row + 1; col < columnLength; col++) {
    			 int temp  = matrix[row][col];
    			 matrix[row][col] = matrix[col][row];
    			 matrix[col][row] = temp;
    		 }
    	 }
    	 System.out.println("transpose Matrix");
    	 display2DArray(matrix);
    	 
    	 //swap columns
    	 for(int row = 0; row < rowLength; row++) {
    		 for(int col = 0; col < columnLength/2; col++) {
    			 int temp = matrix[row][col];
    			 matrix[row][col] = matrix[row][columnLength -1 -  col];
    			 matrix[row][columnLength - 1 - col] = temp;
    		 }
    	 }
    	 System.out.println("answer-----");
    	 display2DArray(matrix);
     }
     
     static void display2DArray(int[][] matrix) {
    	 for (int i = 0; i < matrix.length; i++) {
 			for (int j = 0; j < matrix[i].length; j++) {

 				System.out.print(matrix[i][j] + " ");
 			}
 			System.out.println();
 		}
     }
}
// 1  2  3  4   ->answer  13  9  5  1							1  5  9  3
// 5  6  7  8             14  10 6  2		-> transpose        2  6  10  14
// 9  10 11 12			  15  11 7   3							3  7  11   15
// 13 14 15 16            16  12 8   4							4  8  12   16