package chapter8_iterator;

import java.util.ArrayList;
import java.util.List;

public class Main implements Runnable{

	List<Integer> myInts;
	MyIterator it = new MyIterator();
	
	public Main() {
		myInts = new ArrayList<Integer>();
		myInts.add(1);myInts.add(2);
		myInts.add(3);myInts.add(4);
		myInts.add(5);myInts.add(6);
		myInts.add(7);myInts.add(8);
		myInts.add(9);myInts.add(10);
	}
	
	public static void main(String[] args) {
		System.out.println("Start in main");
		Thread thread = new Thread(new Main());
		thread.start();
		System.out.println("Done in main");
	}
	
	@Override
	public void run() {
		it.setMyInts(myInts);
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Done in thread");
	}

}
