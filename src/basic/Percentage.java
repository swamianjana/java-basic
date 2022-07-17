package basic;

import java.util.Scanner;

public class Percentage {

	
    public static void main (String[] args) {
        // Your code here
Scanner Scn = new Scanner(System.in);
int a = Scn.nextInt();           
int b = Scn.nextInt();           
int c = Scn.nextInt();           
int d = Scn.nextInt();  

int per = ((a+b+c+d) / 400) * 100;

System.out.println(per);         
}
}
