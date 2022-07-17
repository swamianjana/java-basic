package basic.newton.school;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class RMS {
	public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
	
//	String str1 = input.nextLine();
	// System.out.println("enter array size");
	int size = input.nextInt();
	
	// System.out.println("enter values");
	
	int[] arr = new int[size];
	
	for(int i = 0; i < size; i++) {
		arr[i] = input.nextInt();
	}

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            sum = sum + (arr[i] * arr[i]);
        }

        // System.out.println(sum);
        double mean = (double) sum / size;
        // System.out.println(mean);
        
        double sqRoot = Math.sqrt(mean);
        // DecimalFormat df = new DecimalFormat("#.######");
        // df.setRoundingMode(RoundingMode.CEILING);

        sqRoot = Math.round(sqRoot * 1000000d) / 1000000d;
        // System.out.println(df.format(sqRoot));
        System.out.println(sqRoot);

}
}
