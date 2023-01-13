package OopsJava;

import java.util.HashMap;

import BasicsJava.HashMapInJava;

public class InheritanceJava extends AccessModifiersInJava {
	
	// Inheritance - Parent, child cLass
	// Parent class is also knows as base class.
	// 'extends' keyword is used for Inheritance in Java.
	// HashMapInJava - Parent Class, AccessModifiersInJava - child class of HashMapInJava, InheritanceJava - child class of
	//...AccessModifiersInJava
	// So all the properties of parent class can be accessed by child class through Inheritance and child class can have its own attributes and methods rthat are unique to child class and cant be used in Parent class.
	// Inheritance works down from Parent to the child and not vice versa.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Concept 1: Multi level Inheritance
		// There can be only one parent class but multiple child classes.
		// Child class inherits all the methods from the parent class.
		// In our example the root parent class is HashMapInJava and the subsequent parent class for InheritanceJava is AccessModifiersInJava.
		HashMapInJava hashMapClass = new HashMapInJava();
		
		// public - Accessible everywhere.- HelloWorld() is public.
		String z1 = hashMapClass.HelloWorld();
		System.out.println(z1);
		HashMap<Integer,String> map1 = new HashMap<>();
		map1.put(0, "Hi");
		map1.put(1, "Hello");
		map1.put(2, "ya");
		
		// protected- Within a class, Within a package, Outside of package - Inheritance.
		Object z2 = hashMapClass.findKey(map1,0);
		System.out.println(z2);
		
		// Concept 2: We can overwrite parent class methods in child class and the new method is unique only for that child class.
		
		InheritanceJava obj2 = new InheritanceJava();
		System.out.println(obj2.HelloWorld());
		
		
		// Concept 3: We can unique child class methods but which are not accessible in parent class.
		String z3 = obj2.WelcomePerson("Poo");
		String z4 = WelcomePerson("Poo");
		System.out.println(z3);
		System.out.println(z4);
		// If method is static we can use without creating object. we can access by class name if it is in same package.
		String z5 = AccessModifiersInJava.HelloWorld();
		System.out.println(z5);
		// It is not accessible in parent class and only in the child class.
		
		// Concept 4: 'super' key word.
		

	}
	public static String HelloWorld() {
		// Overriding the parent class method HelloWorld() in HashMapInJava.
			return "Hello Someone!.....";
		}
	// Concept 3: Unique child class method.
	public static String WelcomePerson(String name) {
		// Overriding the parent class method HelloWorld() in HashMapInJava.
			return "Hello "+ name+ "!.....";
		}
}
