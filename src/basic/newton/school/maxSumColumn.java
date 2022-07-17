package basic.newton.school;

//Max sum column
//Easy
//
//Time Limit: 2 sec
//Memory Limit: 128000 kB
//Problem Statement
//Given a matrix of size M*N, your task is to find the maximum sum of a column.
//Input
//The first line of input contains two space- separated integers M and N. The next M lines of input contains N space- separated integers each depicting the values of the matrix.
//
//Constraints:-
//1 <= M, N <= 100
//1 <= Matrix[][] <= 100000
//Output
//Print the maximum sum between the columns.
//Example
//Sample Input:-
//3 3
//1 2 3
//4 5 6
//7 8 9
//
//Sample Output:-
//18
//
//Explanation:-
//1 + 4 + 7 = 12
//2 + 5 + 8 = 15
//3 + 6 + 9 = 18
//maximum = 18
//
//Sample Input:-
//3 2
//1 4
//9 6
//9 1
//
//Sample Output:-
//19

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class maxSum {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int matrix[][] = new int[m][n];

		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		/*
			1 2 3
			4 5 6 
			7 8 9
			
			j = 0, i = 2, maximum_column = -2^31
			sum_column = 1 + 4 + 7 = 12, maximum_column = 12
			j = 1, i = 0, maximum_column = -2^31
			sum_column = 2 + 5 + 8 = 15, maximum_column = 15
		*/

		int maximum_column = Integer.MIN_VALUE;
		for(int j = 0; j < n; j++){
			int sum_column = 0;
			for(int i = 0; i < m; i++){
				 sum_column += matrix[i][j];
			}
			maximum_column = Math.max(maximum_column, sum_column);
		}
		System.out.println(maximum_column);

	}
}
