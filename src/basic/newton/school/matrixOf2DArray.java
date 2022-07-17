package basic.newton.school;

public class matrixOf2DArray {
	public static void main (String[] args) {
	int[][] arr1 = {{4,1,2},
			       {5,1,1}};
	
	int[][] arr2 = {{1,2,3},
			        {2,2,1},
			        {7,8,9}};
	
//	arr1*arr2 will be multiply 
	int[][] ans = new int[arr1.length][arr2[0].length];
	
	for(int i = 0; i < ans.length; i++) {
	for(int j = 0; j < ans[0].length; j++) {
	for(int k = 0; k < arr2.length; k++) {
	ans[i][j] += arr1[i][k]*arr2[k][j];
	}
//	System.out.print(ans);
	}
	}
	}
	
	}
	
	


