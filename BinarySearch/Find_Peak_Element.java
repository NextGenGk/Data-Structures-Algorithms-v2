package BinarySearch;

public class Find_Peak_Element {

    // Brute Force Approach
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        }
        if (nums[0] >= nums[1]) {
            return 0;
        }
        if (nums[n - 1] >= nums[n - 2]) {
            return n - 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) {
                return i;
            }
        }
        return 0;
    }

// Output -
/*
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
*/

// Algorithm -
/*
1. If the array is empty, return 0.
2. If the first element is greater than the second element, return 0.
3. If the last element is greater than the second last element, return n-1.
4. If the above conditions are not satisfied, then iterate through the array
and return the index of the element which is greater than its previous and next element.
*/

// Time & Space Complexity -
/*
Time - O(N), where N is for linearly traversing
Space - O(1), no extra space is needed
*/

    
    // Optimal Approach
    class Solution {
        public int findPeakElement(int[] nums) {
            int low = 0;
            int high = nums.length - 1;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] > nums[mid + 1]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }
    }
}

// Output -
/*
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
*/

// Algorithm -
/*
1. We start with low = 0 and high = n-1.
2. We find the mid element.
3. If the mid element is greater than its next element, then the mid element is the peak.
4. If the mid element is smaller than its next element, then the mid element is not the peak and
 we can discard all elements on the left of mid, including mid.
5. We repeat steps 2 and 3 until low <= high.
*/

// Time & Space Complexity -
/*
Time - O(log*N), because we applied binary Search
Space - O(1), no extra space is needed
*/
