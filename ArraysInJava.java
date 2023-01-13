package BasicsJava;

import java.util.Arrays;

public class ArraysInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
		// positive index only in Java.
		// Index starts from 0 and so on.
		// The end index is always array.length - 1. (last item)
		// Arrays are continuous memory locations.
		
		// Create an array.
		// Method 1
		//Declaring an array with the data type, name of the array, array symbol notation.
		// Way 1
		//int array1[];
		//Way 2
		int[] array1;
		// int[] array1, //[] To indicate array.
		// Mention in the size of the array.
		array1 = new int[5]; // 5 is the number of elements.
		array1[0] = 1;
		array1[4] = 1;
		// If values are not specified the default value is zero.....
		for (int i = 0;i<array1.length;i++) {
		System.out.println(array1[i]);
		}
		for (int i : array1) {
			System.out.println(i);
		}
		// To print array as a string.
		System.out.println(Arrays.toString(array1));

	}
}
