package Arrays;

public class Smallest_Subarray_Sum_Greater_than_X {


    // O(n) solution for finding smallest subarray with sum
    // greater than x

    class SmallestSubArraySum {
        // Returns length of smallest subarray with sum greater
        // than x. If there is no subarray with given sum, then
        // returns n+1
        static int smallestSubWithSum(int[] arr, int n, int x) {
            // Initialize current sum and minimum length
            int curr_sum = 0, min_len = n + 1;

            // Initialize starting and ending indexes
            int start = 0, end = 0;
            while (end < n) {
                // Keep adding array elements while current sum
                // is smaller than or equal to x
                while (curr_sum <= x && end < n)
                    curr_sum += arr[end++];

                // If current sum becomes greater than x.
                while (curr_sum > x && start < n) {
                    // Update minimum length if needed
                    if (end - start < min_len)
                        min_len = end - start;

                    // remove starting elements
                    curr_sum -= arr[start++];
                }
            }
            return min_len;
        }

        // Main Function
        public static void main(String[] args) {
            int[] arr1 = {1, 4, 45, 6, 10, 19};
            int x = 51;
            int n1 = arr1.length;
            int res1 = smallestSubWithSum(arr1, n1, x);
            if (res1 == n1 + 1)
                System.out.println("Not Possible");
            else
                System.out.println(res1);
        }
    }
}

// Output -
/*
Input:
A[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3
Explanation:
Minimum length subarray is {4, 45, 6}
 */

// Algorithm -
/*
1. We initialize the current sum and minimum length to 0 and n + 1 respectively.
2. We initialize the starting and ending indexes to 0 and 0 respectively.
3. We loop through the elements of the array.
4. We keep adding the array elements to the current sum while the current sum is smaller than or equal to x.
5. If the current sum becomes greater than x, then we update the minimum length if needed.
6. We remove the starting elements from the current sum while the current sum is greater than x.
7. We return the minimum length.
 */

// Time & Space Complexity -
/*
Time - O(N), because we linearly traverse an array by once
Space - O(1), no extra space is needed
 */