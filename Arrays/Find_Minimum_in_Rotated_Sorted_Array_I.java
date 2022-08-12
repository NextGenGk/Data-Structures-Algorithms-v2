package Arrays;

public class Find_Minimum_in_Rotated_Sorted_Array_I {
    // Find Minimum In Rotated Sorted Array Function
    public int findMin(int[] nums) {
        // Starting Index
        int start = 0;
        // Ending Index
        int end = nums.length-1;
        // While start index is smaller than end index
        while (start < end) {
            // Find mid index
            int mid = start + (end - start)/2;
            // If middle element is greater than ending element
            if (nums[mid] > nums[end]){
                // Start is start from mid + 1
                start = mid+1;
            }
            // Else, the value of mid index is store in ending index
            else {
                end = mid;
            }
        }
        return nums[start];
    }
}

// Output -
/*
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
*/

// Algorithm -
/*
1. Initialize start & end index to 0 & length - 1
2. While start index is smaller than end index
3. Check, If middle element is greater than ending element, Start is start from mid + 1
4. Else, the value of mid index is store in ending index
5. Finally return starting element
 */

// Time & Space Complexity -
/*
Time - O(log*n)
Space - O(1)
 */