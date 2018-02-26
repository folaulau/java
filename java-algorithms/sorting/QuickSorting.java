import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuickSorting {
	public static void main(String[] args) {
		QuickSorting sort = new QuickSorting();
		int[] array = { 23, 45, 21, 55, 234, 1, 34, 90 };

		System.out.println("Array unsorted");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		int size = array.length;
		int[] sortedArray = sort.quickSort(Arrays.copyOf(array, array.length), 0, (size - 1));

		System.out.println("Array quick-sorted");
		for (int num : sortedArray) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("============================================\n");

	}

	/**
	 * 
	 * @param array
	 * @param low
	 * @param high
	 * @return
	 */
	public int[] quickSort(int array[], int left, int right) {
		if (left < right) {
			print(array);
			int pivot = array[(left + right) / 2];
			int index = partition(array, left, right, pivot);

			quickSort(array, left, index - 1);// quicksort first half
			quickSort(array, index, right);// quicksort second half
		}
		return array;
	}

	int partition(int array[], int left, int right, int pivot) {
		printPartion(array,left,right);
		System.out.println("left: "+array[left]+" & pivot: "+pivot+" & right: "+array[right]);
		int tempLeft = left;
		int tempRight = right;
		while (left <= right) {
			// check from left, stops when item is greater than pivot
			while (array[left] < pivot) {
				left++;
			}
			// check from right, stops when item is lower than pivot
			while (array[right] > pivot) {
				right--;
			}

			// swap if left is less than right
			if (left <= right) {
				swap(array, left, right);
				printPartion(array,tempLeft,tempRight);
				left++;
				right--;
			}
		}
		System.out.println("\n");
		return left;
	}

	private void swap(int[] array, int left, int right) {
		System.out.println("swap: "+array[left]+" and "+array[right]);
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	private void print(int[] array) {
		System.out.print("array -> ");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	private void printPartion(int[] array, int left, int right) {
		System.out.print("partion -> ");
		for(int i=0;i<array.length;i++) {
			if(left <= i  && i <= right) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}
}
