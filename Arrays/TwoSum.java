package Arrays;

import java.util.Arrays;

public class TwoSum {

    //LeetCode Problem Link: https://leetcode.com/problems/two-sum/description/

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (target == arr[i] + arr[j])
                    return new int[]{i, j};
            }
        }

        return new int[]{};
    }
    /*
     The twoSum method uses a nested loop to iterate over the array. The outer loop runs n times,
     where n is the length of the array. For each iteration of the outer loop, the inner loop runs n - i times.
     As i increases, the number of iterations in the inner loop decreases, but in the worst-case
     scenario (where no pair is found), the inner loop still runs approximately n/2 times on average.
     Therefore, the time complexity of this method is O(n^2), which is quadratic time complexity.
     */

    public static int[] findPairWithSum(int[] arr, int target) {

        Arrays.sort(arr); //Sorting given array
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (target == sum) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
    /*
    The findPairWithSum method first sorts the array, which has a time complexity of O(n log n).
    After sorting, it uses a two-pointer approach to find the pair that sums up to the target.
    This part of the method has a linear time complexity, O(n), because it involves a single loop that
    goes through the array at most once. However, since the sorting step dominates the overall time complexity,
    the time complexity of the findPairWithSum method is O(n log n).
     */

    /*
     Between the two, O(n log n) is generally faster than O(n^2) for large values of n. This is because the growth
     rate of n^2 is much greater than that of n log n. Therefore, for large datasets, findPairWithSum would be more
     efficient than twoSum.
     */

    public static void main(String[] args) {
        int[] numbs = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbs, target);
        int[] result2 = findPairWithSum(numbs, target);

        System.out.println("The result is :" + Arrays.toString(result));
        System.out.println("The result is :" + Arrays.toString(result2));
    }
}
