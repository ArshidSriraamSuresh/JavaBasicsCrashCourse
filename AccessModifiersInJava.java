package OopsJava;
import java.util.HashMap;
// Need not import class when in same package.
import BasicsJava.HashMapInJava;
// We are learning access modifier by importing this package.
// public - Accessible everywhere.
// protected- Within a class, Within a package, Outside of package - Inheritance.
// private - Only within a class.
// no modifier/ default - Within a class, Within a package.
public class AccessModifiersInJava extends HashMapInJava {
	
	public static void main(String[]arguments)
	{
		
		HashMapInJava hashMapClass = new HashMapInJava();
		
		// public - Accessible everywhere.- HeeloWorld() is public.
		String z1 = hashMapClass.HelloWorld();
		System.out.println(z1);
		HashMap<Integer,String> map1 = new HashMap<>();
		map1.put(0, "Hi");
		map1.put(1, "Hello");
		map1.put(2, "ya");
		
		// protected- Within a class, Within a package, Outside of package - Inheritance.
		Object z2 = hashMapClass.findKey(map1,0);
		System.out.println(z2);
		
		// private - Only within a class.
		//Not accessible here.
		
		//Default(or)Package does not access out side the package  ,  It will access in within class and within package Only 
		//String z3 = hashMapClass.HelloEveryone();
		//The method HelloEveryone() from the type HashMapInJava is not visible.
		
		// Access modifier video reference: https://www.youtube.com/watch?v=KnEeMj58w3A
		// See - Java Access Modifiers: 4:19:27 / 10:46:37.
		
	}
	public static String HelloWorld() {
		// Overriding the parent class method HelloWorld() in HashMapInJava.
			return "Hello Everyone!.....";
		}
}
