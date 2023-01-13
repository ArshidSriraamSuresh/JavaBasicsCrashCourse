package BasicsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;// Interface List

public class JavaCollectionsArrayList {
	public static void main(String args[]) {
		// Array Characteristics:
		// It can have only similar data types.
		// It is the ordered collection of same data types.
		// It has static allocation of size.
		// It can be accessed using index.
		// It can hold duplicate values.
		int[] array1 = new int[5];
		array1[0] = 5;
		System.out.println(Arrays.toString(array1));
		// Accessing from arrays.
		// Accessed using index.
		System.out.println(array1[0]);
		
		//ArrayList
		// Only difference between Arrays and ArrayList is dynamic allocation of size.
		// Type of declaration.
		// Declaration 1
		ArrayList array2 = new ArrayList();
		array2.add(1);// Similar to append in lists in Python.
		array2.add(5);
		System.out.println(array2);
		array2.add(7);
		array2.add("string");
		array2.add(true);
		array2.add(4.0d);
		System.out.println(array2);
		// Can have any data types.
		// Similar to Python Lists.
		// Accessing in ArrayList
		// Accessed using index.
		// Square notation does not work.
		System.out.println(array2.get(0));
		System.out.println(array2.get(0).getClass());
		System.out.println(array2.get(3).getClass());
		System.out.println(array2.get(4).getClass());
		System.out.println(array2.getClass());
		
		// Without mentioning the generic the items are stored as objects.
		ArrayList list = new ArrayList();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(7);
		int total=0;
		for(Object i: list)
		{
			System.out.println(i);
			//total = total+get(i);
		}
		// Concept
	// generic: <Integer>
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(7);
		
		for(int i: list2)
		{
			total+=i;
			System.out.println(i);
			
		}
		System.out.println(total);
		// Multiple generic cannot be given in ArrayList.
		
		// Best practice for declaring an array list
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(2);
		list3.add(4);
		list3.add(6);
		list3.add(7);
		int total1=0;
		for(int i: list3)
		{
			System.out.println(i);
			total1+=i;
		}
		System.out.println(list3);
		
		
		// Array list itself has not defined size but we can mention default size.
		// Best practice for declaring an array list with default size.
		List<Integer> list4 = new ArrayList<Integer>(9);
		// Below code line also works fine.
		//List<Integer> list4 = new ArrayList<>(9);
		list4.add(2);
		list4.add(4);
		list4.add(6);
		list4.add(7);
		list4.add(2);
		list4.add(4);
		list4.add(6);
		list4.add(7);
		list4.add(2);
		list4.add(4);
		int total2=0;
		for(int i: list4)
		{
			System.out.println(i);
			total2+=i;
		}
		System.out.println(list4);

		// Remove elements from array list
		list4.remove(4);// int index
		System.out.println(list4);
		list4.remove(Integer.valueOf(4));// int index
		System.out.println(list4);
		list4.remove(Integer.valueOf(2));// int index
		System.out.println(list4);
		
		
		// array.length in Arrays is array.size() in ArrayList.
		for (int i = 0;i<list4.size();i++) {
			System.out.println(list4.get(i));
		}
		
		// Enhanced for loop.
		for (int i: list4) {
		System.out.println(i);
		}
		
		}
		// For diagram on Java collections
		// Reference and attribution: Simplilearn
		// Refer Video: https://www.youtube.com/watch?v=KnEeMj58w3A
		// Time: 3:11:24 / 10:46:37
		
		
		
		
		
		
		
	}
	
	
	// What is an Interface?
	// An interface is a generic blueprint of specific class implementation.
	// Example: Vehicles is an interface and cars, airplanes, cycle are classes in the interface vehicle.

	// What is an abstract class?
	// An abstract class is similar to interface but it has concrete implementation.
	// An abstract class holds common implementation of all the classes in the abstract class.
	// Example: Bank account is the abstract class and the common properties(attributes) and methods(actions) for all the classes are defined and the child classes are the specific types of accounts like Deposit account, Salary account, Saving Account, and so on.
	
	// What is a class?
	// A class is a blueprint for instance creation which has all the attributes and methods of the object of the class.
	
	// Java Collections
	// Java Collections is a framework.
	// Mostly used.
	// Iterable interface ---> Collection Interface ---> (interfaces)Java Lists, Java Sets, Java Queue

    
	




