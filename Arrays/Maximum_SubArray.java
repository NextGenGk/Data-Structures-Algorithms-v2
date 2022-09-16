package Arrays;

public class Maximum_SubArray {
    // Maximum SubArray Sum Function
    public int maxSubArray(int[] nums) {
        // Initialize currentSum to 0, & maxSum to 1st element of array
        int currentSum = 0;
        int maxSum = nums[0];

        // Loop through each element of array
        for (int i=0; i<nums.length; i++) {
            // Add 1st element of array to currentSum
            currentSum = currentSum + nums[i];

            // Check, if currentSum is greater than maxSum
            // Update maxSum to currentSum
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }

            // check, if currentSum value is less than 0
            // update currentSum to 0
            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        // Finally, return maxSum
        return maxSum;
    }
}

// Output -
/*
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/

// Algorithms (Kadane Algorithm) -
/*
1. Initialize currentSum to 0, & maxSum to 1st element of array
2. Loop through each element of the array & Add 1st element of array to currentSum
& check
    1. Check, if currentSum is greater than maxSum, if true
       then Update maxSum to currentSum
    2. Check, if currentSum value is less than 0, if true
       than update currentSum to 0
3. Finally, return maxSum
 */

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
 */