package Arrays;

public class Find_the_Duplicate_Number {

    class Solution {
        public int findDuplicate(int[] nums) {
            int slow = nums[0];
            int fast = nums[0];

            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }
            while (slow != fast);

            fast = nums[0];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }
            return slow;
        }
    }
}

// Output -
/*
Input: nums = [1,3,4,2,2]
Output: 2
*/

// Algorithm -
/*
1. We first initialize two variables slow and fast to nums[0].
2. Then we start a while loop with the condition that slow and fast do not equal each other.
3. Inside the while loop, we first update slow to nums[slow] and fast to nums[nums[fast]].
4. Then we check if slow and fast are equal.
5. If they are not equal, we update slow to nums[slow] and fast to nums[fast].
6. If they are equal, we return slow.
*/

// Time & Space Complexity -
/*
Time - O(N), because on linearly traversing an array by once
Space - O(1), no extra space is needed
*/