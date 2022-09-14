package Arrays;

public class Majority_Element {
    // Boyer Moore's Majority Element Function
    public int majorityElement(int[] nums) {
        // Create num variable result and assign first value on it
        int result = nums[0];
        // and increase the count by 1
        int count = 1;

        // Loop through last element of the array
        for (int i=1; i<nums.length; i++) {
            // Create variable num and store the first value of looping element
            int num = nums[i];
            // Check, If result in equal to num variable, increase the count by 1
            if (result == num) {
                count++;
            }
            // Else, decrease the count by 1
            else {
                count--;
            }

            // If count variable is equal to zero
            if (count == 0) {
                // Then result variable assign the value of num, & increase the
                // count by 1
                result = num;
                count = 1;
            }
        }
        // Finally return result
        return result;
    }
}

// Output -
/*
Input: nums = [3,2,3]
Output: 3
*/

// Algorithm -
/*
1. Create num variable result and assign first value on it,
   and increase the count by 1
2. Loop through nums.length
3. Create variable num and store the first value of looping element
4. Check, If result in equal to num variable, increase the count by 1
5. Else, decrease the count by 1
6. If count variable is equal to zero, Then result variable assign the value of num, &
   increase the count by 1
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/