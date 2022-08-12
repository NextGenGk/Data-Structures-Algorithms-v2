package Arrays;

public class Remove_Duplicates_From_Sorted_Array_II {
    // Remove Duplicates From Sorted Array Function
    public int removeDuplicates(int[] nums) {
        // Initialize i to 0
        int i = 0;
        // Loop through all elements
        for (int k=0; k<nums.length; k++) {
            // Check, if i == 0 or i == 1 or nums[i-2] != nums[k]
            if (i == 0 || i == 1 || nums[i-2] != nums[k]) {
                // Store nums[k] value in nums[i]
                nums[i] = nums[k];
                // increment i by 1
                i = i + 1;
            }
        }
        // Finally return i
        return i;
    }
}

// Output -
/*
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

// Algorithm -
/*
1. Loop through all elements
2. & check these condition if i == 0 or i == 1 or nums[i-2] != nums[k],
   If satisfied this condition, Store nums[k] value in nums[i] &
   increment i by 1
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/