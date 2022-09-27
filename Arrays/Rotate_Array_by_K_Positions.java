package Arrays;

public class Rotate_Array_by_K_Positions {

    class Solution {
        public void rotate(int[] nums, int k) {
            k = k % nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }

        public void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }
}

// Output -
/*
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/

// Algorithm -
/*
1. First, we find the number of rotations needed (k % nums.length) and save it in a variable called k.
2. Next, we reverse the entire array from the beginning to the end.
3. Then, we reverse the first k elements followed by reversing the elements from k+1 to the end of the array.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
*/