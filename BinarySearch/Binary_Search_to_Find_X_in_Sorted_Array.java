package BinarySearch;

public class Binary_Search_to_Find_X_in_Sorted_Array {

    class Solution {
        public int search(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] == target) return mid;
                else if (nums[mid] < target) {
                    low = mid + 1;
                } else if (nums[mid] > target) {
                    high = mid - 1;
                }
            }
            return -1;
        }
    }
}

// Output -
/*
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
*/

// Algorithm -
/*
1. First, we initialize low and high to 0 and nums.length-1 respectively.
2. Then, we initialize mid to low + (high - low) / 2.
3. If nums[mid] == target, then we return mid.
4. If nums[mid] < target, then we set low to mid + 1.
5. If nums[mid] > target, then we set high to mid - 1.
6. We repeat the above steps while low <= high.
7. If we reach here, then the target is not present in nums, so we return -1.
*/

// Time & Space Complexity -
/*
Time - O(log*N), log*N because every time half part of the array is eliminated
Space - O(1), we are not using extra space
*/