
public class LinearSearching {
	public static void main(String[] args) {
		LinearSearching search = new LinearSearching();
		int[] array = { 23, 45, 21, 55, 234, 1, 34, 90 };
		int searchKey = 34;
		int index = search.linearSearch(array, searchKey);
		System.out.println("index: " + index);
	}

	public int linearSearch(int[] array, int searchKey) {
		int size = array.length;
		for (int i = 0; i < size; i++) {
			if (array[i] == searchKey) {
				return i;
			}
		}
		return -1;
	}
}
