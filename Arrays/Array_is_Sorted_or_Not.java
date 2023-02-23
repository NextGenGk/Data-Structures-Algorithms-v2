package Arrays;

public class Array_is_Sorted_or_Not {

    class Solution {
        boolean arraySortedOrNot(int[] arr, int n) {
            if (arr.length == 1) return true;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }
}

// Output -
/*
Input:
N = 5
arr[] = {10, 20, 30, 40, 50}
Output: 1
Explanation: The given array is sorted.
 */

// Algorithm -
/*
1. First, it checks if the array has only one element. If yes, then it is sorted.
2. If not, then it checks if the array is sorted or not. If it is not sorted, then it returns false.
3. If the array is sorted, then it checks if the array is sorted in ascending order or not. If it is not sorted in ascending order, then it returns false.
4. If the array is sorted in ascending order, then it returns true.
 */

// Time & Space Complexity -
/*
Time - O(N), because we linearly traverse an array
Space - O(1), we not use any extra space
 */