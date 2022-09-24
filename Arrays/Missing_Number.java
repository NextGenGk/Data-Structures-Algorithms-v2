package Arrays;

public class Missing_Number {

    class Solution {
        public int missingNumber(int[] nums) {
            int sum = 0;
            int n = nums.length;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            return n * (n + 1) / 2 - sum;
        }
    }
}

// Logic sum of N natural numbers n*(n-1)/2

// Output -
/*
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
*/

// Algorithm -
/*
1. First, we initialize a variable sum to 0.
2. Next, we loop through the array nums and add each element to sum.
3. Finally, we return n*(n+1)/2 - sum.
*/

// Time & Space Complexity -
/*
Time - O(N), where N is we traverse the array by once
Space - O(1)
*/