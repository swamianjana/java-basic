package basic.newton.school;

//Row with maximum 1's
//Easy
//
//Time Limit: 2 sec
//Memory Limit: 128000 kB
//Problem Statement
//Given a boolean matrix of size N*M in which each row is sorted your task is to print the index of the row containing maximum 1's. If multiple answer exist print the smallest one.
//Input
//First line contains two space separated integers denoting values of N and M. Next N lines contains M space separated integers depicting the values of the matrix.
//
//Constraints:-
//1 < = M, N < = 1000
//0 < = Matrix[][] < = 1
//Output
//Print the smallest index (0 indexing) of a row containing the maximum number of 1's.
//Example
//Sample Input:-
//3 5
//0 1 1 1 1
//0 0 0 1 1
//0 0 0 1 1
//
//Sample Output:-
//0
//
//Sample Input:-
//4 4
//0 1 1 1
//1 1 1 1
//0 0 1 1
//1 1 1 1
//
//Sample Output:-
//1

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class rowMaximum {
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

        int ans = 0, count = n;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(matrix[i][j] == 1){
                    if(count > j){
                        ans = i;
                        count = j;
                    }
                }
			}
		}     
        System.out.println(ans);  
	}
}
