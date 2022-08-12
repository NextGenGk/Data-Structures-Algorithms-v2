package Arrays;

public class Search_in_Rotated_Sorted_Array {
    // Search in Rotated Sorted Array Function
    public int search(int[] nums, int target) {
        // Normal Binary Search
        // Starting index
        int low = 0;
        // Ending index
        int high = nums.length-1;

        // while low index is smaller & equal to high index
        while(low <= high) {

            // Find mid index / element
            int mid = low + (high - low)/2;
            // Check if value is present at mid, return mid
            if(nums[mid] == target) {
                return mid;
            }

            // Checking, If nums[low] is smaller than nums[mid],
            // It means Left Part is Sorted
            if(nums[low] <= nums[mid]) {
                // Checking if target is lies in the left sorted array
                if (target >= nums[low] && target <nums[mid]) {
                    // then high = mid - 1
                    high = mid - 1;
                }
                // If target is not lies in the left subArray, then low = mid + 1
                else {
                    low = mid + 1;
                }
            }

            // Left Part is not Sorted, It means Right Part is Sorted
            else {
                // Checking if target is lies in the right sorted array
                if (target > nums[mid] && target<=nums[high]) {
                    // then low = mid + 1
                    low = mid + 1;
                }
                // If target is lies in the right subArray, then high = mid - 1
                else {
                    high = mid - 1;
                }
            }
        }
        // If value is not present in the array
        return -1;
    }
}

// Output -
/*
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
*/

// Algorithms -
/*
1. Compare x with the middle element.
2. If x matches with the middle element, we return the mid index.
3. Checking, If nums[low] is smaller than nums[mid], It means Left Part is Sorted
4. Checking if target is lies in the left sorted array, then high = mid - 1
5. Checking If target is not lies in the left subArray, then low = mid + 1
6. Left Part is not Sorted, It means Right Part is Sorted
7. Checking if target is lies in the right sorted array, then low = mid + 1
8. Checking If target is lies in the right subArray, then high = mid - 1
9. If value is not present in the array, return -1.
 */

// Time & Space Complexity -
/*
Time - O(log*n)
Space - O(1)
*/
