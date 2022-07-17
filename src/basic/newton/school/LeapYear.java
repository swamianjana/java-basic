package basic.newton.school;

import java.util.Scanner;

public class LeapYear {
	public static void main (String[] args) {
        // Your code here
Scanner Scn = new Scanner(System.in);
int year = Scn.nextInt();

if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
System.out.println("YES");
}else {
System.out.println("NO");
}
}

}
