package practice;

public class binary {

	public static int binarySearch(int low, int high, int key, int[] arr) {
		if (low < high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key)
				return mid;
			else if (key < arr[mid])
				return binarySearch(low, mid, key, arr);
			else
				return binarySearch(mid + 1, high, key, arr);

		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		int result = binarySearch(0, arr.length, 1, arr);
		System.out.println(result);
	}

}
