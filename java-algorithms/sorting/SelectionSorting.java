import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SelectionSorting {
	public static void main(String[] args) {
		SelectionSorting sort = new SelectionSorting();
		int[] array = { 23, 45, 21, 55, 234, 1, 34, 90 };

		System.out.println("Array unsorted");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();

		int[] sortedArray = sort.selectionSort(Arrays.copyOf(array, array.length));

		System.out.println("Array selection-sorted");
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
		
		List<Integer> sortedList = sort.selectionSort(Arrays.stream(array).boxed().collect(Collectors.toList()));

		System.out.println("List selection-sorted");
		for (int num : sortedList) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("============================================\n");
		
		int[] aray = Arrays.copyOf(array, array.length);
		Arrays.sort(aray);
		
		System.out.println("Array java builtin sorted");
		for (int num : aray) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("============================================\n");
		
	}

	public int[] selectionSort(int[] array) {
		int size = array.length;

		for (int i = 0; i < (size - 1); i++) {
			// Find the new minimum element in unsorted array
			int minValue = i;
			for (int unsortedIndex = (i + 1); unsortedIndex < size; unsortedIndex++) {
				if (array[unsortedIndex] < array[minValue]) {
					minValue = unsortedIndex;
				}
			}
			// Swap the minValue with the first element
			int temp = array[minValue];
			array[minValue] = array[i];
			array[i] = temp;

			print(i,temp, array);
		}
		return array;
	}
	
	public List<Integer> selectionSort(List<Integer> list) {
		int size = list.size();

		for (int i = 0; i < (size - 1); i++) {
			// Find the new minimum element in unsorted array
			int minValue = i;
			for (int unsortedIndex = (i + 1); unsortedIndex < size; unsortedIndex++) {
				if (list.get(unsortedIndex) < list.get(minValue)) {
					minValue = unsortedIndex;
				}
			}
			// Swap the minValue with the first element
			int temp = list.get(minValue);
			list.set(minValue, list.get(i));
			list.set(i, temp);

			print(i,temp, list);
		}
		return list;
	}
	
	private void print(int row, int min, int[] array){
		System.out.print((row+1)+" -> (min-"+min+") ");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	private void print(int row, int min, List<Integer> list){
		System.out.print((row+1)+" -> (min-"+min+")");
		for (int num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
