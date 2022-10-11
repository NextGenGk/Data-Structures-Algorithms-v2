package Arrays;

public class Jump_Game_II {
    // Jump Game II Function
    public int jump(int[] nums) {
        // Initialize variables jumps, currentJumpEnd, farthest to 0
        int jumps = 0;
        int currentJumpEnd = 0;
        int farthest = 0;

        // Traverse over the given array and perform the following operation:
        // farthest = i + nums[i]
        // If end is reached, then ith jump is finished, therefore update end = farthest.
        for(int i=0; i<nums.length-1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if(i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        // Finally Return total jumps
        return jumps;
    }
}

// Output-
/*
Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */

// Algorithm -
/*
1. Consider three variables, jumps, which stores the number of jumps, end, which denotes the end of the array and farthest denoting the farthest one can jump and initialise them to 0.
2. Traverse over the given array and perform the following operation:
    farthest = i + nums[i]
    If end is reached, then ith jump is finished, therefore update end = farthest.
3. Return total jumps.

// New Approach -
1. We initialize jumps to 0 and currentJumpEnd to 0.
2. We loop through the array length - 1.
3. We find the farthest jump that can be made from the current index.
4. If i == currentJumpEnd, then we increase the jumps by 1.
5. Finally, we return the minimum jumps.
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */
