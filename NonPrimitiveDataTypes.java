package BasicsJava;

public class NonPrimitiveDataTypes {
	// Main method is the entry point in Java in a class.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Non Primitive data types
	       // Can be customized by developers.....
	       //String 
	       String name = "HiHi"; // Only use double quotes.
	       name = "Rin";
	       // Very rare 
	       String name1 = new String("Hello Every");
	       name1 = "Rust";

	       // We are creating an object of String class.
	       // String is basically a sequence of character array.
	       
	       // Array
	       // In Java Arrays are homogeneous data structure.
	       
	       // method 1
	       // Declaring an array 
	       int arr[];
	       // Defining size of Array.
	       arr = new int[5]; // Default values are zero.
	       arr[0]=2;
	       
	       // method 2 Java type array declaration.
	       // Declaration and size at the same time.
	       String arr1[] = new String[2];// Default values for string is null.
	       arr1[0]= "Good";
	       
	       // method 3
	       int arr2[]= {1,4,5,6};
	       String arr3[]= {"a","b","d"};
	       
	       System.out.println("Non Primitive data Types ");
	       System.out.println("String: "+name);
	       System.out.println("String: "+name1);
	       System.out.println(arr[0]);
	       System.out.println(arr[1]);
	       System.out.println(arr[2]);
	       System.out.println(arr[3]);
	       System.out.println(arr[4]);
	       System.out.println(arr1[0]);
	       System.out.println(arr1[1]);
	       System.out.println(arr2[0]);
	       System.out.println(arr2[1]);
	       System.out.println(arr2[2]);
	       System.out.println(arr3[0]);
	       System.out.println(arr3[1]);
	       System.out.println(arr3[2]);

	}

}
