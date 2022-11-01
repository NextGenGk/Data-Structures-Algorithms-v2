package BinarySearch;

public class Find_Minimum_in_Rotated_Sorted_Array_II {
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
            // Else if, the value of mid element is smaller than ending element,
            // the value of mid index is store in ending index
            else if (nums[mid] < nums[end]){
                end = mid;
            }
            // Else, decrement ending index by one
            else {
                end--;
            }
        }
        return nums[start];
    }
}

// Output -
/*
Input: nums = [2,2,2,0,1]
Output: 0
*/

// Algorithm -
/*
1. Initialize start & end index to 0 & length - 1
2. While start index is smaller than end index
3. Check, If middle element is greater than ending element, Start is start from mid + 1
4. Else if, the value of mid element is smaller than ending element,
   the value of mid index is store in ending index
5. Else, decrement ending index by one
6. Finally, return starting element
 */

// Time & Space Complexity -
/*
Time - O(log*n)
Space - O(1)
 */