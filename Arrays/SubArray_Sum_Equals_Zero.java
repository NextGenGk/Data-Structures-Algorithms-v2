package Arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArray_Sum_Equals_Zero {

    class Solution {
        //Function to check whether there is a subarray present with 0-sum or not.
        static boolean findsum(int[] arr, int n) {
            Set<Integer> hs = new HashSet<>();
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += arr[i];

                if (sum == 0 || arr[i] == 0 || hs.contains(sum)) return true;

                hs.add(sum);
            }
            return false;
        }
    }
}

// Output -
/*
Input:
5
4 2 -3 1 6

Output:
Yes

Explanation:
2, -3, 1 is the subarray with sum 0.
*/

// Algorithm -
/*
1. We first initialize a HashSet to store the sum of all the elements we have seen so far.
2. We then iterate through the array and for each element, we add it to the sum.
3. If the sum is 0, we return true.
4. If array also contain 0, we return true
4. If the sum is already present in the HashSet, we return true.
5. If none of the above conditions are true, we add the sum to the HashSet.
6. Finally, we return false.
*/

// Time & Space Complexity -
/*
Time - O(N), because we should traverse each element by once
Space - O(N), because we use hashSet for storing the number
*/