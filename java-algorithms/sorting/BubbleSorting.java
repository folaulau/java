import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSorting {

	public static void main(String[] args) {
		BubbleSorting sort = new BubbleSorting();
		int[] array = { 23, 45, 21, 55};//, 234, 1, 34, 90 

		System.out.println("Array unsorted");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
		

		int[] sortedArray = sort.bubbleSort(Arrays.copyOf(array, array.length));

		System.out.println("Array bubble-sorted");
		for (int num : sortedArray) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("============================================\n");
		
		System.out.println("List unsorted");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		List<Integer> sortedList = sort.bubbleSort(Arrays.stream(array).boxed().collect(Collectors.toList()));

		System.out.println("List bubble-sorted");
		for (int num : sortedList) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("============================================\n");
	}

	/**
	 * bubble sort array
	 * @param array
	 * @return sorted array
	 */
	public int[] bubbleSort(int[] array) {
		System.out.println("\nBubble sorting the array...");
		int length = array.length;
		for (int row = 0; row < length; row++) {
			for (int column = 1; column < (length-row); column++) {// loop through column
				if (array[column - 1] > array[column]) {
					int temp = array[column - 1];
					array[column - 1] = array[column];
					array[column] = temp;
				}
			}
			print(row, array);
		}
		System.out.println("The array has been bubble sorted!\n");
		return array;
	}

	/**
	 * bubble sort list
	 * @param list
	 * @return sorted list
	 */
	public List<Integer> bubbleSort(List<Integer> list) {
		System.out.println("\nBubble sorting the list...");
		int length = list.size();
		for (int row = 0; row < length; row++) {
			for (int column = 1; column < (length-row); column++) {// loop through column
				if (list.get(column - 1)  > list.get(column)) {
					int temp = list.get(column - 1);
					list.set(column - 1, list.get(column));
					list.set(column, temp);
				}
			}
			print(row, list);
		}
		System.out.println("The array has been bubble sorted!\n");
		return list;
	}
	
	private void print(int row, int[] array){
		System.out.print((row+1)+" -> ");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	private void print(int row, List<Integer> list){
		System.out.print((row+1)+" -> ");
		for (int num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
