public class Remove_Duplicates_From_Sorted_Array {
    // Remove Duplicates Function
    public int removeDuplicates(int[] nums) {

        // Return, if array is empty or contains a single
        // element
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        // Create variable j and assign value to 0
        // (Store the single value of all the elements)
        int j = 0;
        // Start traversing elements
        for (int i=0; i<nums.length-1; i++) {
            // Check, If current element is not equal to next
            // element then store that current element
            if (nums[i] != nums[i+1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
        nums[j] = nums[nums.length-1];
        j++;

        // Finally return j
        return j;
    }
}

// Output -
/*
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

// Algorithm -
/*
1. Return, if array is empty or contains a single element
2. Create variable j and assign value to 0 (Store the single value of all the elements)
3. Start traversing elements
4. Check, If current element is not equal to next element then store that current element
5. Store the last element as whether it is unique or repeated, it hasn't stored previously
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/
