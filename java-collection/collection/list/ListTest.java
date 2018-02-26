package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ListTest {

	@Test
	public void testArrayList() {
		final List<User> list = new ArrayList<User>(5);
		list.add(new User(5));
		list.add(new User(10));
		list.add(new User(15));

		final Iterator<User> it = list.listIterator(1);// skip the first
														// element.
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	@Test
	public void testConvertArrayToArrayList(){
		String [] names = {"Folau","Lisa","Laulau","Kinga","Fusi"};
		ArrayList<String> myNames = new ArrayList<String> (Arrays.asList(names));
		myNames.add("hello");
		System.out.println(myNames);
	}
	@Test
	public void testArrayContainsValue(){
		String [] names = {"Folau","Lisa","Laulau","Kinga","Fusi"};
		// most used method
		System.out.println("List in list: "+Arrays.asList(names).contains("Lisa"));
		
		// loop through the array
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals("Lisa")){
				System.out.println("Lisa in loop: true");
				break;
			}
		}
		
		// Use a hashset
		Set<String> set = new HashSet<String>(Arrays.asList(names));
		System.out.println("Lisa in Set: "+set.contains("Lisa"));
	}
	@Test
	public void testremoveItemFromList(){
		String [] names = {"Folau","Lisa","Laulau","Kinga","Fusi"};
		//ArrayList<String> myNames = (ArrayList<String>) Arrays.asList(names);//this is wrong. It can't do the cast.
		ArrayList<String> myNames = new ArrayList<String> (Arrays.asList(names));
		// step 1
		Iterator<String> it = myNames.iterator();
		
		// step 2 - got be a while loop not for loop
		while(it.hasNext()) {
			
			// step 3 - must call next()
			String nameTaken = (String) it.next();
			if(nameTaken.equals("Lisa")){
				// step 4 - remove()
				it.remove();
			}
			
		}
		System.out.println(myNames);
	}
}
