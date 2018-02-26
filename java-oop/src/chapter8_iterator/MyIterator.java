package chapter8_iterator;

import java.util.Iterator;
import java.util.List;

public class MyIterator implements Iterator<Integer> {

	private List<Integer> myInts;
	private int size = 0;
	
	public List<Integer> getMyInts() {
		return myInts;
	}

	public void setMyInts(List<Integer> myInts) {
		this.myInts = myInts;
	}

	@Override
	public boolean hasNext() {
		return myInts.size() > size;
	}

	@Override
	public Integer next() {
		
		Integer i = myInts.get(size);
		size+=2;
		return i;
	}

}
