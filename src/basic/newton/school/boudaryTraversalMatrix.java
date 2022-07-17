package basic.newton.school;
//Boundary Traversal of Matrix
//Easy
//
//Time Limit: 2 sec
//Memory Limit: 128000 kB
//Problem Statement

//You are given a matrix A of dimensions n x m. The task is to perform boundary traversal on the matrix in clockwise manner.
//Input

//The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase two lines of input. The first line contains dimensions of the matrix A, n and m. The second line contains n*m elements separated by spaces.
//
//Constraints:

//1 <= T <= 100
//1 <= n, m <= 30
//0 <= A[i][j] <= 100
//Output

//For each testcase, in a new line, print the boundary traversal of the matrix A.
//Example
//Input:
//4
//4 4
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//3 4
//12 11 10 9 8 7 6 5 4 3 2 1
//1 4
//1 2 3 4
//4 1
//1 2 3 4
//
//Output:
//1 2 3 4 8 12 16 15 14 13 9 5
//12 11 10 9 5 1 2 3 4 8
//1 2 3 4
//1 2 3 4
//
//Explanation:
//Testcase1: The matrix is:
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16
//The boundary traversal is 1 2 3 4 8 12 16 15 14 13 9 5
//Testcase 2: Boundary Traversal will be 12 11 10 9 5 1 2 3 4 8.
//Testcase 3: Boundary Traversal will be 1 2 3 4.
//Testcase 4: Boundary Traversal will be 1 2 3 4.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class traversal {
    public static void main (String[] args) {
             Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i, j;

        for (int p = 0; p < x; p++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (i = 0; i < m; i++) {
                System.out.print(arr[0][i] + " ");
            }

            for (i = 1; i < n; i++) {
                System.out.print(arr[i][m - 1] + " ");
            }

            if (n > 1) {
                for (i = m - 2; i >= 0; i--) {
                    System.out.print(arr[n - 1][i] + " ");
                }
            }
            if (m > 1) {
                for (i = n - 2; i > 0; i--) {
                    System.out.print(arr[i][0] + " ");
                }
            }System.out.println(" ");
        }
    }
    
}
