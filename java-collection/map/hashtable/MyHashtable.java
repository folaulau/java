package hashtable;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MyHashtable {
	public static void main(String[] args) {
		MyHashtable map = new MyHashtable();
		map.run();
	}

	private void run() {
		Hashtable<String, User> map = new Hashtable<String, User>();
		map.put("folau", new User("Folau"));
		map.put("lisa", new User("Lisa"));
		map.put("laulau", new User("Folauetau"));
		map.put("fusi", new User("Fusi"));
		map.put("folau", new User("Folau leka"));
		//map.put(null, new User("Null Value"));
		//map.put(null, null);
		//map.put("Null Key", null);
		
		User folau = map.get("folau");
		System.out.println("Object: "+folau.toString());
		map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));// lambda with java 8.
		
		System.out.println("\nforeach using Map.Entry - map.entrySet()");
		for(Map.Entry<String, User> entry: map.entrySet()){
			
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		Iterator iterator = map.entrySet().iterator();
		
		
		System.out.println("\nforeach using Map.Entry - map.entrySet()");
		Enumeration enums = map.elements();
		while(enums.hasMoreElements()){
			
			System.out.println(enums.nextElement());
		}
		map.clear();
		System.out.println("\nforeach using Object class - map.keySet()");
		for(Object obj: map.keySet()){
			System.out.println("Key : " + obj.toString() + " Value : " + map.get(obj.toString()));
		}
		System.out.println("\nforeach using Iterator<Entry<Key,Value>> iterator = map.entrySet().iterator()");
		
	}
}
