package BinarySearch;

public class Search_Insert_Position {
    // Search Insert Function (Using Binary Search)
    public int searchInsert(int[] nums, int target) {
        // Initialize two variables
        int low = 0;
        int high = nums.length-1;

        // while low is less than equal to high
        while (low <= high) {
            // Find middle element
            int mid = low + (high-low)/2;
            // If middle index element is equal to target
            if(nums[mid] == target) {
                return mid;
            }
            // If target is greater the middle index element
            else if(target > nums[mid]) {
                low = mid + 1;
            }
            // Else
            else {
                high = mid - 1;
            }
        }
        // Finally, return low
        return low;
    }
}

// Output -
/*
Input: nums = [1,3,5,6], target = 5
Output: 2
*/

// Algorithm -
/*
1. Compare x with the middle element.
2. If x matches with the middle element, we return the mid index.
3. Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element.
   So we recur for the right half.
4. Else (x is smaller) recur for the left half.
*/

// Time & Space Complexity -
/*
   Worst complexity: O(log*N)
   Average complexity: O(log*N)
   Best complexity: O(1)
   Space complexity: O(1)
*/