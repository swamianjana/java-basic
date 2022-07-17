package basic.newton.school;

public class StringQuestion {

	public static void main(String[] args) {
		String str = "Hello"; // reverse: olleH
//		H - 0
//		e - 1
//		l - 2
//		l - 3
//		o - 4

//		we know that we can fetch each character by charAt method
		System.out.println(str.charAt(3));

		String fName = "Anjana";
		String lName = "Swami";
		String fullName = fName + " " + lName;
		System.out.println(fullName);

		String name = "";
//		we have character n,a,v,e,e,n and from that we make it string naveen

		name = name + "n";
		System.out.println(name);
		name += "a";
		System.out.println(name);

		reverseString("anjana");
		reverseInt(1221);
	}

//	anjana
	static void reverseString(String str) {

		String reverseStr = "";

		// fetch indiviusal char
		for (int i = str.length() - 1; i >= 0; i--) {
			// find char : str.charAt(i)
			reverseStr = reverseStr + str.charAt(i);
		}
		System.out.println("actual str " + str);
		System.out.println("reverse str " + reverseStr);

		if (str.equals(reverseStr)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}

//reverse number to string
	static void reverseInt(int N) {
		String str = Integer.toString(N); // int to string convert
		String reverseInt = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseInt = reverseInt + str.charAt(i);
		}
		System.out.println(reverseInt);
		if(str.equals(reverseInt)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	

}
