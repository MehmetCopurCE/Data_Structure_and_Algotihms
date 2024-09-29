package SelectionSort;

public class SelectionSort {
    // Selection sort method
    public static void selectionSort(int[] array) {
        // Loop through the entire array
        for (int i = 0; i < array.length - 1; i++) {
            // Assume the current index has the smallest element
            int minIndex = i;

            // Find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;  // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {29, 10, 14, 37, 14};  // Array to be sorted

        System.out.println("Before sorting:");
        printArray(array);  // Print the array before sorting

        selectionSort(array);  // Perform the sorting

        System.out.println("After sorting:");
        printArray(array);  // Print the sorted array

        /*
        Output:

        Before sorting:
        29 10 14 37 14

        After sorting:
        10 14 14 29 37
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
