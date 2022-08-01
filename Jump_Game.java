public class Jump_Game {
    // Can Jump Function
    public boolean canJump(int[] nums) {
        // Initialize reach with zero
        int reach = 0;
        // looping through reach
        for(int i=0; i<= reach; i++) {
            // find max reach
            reach = Math.max(reach, i + nums[i]);
            // if, reach is greater than length - 1
            // means
            if(reach >= nums.length-1) {
                return true;
            }
        }
        return false;
    }
}

// Output -
/*
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/