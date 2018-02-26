package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * LinkedHashSet
 * a. operates just as HastSet except that it maintains its order.
 * b. its order is arranged in the way elements are inserted.
 * */
public class MyLinkedHashSet {
	public static void main(String[] args) {
		MyLinkedHashSet set = new MyLinkedHashSet();
		set.run();
	}
	
	public void run(){
		LinkedHashSet<User> linkedHashSet = new LinkedHashSet<User>();
		linkedHashSet.add(new User("Folau", 29));
		linkedHashSet.add(new User("Lisa", 29));
		linkedHashSet.add(new User("Laulau", 4));
		linkedHashSet.add(new User("Laulau", 4));
		linkedHashSet.add(null);
		
		linkedHashSet.remove(null);// remove a specified element
		
		Iterator<User> it = linkedHashSet.iterator();
		
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(linkedHashSet);
	}
}
