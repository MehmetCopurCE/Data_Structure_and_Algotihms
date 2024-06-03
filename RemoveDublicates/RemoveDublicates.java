package RemoveDublicates;

import java.util.Arrays;

public class RemoveDublicates {

    /*
    Problem: Given an integer unsorted array, remove the duplicates such that
    each unique element appears only once. The relative order of the elements
    should be kept the same. Then return the remaining array and the number of unique
    elements in the array. You are not allowed to use an additional array and a sorting
    algorithm.
     */

    public static int[] removeDublicates(int[] arr){
        int n = arr.length;;
        if(n <= 1)
            return arr;

        int uniqueCount = 1;

        for (int i = 1; i < n ; i++) {
            boolean isDublicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if(arr[i] == arr[j]){
                    isDublicate = true;
                    break;
                }
            }

            if(!isDublicate){
                if(uniqueCount != i){
                    int temp = arr[i];
                    for (int k = i; k > uniqueCount ; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[uniqueCount] = temp;
                }
                uniqueCount++;
            }
        }

        return Arrays.copyOfRange(arr, 0, uniqueCount);
    }

    public static int countUniques(int[] arr){
        int count = 0;
        int prev = -1;

        for (int num : arr){
            if(num != prev){
                count++;
                prev = num;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 5, 7, 1, 2, 3, 9, 4, 2, 4, 7, 0, 3};

        int[] newArr = removeDublicates(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + " ");
        }

        int count = countUniques(newArr);
        System.out.println("Count: " + count);
    }

    /*
    Average time complexity: O(n^2)

    Explanation:
    1.	Iterating through the array: We have two nested loops. The outer loop iterates
    through each element of the array, and the inner loop checks for duplicates by comparing
    each element with all the previous unique elements. As a result, we have O(n^2) time complexity.

    2.	Shifting elements: After identifying unique elements, we need to shift elements to maintain
    the original order. This shifting operation involves moving elements to the right to make space
    for the new unique element. In the worst case, when we have to shift all elements, it takes O(n) time

    Overall, the dominant time complexity is O(n^2) due to the nested loops. Hence, the average time complexity
    of the code is O(n^2).
     */
}
