import java.util.Arrays;

public class BinarySearching {

	public static void main(String[] args) {
		BinarySearching searching = new BinarySearching();

		int[] array = { 23, 45, 21, 55, 234, 1, 34, 90 };

		// must be sorted
		Arrays.sort(array);
		int searchKey = 21;

		System.out.print("Array: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("searchKey: " + searchKey);
		System.out.println();

		// iterative
		 System.out.println("Iterative Searching\n");
		 int index = searching.binarySearch(array, searchKey);
		 System.out.println("\nindex: " + index + "\n");

		// recursive
		 int left = 0;
		 int right = array.length - 1;
		
		 System.out.println("Recursive Searching\n");
		 int index1 = searching.binarySearch(array,left, right, searchKey);
		 System.out.println("\nindex: "+index1);

		// java built-in binary search
		System.out.println("Java Built-in Binary Searching\n");
		int index2 = searching.binarySearchJava(array, searchKey);
		System.out.println("index: " + index2);
	}

	/**
	 * Iterative implementation
	 * 
	 * @param array
	 * @param key
	 * @return index
	 */
	public int binarySearch(int array[], int searchKey) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int middle = (right + left) / 2;
			
			//prevent memory overflow in situation where (right + left) 
			//goes over limit of data type capacity
			//int middle = left + ((right - left) / 2);

			System.out.println("left: (" + left + ")" + array[left] + ", middle: (" + middle + ")" + array[middle]
					+ ", right: (" + right + ")" + array[right]);

			System.out.println("middle: " + array[middle] + " == searchKey: " + searchKey);

			// if key is found in middle
			if (array[middle] == searchKey) {
				System.out.println("found it!");
				return middle;
			}
			System.out.println("not it!");
			// if key is greater than middle, ignore left
			if (array[middle] < searchKey) {
				System.out.println("ignore left");
				left = middle + 1;

				// if key is less than middle, ignore right
			} else {
				System.out.println("ignore right");
				right = middle - 1;
			}
			System.out.println();
		}

		return -(right + 2);
	}

	/**
	 * recursive implementation
	 * 
	 * @param array
	 * @param key
	 * @return index
	 */
	public int binarySearch(int array[], int left, int right, int searchKey) {
		while (left <= right) {
			int middle = (right + left) / 2;

			System.out.println("left: (" + left + ")" + array[left] + ", middle: (" + middle + ")" + array[middle]
					+ ", right: (" + right + ")" + array[right]);

			System.out.println("middle: " + array[middle] + " == searchKey: " + searchKey);

			// if key is found in middle
			if (array[middle] == searchKey) {
				System.out.println("found it!");
				return middle;
			}
			System.out.println("not it!");
			// if key is greater than middle, ignore left
			if (array[middle] < searchKey) {
				System.out.println("ignore left");
				left = middle + 1;
				// if key is less than middle, ignore right
			} else {
				System.out.println("ignore right");
				right = middle - 1;
			}
			System.out.println();
			binarySearch(array, left, right, searchKey);
		}

		return -(right + 2);
	}
	
	/**
	 * java built-in binary search
	 * @param array
	 * @param searchKey
	 * @return
	 */
	public int binarySearchJava(int array[], int searchKey) {
		return Arrays.binarySearch(array, searchKey);
	}

}
