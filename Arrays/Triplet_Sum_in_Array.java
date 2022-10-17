package Arrays;

import java.util.Arrays;

public class Triplet_Sum_in_Array {

    class Solution {
        //Function to find if there exists a triplet in the
        //array A[] which sums up to X.
        public static boolean find3Numbers(int[] A, int n, int X) {
            Arrays.sort(A);
            for (int i = 0; i < n; i++) {
                int y = X - A[i];
                int low = i + 1;
                int high = n - 1;

                while (low < high) {
                    if (A[low] + A[high] == y) {
                        return true;
                    } else if (A[low] + A[high] > y) {
                        high--;
                    } else if (A[low] + A[high] < y) {
                        low++;
                    }
                }
            }
            return false;
        }
    }
}

// Output -
/*
Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in the array sums up to 13.
*/

// Algorithm -
/*
1. Sort the array.
2. Find new target y = target - arr[i]
3. If the sum is equal to the target, return true.
4. If the sum is greater than the target, decrement high.
5. If the sum is less than the target, increment low.
6. If low is greater than high, return false.
*/

// Time & Space Complexity -
/*
Time - O(N*N)
Space - O(1)
*/