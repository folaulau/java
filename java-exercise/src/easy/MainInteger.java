package easy;

import java.util.Iterator;
import java.util.Set;

public class MainInteger {

	public boolean hasOdd(final Set<Integer> nums) {

		if ((nums == null) || (nums.size() == 0) || MainInteger.containNegative(nums)) {
			return false;
		}
		final Iterator it = nums.iterator();
		boolean result = false;
		while (it.hasNext()) {
			final int num = Integer.parseInt(it.next().toString());
			if (num <= -1) {
				break;
			}
			if ((num % 2) != 0) {
				System.out.println("odd " + num);
				result = true;
				break;
			}
		}
		return result;
	}

	private static boolean containNegative(final Set<Integer> nums) {
		final Iterator it = nums.iterator();
		boolean result = false;
		while (it.hasNext()) {
			if (Integer.parseInt(it.next().toString()) <= 0) {
				result = true;
				break;
			}
		}
		return result;
	}
}
