package BinarySearch;

public class Single_Element_in_Sorted_Array {

    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int low = 0;
            int high = nums.length - 2;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (mid % 2 == 0) {
                    if (nums[mid] != nums[mid + 1]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    if (nums[mid] == nums[mid + 1]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
            return nums[low];
        }
    }
}

// Output -
/*
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
*/

// Algorithm -
/*
1. We first initialize low and high to 0 and nums.length-2 respectively.
2. We then enter a while loop with the condition low <= high.
3. We initialize mid to low + (high - low) / 2.
4. If mid is even, we check if nums[mid] != nums[mid+1]. If this is true, it means that the element at index mid is
the single element that occurs once. So we update high to mid-1.
5. If this is not true, it means that the elements between nums[mid] and nums[mid+1] occur twice.
 So we update low to mid+1.
6. If mid is odd, we check if nums[mid] == nums[mid+1]. If this is true, it means that the elements between
 nums[mid] and nums[mid+1] occur twice. So we update high to mid-1.
7. If this is not true, it means that the element at index mid is the single element that occurs once.
 So we update low to mid+1.
8. After the while loop terminates, we return nums[low].
*/

// Time & Space Complexity -
/*
Time - O(log*N)
Space _ O(1)
*/