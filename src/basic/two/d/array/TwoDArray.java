package basic.two.d.array;

public class TwoDArray {

	public static void main(String[] args) {
		//two D Array: array of array (combination of array)
		
		int[][] twoDArray = new int[2][3];
		
//		{    0 1 2
//		0-> {0,0,0} 
//		1-> {0,0,0}
		
		//fetch (display)
		// variableName[row index][column index]
		System.out.println(twoDArray[0][0]);
		System.out.println(twoDArray[1][2]);
		
		// update
		// variableName[row Index][row Index] = value
		
		twoDArray[0][0] = 5;
//		{    0 1 2
//		0-> {5,0,0} 
//		1-> {0,0,0}
		System.out.println(twoDArray[0][0]);
		
		twoDArray[1][1] = 7;
//		{    0 1 2
//		0-> {5,0,0} 
//		1-> {0,7,0}
		
		System.out.println(twoDArray[1][1]);
		
		// find length
		// row
		// variableName.length
		System.out.println(twoDArray.length);
		
//		find length column
		// variableName[row index].length
		System.out.println( "column length "+ twoDArray[0].length);
		
		
		// display full array
		for(int row = 0; row < twoDArray.length; row++) {
//			twoDArray[0] => {5 ,0 ,0} // 0th array 
//			twoDArray[1] => {0 ,7 ,0} // 1th array
			for(int column =0; column < twoDArray[row].length; column++) {
//				System.out.println(row + "th row and " + column + "th column " + twoDArray[row][column] + " ");
				System.out.print(twoDArray[row][column] + " ");
			}
			System.out.println();
		}
		
	}
}
