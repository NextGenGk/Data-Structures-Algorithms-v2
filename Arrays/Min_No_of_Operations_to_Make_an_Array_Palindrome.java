package Arrays;

public class Min_No_of_Operations_to_Make_an_Array_Palindrome {

    class Solution {
        // Returns minimum number of count operations
        // required to make arr[] palindrome
        static int findMinOps(int[] arr, int n) {
            int ans = 0; // Initialize result

            // Start from two corners
            for (int i = 0, j = n - 1; i <= j; ) {
                // If corner elements are same,
                // problem reduces arr[i+1..j-1]
                if (arr[i] == arr[j]) {
                    i++;
                    j--;
                }

                // If left element is greater, then
                // we merge right two elements
                else if (arr[i] > arr[j]) {
                    // need to merge from tail.
                    j--;
                    arr[j] += arr[j + 1];
                    ans++;
                }

                // Else we merge left two elements
                else {
                    i++;
                    arr[i] += arr[i - 1];
                    ans++;
                }
            }
            return ans;
        }

        // Driver method to test the above function
        public static void main(String[] args) {
            int[] arr = new int[]{1, 4, 5, 1};
            System.out.println("Count of minimum operations is " +
                    findMinOps(arr, arr.length));
        }
    }
}

// Output -
/*
Input : arr[] = {1, 4, 5, 1}
Output : 1
We can make given array palindrome with
minimum one merging (merging 4 and 5 to
make 9)
 */

// Algorithm -
/*
Let f(i, j) be minimum merging operations to make subarray arr[i..j] a palindrome. If i == j answer is 0. We start i from 0 and j from n-1.

1. If arr[i] == arr[j], then there is no need to do any merging operations at index i or index j.
 Our answer in this case will be f(i+1, j-1).
2. Else, we need to do merging operations. Following cases arise.
    i. If arr[i] > arr[j], then we should do merging operation at index j.
     We merge index j-1 and j, and update arr[j-1] = arr[j-1] + arr[j]. Our answer in this case will be 1 + f(i, j-1).
   ii. For the case when arr[i] < arr[j], update arr[i+1] = arr[i+1] + arr[i].
    Our answer in this case will be 1 + f(i+1, j).
3. Our answer will be f(0, n-1), where n is the size of array arr[].
 */

// Time & Space Complexity -
/*
Time - O(N), because linearly traversing
Space - O(1), no extra space is needed
 */