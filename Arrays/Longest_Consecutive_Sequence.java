package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class Longest_Consecutive_Sequence {

    class Solution {
        //    1st Approach -
        // Longest Consecutive Sequence Function
        public int longestConsecutive1(int[] nums) {
            // First, we put all the elements in a HashMap.
            HashMap<Integer, Boolean> hm = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                hm.put(nums[i], true);
            }

            // Then, we check if the HashMap contains any elements – 1.
            // If it does, then we convert the  value to false
            for (int i = 0; i < nums.length; i++) {
                if (hm.containsKey(nums[i] - 1)) {
                    hm.put(nums[i], false);
                }
            }

            // Finally, we return the maximum length.
            int max = 0;
            for (Integer key : hm.keySet()) {
                if (hm.get(key) == true) {
                    max = Math.max(max, findLength(hm, key));
                }
            }
            return max;
        }

        // Find Maximum Length Function
        private int findLength(HashMap<Integer, Boolean> hm, int k) {
            int ans = 0;
            while (hm.containsKey(k)) {
                ans++;
                k++;
            }
            return ans;
        }

        //  2nd Approach -
        public int longestConsecutive2(int[] nums) {
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                hs.add(nums[i]);
            }

            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                if (!hs.contains(nums[i] - 1)) {
                    int count = 0;
                    int current = nums[i];
                    while (hs.contains(current)) {
                        count++;
                        current++;
                    }
                    ans = Math.max(ans, count);
                }
            }
            return ans;
        }
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
1st Approach -
1. First, we put all the elements in a HashMap.
2. Then, we check if the HashMap contains any elements – 1. If it does, then we convert the value to false.
3. Then, we iterate the HashMap and check if any elements of the HashMap contains true value. If it does, then we find the length of the longest consecutive sequence.
4. Finally, we return the maximum length.

2nd Approach -
1. We first create a HashSet to store all the numbers in the array.
2. Then we iterate through the array and add each number to the HashSet.
3. Then we iterate through the array again and for each number we check if it’s the start of a sequence by checking if it’s not already contained in the HashSet.
4. If it’s not already contained, we check if it’s the beginning of a sequence by checking if its previous number is not already contained.
5. If it’s the beginning of a sequence, we count the sequence and update the answer.
6. Finally, we return the answer.
*/

// Time & Space Complexity -
/*
Time - O(N), because, we iterate the array by once
Space - O(N), because using HashMap
*/