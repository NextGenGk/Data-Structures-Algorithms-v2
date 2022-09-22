package Arrays;

public class Rearrange_Element_by_Sign {

    class Solution {
        public int[] rearrangeArray(int[] nums) {
            int[] res = new int[nums.length];
            int positive = 0;
            int negative = 1;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    res[positive] = nums[i];
                    positive = positive + 2;
                } else {
                    res[negative] = nums[i];
                    negative = negative + 2;
                }
            }
            return res;
        }
    }
}

// Output -
/*
Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.
*/

// Algorithm -
/*
1. We first find the number of positive and negative numbers in the array.
2. We then create two arrays of the same size as the original array.
3. We then iterate through the original array and copy the positive numbers to the first array and the negative numbers to the second array.
4. Finally, we copy the first array to the original array and the second array to the original array.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(N), where N is the size of given array
*/