package Arrays;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {

    class Solution {
        // Longest Consecutive Sequence Function
        public int longestConsecutive(int[] nums) {
            // First, we put all the elements in a HashMap.
            HashMap<Integer, Boolean> hm = new HashMap<>();
            for (int i=0; i<nums.length; i++) {
                hm.put(nums[i], true);
            }

            // Then, we check if the HashMap contains any elements – 1. If it does, then we convert the
            // value to false
            for (int i=0; i<nums.length; i++) {
                if(hm.containsKey(nums[i] - 1)) {
                    hm.put(nums[i], false);
                }
            }

            // Finally, we return the maximum length.
            int max = 0;
            for(Integer key : hm.keySet()) {
                if (hm.get(key) == true) {
                    max = Math.max(max, findLength(hm, key));
                }
            }
            return max;
        }

        // Find Maximum Length Function
        private int findLength(HashMap<Integer, Boolean> hm, int k) {
            int ans = 0;
            while(hm.containsKey(k)) {
                ans++;
                k++;
            }
            return ans;
        }
    }

// Output -
/*
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
*/

// Logic -
/*
1. First, we put all the elements in a HashMap.
2. Then, we check if the HashMap contains any elements – 1. If it does, then we convert the value to false.
3. Then, we iterate the HashMap and check if any elements of the HashMap contains true value. If it does, then we find the length of the longest consecutive sequence.
4. Finally, we return the maximum length.
*/

// Time & Space Complexity -
/*
Time - O(N), because, we iterate the array by once
Space - O(N), because using HashMap
*/
}
