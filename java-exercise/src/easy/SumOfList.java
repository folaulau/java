package easy;

import java.util.ArrayList;
import java.util.List;

public class SumOfList {

	public static void main(final String[] args) {
		final List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(234);
		ints.add(-98);
		ints.add(345);
		long sum = 0;
		for (final Integer i : ints) {
			sum += i;
		}
		System.out.println(sum);
	}

}
