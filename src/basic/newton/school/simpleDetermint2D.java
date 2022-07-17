package basic.newton.school;
//
//public class simpleDetermint2D {
//
//}
//Simple-Determinant
//Easy
//
//Time Limit: 2 sec
//Memory Limit: 128000 kB
//Problem Statement
//You are given a 2X2 square matrix. You need to find the determinant of the matrix.
//Input
//The input contains two-line, each line contain two integers separated by spaces.
//
//Each element of the matrix is from 1 to 100.
//Output
//Output a single integer, the determinant of the matrix.
//Example
//Sample Input
//4 5
//2 3
//
//Sample Output
//2
//
//Sample Input
//2 10
//10 40
//
//Sample Output
//-20

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class determint {
    public static void main (String[] args) {
    Scanner scn = new  Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    int d = scn.nextInt();
    int matrix;
    matrix =  a*d- b*c;
    System.out.println(matrix);
    }
}