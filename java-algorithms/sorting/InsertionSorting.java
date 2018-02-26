import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsertionSorting {
	public static void main(String[] args) {
		InsertionSorting sort = new InsertionSorting();
		int[] array = { 23, 45, 21, 55, 234, 1, 34, 90 };

		System.out.println("Array unsorted");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();

		int[] sortedArray = sort.insertionSort(Arrays.copyOf(array, array.length));

		System.out.println("Array insertion-sorted");
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
		
		List<Integer> sortedList = sort.insertionSort(Arrays.stream(array).boxed().collect(Collectors.toList()));

		System.out.println("List insertion-sorted");
		for (int num : sortedList) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("============================================\n");
		
	}

	public int[] insertionSort(int[] array) {
		System.out.println("insertion sorting...");
		int size = array.length;
		for (int i = 1; i < size; i++) {
			for (int j = i; j > 0; j--) {
				// shift elements
				if (array[j] < array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}else {
					break;
				}
			}
			
			print(i, array);
		}
		return array;
	}
	
	public List<Integer> insertionSort(List<Integer> list) {
		System.out.println("insertion sorting...");
		int size = list.size();
		for (int i = 1; i < size; i++) {
			for (int sortedIndex = i; sortedIndex > 0; sortedIndex--) {
				if (list.get(sortedIndex) < list.get(sortedIndex-1)) {
					int temp = list.get(sortedIndex);
					list.set(sortedIndex, list.get(sortedIndex-1));
					list.set(sortedIndex-1, temp);
				}
			}
			print(i, list);
		}
		return list;
	}
	
	private void print(int row, int[] array){
		System.out.print(row+". ");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	private void print(int row, List<Integer> list){
		System.out.print(row+". ");
		for (int num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
