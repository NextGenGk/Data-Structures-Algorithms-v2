package Arrays;

public class Max_Consecutive_Ones {

    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count = 0;
            int max = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    count++;
                } else {
                    count = 0;
                }

                max = Math.max(max, count);
            }

            return max;
        }
    }
}

// Output -
/*
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
*/

// Algorithm -
/*
1. We initialize two variables: count and max.
2. We loop through the array and check if the current element is 1.
3. If it is, we increment count.
4. If it isn’t, we set count to 0.
5. We update max with the maximum value of count.
6. Finally, we return max.
*/

// Time & Space Complexity -
/*
Time - O(N), because of linear traversing
Space - O(1), no extra space is needed
*/