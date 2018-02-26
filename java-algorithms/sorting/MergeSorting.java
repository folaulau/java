import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSorting {
	public static void main(String[] args) {
		MergeSorting sort = new MergeSorting();
		int[] array = { 23, 45, 21, 55, 234, 1, 34, 90 };

		System.out.println("Array unsorted");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println("\n");

		int[] sortedArray = sort.mergeSort(Arrays.copyOf(array, array.length), 0, array.length - 1);

		System.out.println("Array merge-sorted");
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
	}
	
	public int[] mergeSort(int array[], int left, int right) {
		if (left < right) {
			// print(array);
			// Find the middle point
			int middle = (left + right) / 2;

			// Sort first and second halves
			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);

			// Merge the sorted halves
			merge(array, left, middle, right);
		}

		return array;
	}

	void merge(int array[], int left, int middle, int right) {
		print(array);
		printPartion(array,left,right);
		System.out.println("merging -> left: "+array[left]+", middle: "+array[middle]+", right: "+array[right]);
		
		// Find sizes of two subarrays to be merged
		int leftArraySize = (middle - left) + 1;
		int rightArraySize = right - middle;
		System.out.println("left size: "+leftArraySize+", right size: "+rightArraySize);
		/* Create temp arrays */
		int leftArray[] = new int[leftArraySize];
		int rightArray[] = new int[rightArraySize];

		/* Copy data to temp arrays */
		//System.arraycopy(array,0,leftArray,0,leftArraySize);
		
		for (int i = 0; i < leftArraySize; ++i) {
			leftArray[i] = array[left + i];
		}
		//print(leftArray);
		//System.arraycopy(array,middle+1,rightArray,0,rightArraySize);
		
		for (int j = 0; j < rightArraySize; ++j) {
			rightArray[j] = array[middle + 1 + j];
		}
		//print(rightArray);

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = left;
		while (i < leftArraySize && j < rightArraySize) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
			print(array);
		}

		/* Copy remaining elements of leftArray[] if any */
		while (i < leftArraySize) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of rightArray[] if any */
		while (j < rightArraySize) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
		System.out.println();
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
