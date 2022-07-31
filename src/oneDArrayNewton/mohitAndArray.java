//Mohit and array
//Easy
//
//Time Limit: 2 sec
//Memory Limit: 128000 kB
//Problem Statement
//Mohit has an array of N integers containing all elements from 1 to N, 
//somehow he lost one element from the array.
//Given N-1 elements your task is to find the missing one.
//Input
//First line of input contains a single integer N, the next line contains N-1 space separated integers.
//
//Constraints:-
//1 < = N < = 1000
//1 < = elements < = N
//Output
//Print the missing element
//Example
//Sample Input:-
//3
//3 1
//
//Sample Output:
//2
//
//Sample Input:-
//5
//1 4 5 2
//
//Sample Output:-
//3

package oneDArrayNewton;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MohitAndArray {
    public static void main (String[] args) {
                    int i;
                      int sum = 0;
                      Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt();
                      int [] arr=new int[N];
                      for(i=0;i<N-1;i++)
                      {
                          arr[i] =sc.nextInt();
                      }
                       int sumOfAll=(N*(N+1))/2;
                       for(i=0;i<N-1;i++){
                           sum=sum+arr[i];
                       }
                       int mis_num=sumOfAll-sum;
                       System.out.println(mis_num);                   
    }
}