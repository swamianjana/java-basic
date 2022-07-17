package basic.newton.school;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
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
