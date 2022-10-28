package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_in_Array_Problem {

    class Solution {
        // Function to find the leaders in the array.
        static ArrayList<Integer> leaders(int[] arr, int n) {
            ArrayList<Integer> ans = new ArrayList<>();
            int max = Integer.MIN_VALUE;

            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] >= max) {
                    ans.add(arr[i]);
                    max = arr[i];
                }
            }

            Collections.reverse(ans);
            return ans;
        }
    }
}

// Output -
/*
Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 as it is greater than all the elements to its right. Similarly, the next
leader is 5. The right most element is always a leaders, so it is also included.
*/

// Algorithm -
/*
1. We initialize a list, which stores ans.
2. We initialize the maximum value to Integer.MIN_VALUE.
3. We traverse the array from the end to the beginning.
4. If the current element is greater than or equal to the maximum value, we add it to the list and update the maximum value.
5. Finally, we reverse the list and return it.
*/

// Time & Space Complexity -
/*
Time - O(N), where, N is traversing the array only once from right to left.
Space - O(1), we are not using any extra space.
*/