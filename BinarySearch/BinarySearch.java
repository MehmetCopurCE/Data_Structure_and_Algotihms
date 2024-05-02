package BinarySearch;

public class BinarySearch {

	public static int binarySearch(int[] arr, int target, int left, int right) {
		if (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return arr[mid];
			} else if (arr[mid] < target) {
				return binarySearch(arr, target, mid + 1, right);
			} else {
				return binarySearch(arr, target, left, mid - 1);
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 10;

		int result = binarySearch(arr, target, 0, arr.length - 1);

		if (result == -1) {
			System.out.println("Target " + target + " is not found in the array");
		} else {
			System.out.println("Target " + target + " is found in array");
		}

	}

}
