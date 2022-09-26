package Arrays;

public class Check_If_Array_is_Sorted {

    class Solution {
        boolean arraySortedOrNot(int[] arr, int n) {
            // code here
            for(int i=1; i<n; i++) {
                if(arr[i] < arr[i-1]) {
                    return false;
                }
            }
            return true;
        }
    }
}

// Output -
/*
N = 5
arr[] = {10, 20, 30, 40, 50}
Output: 1
Explanation: The given array is sorted.
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */