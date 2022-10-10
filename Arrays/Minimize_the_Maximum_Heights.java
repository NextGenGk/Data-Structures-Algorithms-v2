package Arrays;

import java.util.Arrays;

public class Minimize_the_Maximum_Heights {

    class Solution {
        int getMinDiff(int[] arr, int n, int k) {
            // Base Case
            if (n == 1) return 0;

            // Sorting an Array
            Arrays.sort(arr);

            // Maximum possible height difference
            int minDiff = arr[n - 1] - arr[0];

            // Loop through array length
            for (int i = 1; i < n; i++) {
                // if on subtracting k we got negative then, continue
                if (arr[i] - k < 0) continue;

                // Minimum element when we add k to whole array
                int min = Math.min(arr[i] - k, arr[0] + k);
                // Maximum element when we subtract k from whole array
                int max = Math.max(arr[i - 1] + k, arr[n - 1] - k);

                // Minimize the Maximum Heights Answer
                minDiff = Math.min(minDiff, max - min);
            }
            return minDiff;
        }
    }
}

// Output -
/*
Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}

Output:
5
Explanation:
The array can be modified as {3, 3, 6, 8}. The difference between
the largest and the smallest is 8-3 = 5.
 */

// Algorithm -
/*
1. First, we sort the array.
2. Then, we find the minimum difference between the maximum height and minimum height.
3. We loop through the array and find the minimum difference between the current element and the minimum element in the array.
4. We also find the maximum difference between the current element and the maximum element in the array.
5. We minimize the maximum difference and return the minimum difference.
 */

// Time & Space Complexity -
/*
Time - O(N*log*N)
Space - O(n)
 */