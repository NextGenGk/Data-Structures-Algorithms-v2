package Arrays;

public class Sort_Colors {
    // Swap Function
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Sort Color Function
    public void sortColors(int[] nums) {
        // Initialize low
        int low = 0;
        // Initialize mid
        int mid = 0;
        // Initialize high
        int high = nums.length-1;

        // while mid is less than equal to high
        while (mid <= high) {
            // If 0, swap arr[low] and arr[mid], low++, mid++
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            // If 1, mid++
            else if (nums[mid] == 1) {
                mid++;
            }
            // If 2, swap arr[mid] and arr[high], high--
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
}

// Output -
/*
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
*/

// Algorithm -
/*
1. Initialize low, mid & high
2. If 0, swap arr[low] and arr[mid], low++, mid++
3. If 1, mid++
4. If 2, swap arr[mid] and arr[high], high--
 */

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
 */