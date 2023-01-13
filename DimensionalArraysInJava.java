package BasicsJava;

import java.util.Arrays;

public class DimensionalArraysInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = oneDimensionalArray(1,2,2);
		for (int i:array1) {// for each loop similar to for in in python.
		System.out.println(i);
		}
		// Array to string in Java.
		System.out.println(Arrays.toString(array1));
		
		int[][] array2 = twoDimensionalArray(1,2,2,3,2,2);
		for (int i =0;i<array2.length;i++) {
			for (int j =0;j<array2[i].length;j++) {
				System.out.println(array2[i][j]);
			}
		}
		// Array to string in Java.
		System.out.println(Arrays.deepToString(array2));
		
		// Multiple dimensional array requires only [][].
		int[][][] array3 = threeDimensionalArray(1,2,2,4);
		for (int i =0;i<array3.length;i++) {
			for (int j =0;j<array3[i].length;j++) {
				for (int k =0;k<array3[i][j].length;k++) {
				System.out.println(array3[i][j][k]);
			}
		}
		
		}
		// Array to string in Java.
		System.out.println(Arrays.deepToString(array3));
		System.out.println(Arrays.toString(array3[0][1]));
	}
	
	public static int[] oneDimensionalArray(int a,int b,int c) {
		int[] result = {a,b,c};
		return result;
	}
	public static int[][] twoDimensionalArray(int a1,int b1,int c1,int a2,int b2,int c2) {
		int[][] result = {{a1,b1,c1},{a2,b2,c2}};
		return result;
	}
	// Multiple dimensional array requires only [][].
	public static int[][][] threeDimensionalArray(int a1,int b1,int c1,int d1) {
		int[][][] result = {{{a1,b1},{c1,d1}}};
		return result;
	}

}
