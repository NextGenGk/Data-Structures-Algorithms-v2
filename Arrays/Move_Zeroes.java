package Arrays;

public class Move_Zeroes {

    class Solution {
        public void moveZeroes(int[] nums) {
            int n = nums.length;

            if (n == 0 || n == 1) return;

            int left = 0;
            int right = 0;

            while (right < n) {
                if (nums[right] == 0) {
                    right++;
                } else {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right++;
                }
            }
        }
    }
}

// Output -
/*
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/

// Algorithm -
/*
1. We initialize two pointers left and right.
2. We traverse the array from left to right.
3. If the element at the right pointer is not equal to zero, we increment the right pointer.
4. If the element at the right pointer is equal to zero, we swap the element at the left pointer with the element at the right pointer.
5. We increment the left pointer.
6. We increment the right pointer.
*/

// Time & Space Complexity -
/*
Time - O(N), we linearly traversing an array
Space - O(1), no extra space is needed
*/