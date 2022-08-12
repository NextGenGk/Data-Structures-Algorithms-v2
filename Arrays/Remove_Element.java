package Arrays;

public class Remove_Element {
    // Remove Element Function
    public int removeElement(int[] nums, int val) {

        // Initialize variable k
        int k = 0;

        // Start traversing elements
        for (int i=0; i<nums.length; i++) {
            // Check, If current value is equal to target, then skip this iteration
            if (nums[i] == val) {
                continue;
            }
            // Else current value is add to variable k,
            // & increment the k by 1
            else {
                nums[k] = nums[i];
                k++;
            }
        }
        // Finally Return
        return k;
    }
}

// Output -
/*
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

// Algorithm -
/*
1. Initialize variable k
2. Start traversing elements
3. Check, If current value is not equal to target, then skip this iteration
4. Else current value is add to variable k, & increment the k by 1
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/
