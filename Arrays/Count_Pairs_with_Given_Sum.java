package Arrays;

import java.util.HashMap;

public class Count_Pairs_with_Given_Sum {

    class Solution {

        int getPairsCount(int[] arr, int n, int k) {
            int count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (arr[i] < k) {
                    int element = k - arr[i];
                    if (map.containsKey(element)) {
                        count += map.get(element);
                    }
                    if (map.get(arr[i]) == null) {
                        map.put(arr[i], 0);
                    }
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
            }
            return count;
        }
    }
}

// Output -
/*
Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation:
arr[0] + arr[1] = 1 + 5 = 6
and arr[1] + arr[3] = 5 + 1 = 6.
*/

// Algorithm -
/*
1. We first initialize a hashmap to store the frequency of each element in the array.
2. Then we iterate through the array and check if the element is less than k. If it is, we check if the difference between the element and k is present in the hashmap. If it is, we increment the count by the frequency of the difference in the hashmap.
3. If the difference is not present in the hashmap, we add it to the hashmap with a frequency of 1.
4. Finally, we return the count.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(N)
*/