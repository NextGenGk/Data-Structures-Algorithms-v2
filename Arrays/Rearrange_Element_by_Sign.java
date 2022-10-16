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
1. First we create result auxiliary array with the size of array length
2. And iterate through length of array & check
    i. if value is positive then added to the result auxiliary array, & jump by 2 steps
   ii. else, added to the negative, & jump by 2 steps
*/

// Time & Space Complexity -
/*
Time - O(N), where N is traversing an array by once
Space - O(N), where N is the size of given array
*/