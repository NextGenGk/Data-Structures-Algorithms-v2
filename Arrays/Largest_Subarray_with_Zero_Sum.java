package Arrays;

import java.util.HashMap;

public class Largest_Subarray_with_Zero_Sum {

    int maxLen(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxi = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxi = i + 1;
            } else if (map.get(sum) != null) {
                maxi = Math.max(maxi, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxi;
    }
}

// Output -
/*
Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with sum 0 will be -2 2 -8 1 7.
*/

// Approach -
/*
1. We first initialize a HashMap to store the cumulative sum of the elements of the array.
2. We then iterate through the array and for each element, we add it to the cumulative sum.
3. If the cumulative sum is 0, then we update the maximum length as the current index + 1.
4. If the cumulative sum is already present in the HashMap, then we update the maximum length as max(maximum length, current index – HashMap[cumulative sum]).
5. If the cumulative sum is not present in the HashMap, then we add the cumulative sum as the key and the current index as the value to the HashMap.
6. Finally, we return the maximum length.
*/

// Time & Space Complexity -
/*
Time - O(N*logN), because N for linear traverse & logN for using hashMap
Space - because N for storing data in hashMap
*/