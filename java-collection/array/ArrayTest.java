import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {
	
	@Test
	public void printArray() {
		int[] array = {1,2,3,4,5};
		System.out.println(Arrays.toString(array));
	}

	
	/**
	 *  System.arraycopy copies into an existing array
	 */
	@Test
	public void testSystemArrayCopy() {
		System.out.println("Copy array with System.arraycopy\n");
		
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int pos = 3;
		
		// print out array
		System.out.println("array");
		System.out.println(Arrays.toString(array));
		System.out.println("\n");
		final int indexToRemoveFrom = pos;
		final int posToBeginCopyFrom = indexToRemoveFrom;
		final int posToCopyTo = indexToRemoveFrom;
		int size = array.length;
		int [] copy =new int[size];
		int numOfElementsToCopy = (size - indexToRemoveFrom)-1;
		
		
		System.out.println("First position to copy from: "+indexToRemoveFrom+" -> value: "+array[indexToRemoveFrom]);
		System.out.println("Number of Elements to copy: "+numOfElementsToCopy);
		System.out.println("Last position to copy from: "+(numOfElementsToCopy+indexToRemoveFrom)+" -> value: "+array[(numOfElementsToCopy+indexToRemoveFrom)]);
		System.out.println();
		System.out.println("Position to copy to: "+posToCopyTo);
		System.out.println();
		System.arraycopy(array, posToBeginCopyFrom, copy, posToCopyTo, numOfElementsToCopy+1);

		// print out copy
		System.out.println("copy");
		System.out.println(Arrays.toString(copy));
		
	}
	
	
	
	/**
	 *  Arrays.copyOf copies into an existing array
	 *  Arrays.copyOf uses System.arraycopy() under the hood
	 */
	@Test
	public void testArraysCopyOf() {
		System.out.println("Copy array with Arrays.copyOf\n");
		
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int length = 6;
		
		// print out array
		System.out.println("array");
		System.out.println(Arrays.toString(array));
		
		System.out.println();
		System.out.println("Position starts from 1 not 0");
		System.out.println("copy array from position 1 to "+length);
		System.out.println();
		
		int [] copy = Arrays.copyOf(array,length);
		
		// print out copy
		System.out.println("copy");
		System.out.println(Arrays.toString(copy));
		
	}
	
	/**
	 *  Arrays.copyOfRange copies into an existing array
	 *  Arrays.copyOfRange uses System.arraycopy() under the hood
	 */
	@Test
	public void testArraysCopyOfRange() {
		System.out.println("Copy array with Arrays.copyOfRange\n");
		
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int fromPosition = 1;
		int toPosition = 5;
		
		// print out array
		System.out.println("array");
		System.out.println(Arrays.toString(array));
		
		System.out.println();
		System.out.println("Position starts from 1 not 0");
		System.out.println("Position from: "+fromPosition+" -> value: "+array[fromPosition]);
		System.out.println("Position to: "+toPosition+" -> value: "+array[toPosition-1]);
		System.out.println();
		
		int [] copy = Arrays.copyOfRange(array, fromPosition, toPosition);
		
		// print out copy
		System.out.println("copy");
		System.out.println(Arrays.toString(copy));
		
	}
}
