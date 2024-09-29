package InsertionSort;

public class InsertionSort {
    // Defining the insertion sort method
    public static void insertionSort(int[] array) {
        // Start from the 2nd element (the first element is considered sorted)
        for (int i = 1; i < array.length; i++) {
            int current = array[i];  // Take the current element
            int j = i - 1;  // Set j as the last element of the sorted part

            // Shift elements of the sorted part to the right if they are greater than the current element
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];  // Shift right
                j--;  // Move to the previous element
            }

            // Place the current element in its correct position
            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 5, 1, 4, 3};  // The array to be sorted

        System.out.println("Before sorting:");
        printArray(array);  // Print the array before sorting

        insertionSort(array);  // Perform the sorting

        System.out.println("After sorting:");
        printArray(array);  // Print the sorted array

        /*
        Output:
        Before sorting:
        9 5 1 4 3
        After sorting:
        1 3 4 5 9
         */
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
