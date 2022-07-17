package basic.newton.school;

//public class matrixZigZagTravel {
//	Matrix ZigZag Traversal
//	Easy
//
//	Time Limit: 2 sec
//	Memory Limit: 128000 kB
//	Problem Statement
//	Given a 2d matrix of size M*N, print the zig traversal of the matrix as shown:-
//
//	Consider a matrix of size 5*4
//	1 2 3 4
//	5 6 7 8
//	9 10 11 12
//	13 14 15 16
//	17 18 19 20
//
//	ZigZag traversal:-
//
//	1
//	5 2
//	9 6 3
//	13 10 7 4
//	17 14 11 8
//	18 15 12
//	19 16
//	20
//	Input
//	First line of input contains two integers M and N. Next M lines contains N space- separated integers each.
//
//	Constraints:-
//	1 <= M, N <= 100
//	1 <= Matrix[i][j] <= 100000
//	Output
//	Print the zig- zag traversal of the matrix as shown.
//	Example
//	Sample Input:-
//	4 3
//	1 2 3
//	4 5 6
//	7 8 9
//	10 11 12
//
//	Sample Output:-
//	1
//	4 2
//	7 5 3
//	10 8 6
//	11 9
//	12
//

	import java.io.*; // for handling input/output
	import java.util.*; // contains Collections framework

	// don't change the name of this class
	// you can add inner classes if needed
	class ZigZag {
	    public static void main (String[] args) {
	          Scanner kb=new Scanner(System.in);

	int M=kb.nextInt();

	int N=kb.nextInt();

	int mat[][];

	mat=new int [M][N];

	for(int i=0;i<M;i++)

	for(int j=0;j<N;j++)

	mat[i][j]=kb.nextInt();

	for(int k=0;k<=M-1;k++)

	{ int i=k;

	int j=0;

	while(i>=0&&j<=N-1)

	{ System.out.print(mat[i][j]+" ");

	i=i-1;

	j=j+1;

	}

	System.out.println();

	}

	for(int k=1; k<=N-1;k++)

	{ int i=M-1;

	int j=k;

	while(j<=N-1&&i>=0)

	{ System.out.print(mat[i][j]+" ");

	i=i-1;

	j=j+1;

	}

	System.out.println();

	}

	}

	}         