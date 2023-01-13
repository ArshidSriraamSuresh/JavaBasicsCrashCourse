package BasicsJava;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Not able to mention default size.
		TreeSet<String> set1 = new TreeSet<String>();
		// .add is like appemd that returns a boolean value true or false.
		set1.add("z");
		set1.add("a");
		set1.add("A");
		set1.add("Aa");
		set1.add("aA");
		set1.add("E");
		set1.add("u");
		set1.add("b");
		set1.add("w");
		boolean a1=set1.add("c");// added.
		boolean a2=set1.add("c");// not added because it is a duplicate.
		boolean a3=set1.add("e");// added.
		boolean a4=set1.add("e");//not added because it is a duplicate.
		set1.add("f");
		 // It does not accept duplicates which is the unique characteristic of set.
		 // It accesses in ascending order in TreeSet.
		 
		 System.out.println(set1);
		 System.out.println(a1);// added.
		 System.out.println(a2);// not added because it is a duplicate.
		 System.out.println(a3);// added.
		 System.out.println(a4);//not added because it is a duplicate.
		 // To find whether the element exists in HashSet.
		 // Returns true or false.
		 System.out.println("Contains c: "+set1.contains("c"));
		 System.out.println("Contains g: "+set1.contains("g"));
        // remove elements
		 set1.remove("f");
		 System.out.println("Contains f: "+set1.contains("f"));
		 System.out.println(set1);

		 // Using Enhanced for loop.
		 for (String b: set1) {
			 System.out.println(b);// It does not have index and access it ascending order.
		 }
		 // It is in ascending order. That is the only difference between HashSet and TreeSet.
		 // We cannot insert because there is no index in Set.
		 // For String: First character - Capitals first priority followed by small.

	}

}
