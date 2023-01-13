package BasicsJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Set;
import java.util.TreeMap;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Similar to Python dictionary and JavaScript object.
		// key: value arrangement.
		// Reference link: https://www.youtube.com/watch?v=KnEeMj58w3A
		// Diagram refer: 3:49:48 / 10:46:37
		// keys should be unique.
		// So not duplicates are allowed but we can overwrite with same key.
		// Values can contain duplicates.
		// Technically in the background the keys are stored as set.
		// Technically in the background the values are stored as list.
		// There is no index in Map in Java.
		// We access the values using the key.
		
		// HashMap in Java.
		
		//Map<Integer,String> map1 = new HashMap<>();
		HashMap<Integer,String> map1 = new HashMap<>();
		map1.put(0, "Hi");
		map1.put(1, "Hello");
		map1.put(2, "ya");
		
		// We can store HashMao , Hash Set two if you don't mention the generics.
		HashMap map2 = new HashMap();
		map2.put(0, map1);
		System.out.println(map2);
		map2.put(1, "String");
		System.out.println(map2);
		map2.put(1, 0);// Only one unique key so it will be overwritten.
		System.out.println(map2);
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map2.get(0));
		System.out.println(map2.get(1));
        // Size
		System.out.println(map1.size());
		System.out.println(map2.size());
		System.out.println(map2.containsKey(1));
		
		Object a1 = findKey(map1,0);
		System.out.println(a1);
		System.out.println(a1.getClass());
		// In Python dictionary.keys() it returns a list of keys.
		// In Java we use HashMap.keyset() it returns the keys as set.
		System.out.println(map1.keySet());
		System.out.println(map2.keySet());
		
		ArrayList arrlist = findValues(map1);
		System.out.println(map1);
		System.out.println(arrlist);
		System.out.println(arrlist.getClass());
		
		// HashMap.entrySet() returns a Entry set that can be accessed by getKey() and getValue() 
		for (Entry<Integer, String> entry: map1.entrySet() ) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println(map1.entrySet().getClass());
		
		// Object -ype mismatch: cannot convert from element type Object to Map.Entry.
		//for (Entry entry: map2.entrySet() ) {
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
		//} Not possible.
		map1.put(4, "Vanakkam");
		map1.put(3, "Namaste");
		map1.put(105, "Bonjour");
		map1.put(101, "Soy");

		System.out.println(map1);
		
		// The keys are not ordered in HashMap.
		HashMap<Integer,String> map3 = new HashMap<>();
		map3.put(134, "ya");
		map3.put(72, "ya");
		for (int i =0;i<115;i++) {
			map3.put(i, "ya");
		}
		System.out.println(map3.getClass());
		System.out.println(map3);
		
		HashMap<Object,String> map4 = new HashMap<>();
		map4.put(0, "Hi");
		map4.put(1, "Hello");
		map4.put(2, "ya");
		map4.put(100, "Hi");
		//Key values are heterogeneous in HashMap because of sorting.
		map4.put("Alpha", "Hello");
		map4.put("Beta", "ya");
		map4.put("Gamma", "ya");
		// This works only in HashMap in Java.
		System.out.println(map4);
		// Characteristics: HashMap is not ordered and stored randomly.
		
		// Reference / Attribution: https://www.javatpoint.com/difference-between-hashmap-and-treemap
		// HashMap allows a single null key multiple null values.
		//TreeMap does not allow null keys but can have multiple null values.
		HashMap<Object,String> map5 = new HashMap<>();
		map5.put(0, "Hi");
		map5.put(1, "Hello");
		map5.put(2, null);
		map5.put(100, "Hi");
		//Key values are heterogeneous in HashMap because of sorting.
		map5.put("Alpha", null);
		map5.put("Beta", "ya");
		map5.put(null, "ya");
		map5.put(null, "Yes");// Only one null key allowed , we can overwrite it.
		System.out.println(map5);
		map5.put(null, null);
		System.out.println(map5);
		
		String c1 = HelloWorld();
		System.out.println(c1);
		
		
	
	}
	//Protect Access Modifier
	protected static Object findKey(HashMap map,int key) {
		if (map.containsKey(key)) {
			return map.get(key);
		}
		return "No key";
	}
	//Private Access Modifier
	private static ArrayList findValues (HashMap map) {
		ArrayList list = new ArrayList(map.size());
		for (Object key: map.keySet()) {
			list.add(map.get(key));
		}
		return list;
	}
	public static String HelloWorld() {
		return "Hello World!.....";
	}
	static String HelloEveryone() {
		return "HelloEveryone!.....";
	}
}
