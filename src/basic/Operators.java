package basic;

public class Operators {
	
	public static void main(String[] arg) {
//		+ - / *
//		let num1 =5;
		int num1 = 70;
		int num2 = 3;
		
		int sum = num1 + num2;
		
		System.out.println("sum = " + sum);
		
		int sub = num1 - num2;
		System.out.println("sub = " + sub);
		
		
		
		int multi = num1 * num2;
		System.out.println("mutli = " + multi);
		
		int div = num1 / num2;
		System.out.println("div = " + div);
		
		int mod = num1 % num2;
		System.out.println("mod = " + mod);
		
		int sum1 = 20;
		System.out.println( "SUM1 = " +  sum1);
//		we have to add 10 into sum1;
		sum1 = sum1 + 10;
		
		System.out.println( "SUM1 = " +  sum1);
		
//		we have to add 10 more number into sum1
		
		sum1 = sum1 + 10;
		System.out.println( "sum1  = " +  sum1);
		
//		we have to add 20 more into sum1
//		sum1 = sum1 + 20;
		sum1 += 20; //we can write above line like this also
		
		System.out.println( "sum1 = " +  sum1);
		
		int sub1 = 30;
		// subreact 2 from sub1;
		
		sub1 = sub1 - 2;
		System.out.println( "sub1 = " +  sub1);
		
		// subreact 2 more from sub1;
		
//		sub1 = sub1 - 2;
		sub1 -= 2;
		System.out.println( "sub1 = " +  sub1);
		
		int multi1 = 15;
// 		multi1 = multi1 * 15;
		multi1 *= 15;
		System.out.println("multi1 = " + multi1);
		
		int div1 = 52;
//		div1 = div1 / 52;
		div1 /= 52;
		System.out.println("div1 =" + div1);
		
		
		
		
//		increment opeator ++
		int a = 5;
		System.out.println( "a = " +  a);
		a++;
//		a = a + 1
		System.out.println( "a = " +  a);
		
		int b = 10;
		System.out.println( "b = " +  b);
		b--;
//		b = b - 1
		
		System.out.println( "b = " +  b);
		
		int area2 = areaOfRect(5,6);
		System.out.println(area2);

	}
static int areaOfRect(int length, int width) {
	int area = length * width;
	return area;
}
	
		
//}
	

}
