package basic.newton.school;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AreaOfSquare {
    public static void main (String[] args) {
                      // Your code here
                     
int length, area;
      Scanner sc = new Scanner(System.in);
    
      length = sc.nextInt();
      area = length* length;
      
      System.out.println(area);
                            
    }
}
