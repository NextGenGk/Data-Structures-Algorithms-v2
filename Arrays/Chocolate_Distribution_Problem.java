package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Chocolate_Distribution_Problem {

    class Solution {
        public long findMinDiff(ArrayList<Integer> a, int n, int m) {
            Collections.sort(a);
            int i = 0;
            int j = m - 1;
            long min = Long.MAX_VALUE;
            while (j < n) {
                min = Math.min(min, a.get(j) - a.get(i));
                i++;
                j++;
            }
            return min;
        }
    }
}

// Output -
/*
Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between maximum chocolates and minimum chocolates
is 9 - 3 = 6 by choosing following M packets : {3, 4, 9, 7, 9}.
*/

// Algorithm -
/*
1. Sort the array.
2. Initialize two pointers i and j.
3. Initialize min to a large value.
4. Iterate over the array from m to n.
5. Update min to the minimum of min and a[j] – a[i].
6. Increment i and j.
*/

// Time & Space Complexity -
/*
Time - O(N*Log(N)), where log*N for sorting & N is linearly traverse an array
Space - O(1), no extra space is needed
*/