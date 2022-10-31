package BinarySearch;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    // Find First and Last Position of Element in Sorted Array Function
    public int[] searchRange(int[] nums, int target) {
        // Initialize result ans to -1 & -1
        // If value is not present return ans
        int[] ans = {-1,-1};

        // Initialize two variable low & high
        int low = 0;
        int high = nums.length-1;

        // To Find First occurrence
        while(low <= high) {
            // Find mid index
            int mid = low + (high-low)/2;
            // Check if value is present at mid
            if (nums[mid] == target) {
                // we find the first index
                ans[0] = mid;
                // continue searching left part
                high = mid - 1;
            }
            // If value is greater than mid
            else if(target > nums[mid]) {
                low = mid + 1;
            }
            // If value is smaller than mid
            else {
                high = mid - 1;
            }
        }

        // Initialize two variable low & high
        low = 0;
        high = nums.length-1;

        // To Find Last occurrence
        while(low <= high) {
            // Find mid index
            int mid = low + (high-low)/2;
            // Check if value is present at mid
            if (nums[mid] == target) {
                // we find the last index
                ans[1] = mid;
                // continue searching right part
                low = mid + 1;
            }
            // If value is greater than mid
            else if(target > nums[mid]) {
                low = mid + 1;
            }
            // If value is smaller than mid
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

// Output -
/*
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/

// Algorithm -
/*
// Find First index -
1. Compare target with the middle element.
2. Find First index
    1. If target matches with the middle element, we return the mid index.
    2. and add this mid to 0 position of answer
    3. & continue searching left part (high = mid - 1)
3. Else If target is greater than the mid element, low = mid + 1
4. Else (target is smaller) high = mid - 1;
// Find Last index -
1. Compare target with the middle element.
2. Find Last index
    1. If target matches with the middle element, we return the mid index.
    2. and add this mid to 1 position of answer
    3. & continue searching right part (low = mid + 1)
3. Else If target is greater than the mid element, low = mid + 1
4. Else (target is smaller) high = mid - 1;
*/

// Time & Space Complexity -
/*
Time - O(log*n)
Space - O(1);
*/