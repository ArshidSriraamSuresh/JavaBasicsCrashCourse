package BasicsJava;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1 = new TreeMap<>();
		map1.put(0, "Hi");
		map1.put(1, "Hello");
		map1.put(2, "ya");
		map1.put(100, "Hi");
		map1.put(99, "Hello");
		map1.put(80, "ya");
		map1.put(76, "ya");
		
		for (int i =0;i<115;i++) {
			map1.put(i, "ya");
		}
		System.out.println(map1.getClass());
		// Difference 1: The keys are in ascending order in TreeMap.
		System.out.println(map1);
		
		
		
		// What is the difference between TreeMap and HashMap?
		// https://www.javatpoint.com/difference-between-hashmap-and-treemap
		
		
		// Difference 2: HashMAp key values- heterogenous, TreeMao key values - homogeneous.
		TreeMap<Object,String> map3 = new TreeMap<>();
		map3.put(0, "Hi");
		map3.put(1, "Hello");
		map3.put(2, "ya");
		map3.put(100, "Hi");
		// Key values are homogeneous in TreeMap because of sorting.
		//map3.put("Alpha", "Hello");
		//map3.put("Beta", "ya");
		//map3.put("Gamma", "ya");
		
		// Reference / Attribution: https://www.javatpoint.com/difference-between-hashmap-and-treemap
		// HashMap allows a single null key multiple null values.
		//TreeMap does not allow null keys but can have multiple null values.
		TreeMap<Object,String> map5 = new TreeMap<>();
		map5.put(0, "Hi");
		map5.put(1, "Hello");
		map5.put(2, null);
		map5.put(100, "Hi");
		//Key values are heterogeneous in HashMap because of sorting.
		map5.put(3, null);
		map5.put(4, "ya");
		map5.put(5, "ya");
		map5.put(9, "Yes");// Only one null key allowed , we can overwrite it.
		System.out.println(map5);
		map5.put(7, null);
		System.out.println(map5);
		// Accessing using for loop is similar for tree map.
		
		
	}

}
