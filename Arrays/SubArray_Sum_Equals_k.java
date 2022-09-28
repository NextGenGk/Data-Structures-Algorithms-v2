package Arrays;

import java.util.HashMap;

public class SubArray_Sum_Equals_k {

    class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0;
            int sum = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (map.containsKey(sum - k))
                    count += map.get(sum - k);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return count;
        }
    }
}

// Output -
/*
Input: nums = [1,1,1], k = 2
Output: 2
*/

// Algorithm -
/*
1. We initialize a hash map that keeps track of the cumulative sum up to index i.
2. We iterate through the array and for each index i, we calculate the sum of subarray nums[0..i].
3. If the sum minus k exists in the hash map, then we increment the count by the value of that key in the hash map.
4. We also update the hash map by adding the current sum to it.
5. Finally, we return the count.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
*/