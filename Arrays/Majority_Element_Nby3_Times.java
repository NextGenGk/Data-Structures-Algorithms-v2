package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Majority_Element_Nby3_Times {

    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            int number1 = -1;
            int number2 = -1;

            int count1 = 0;
            int count2 = 0;

            int len = nums.length;

            for (int i = 0; i < len; i++) {
                if (nums[i] == number1) {
                    count1++;
                } else if (nums[i] == number2) {
                    count2++;
                } else if (count1 == 0) {
                    number1 = nums[i];
                    count1 = 1;
                } else if (count2 == 0) {
                    number2 = nums[i];
                    count2 = 1;
                } else {
                    count1--;
                    count2--;
                }
            }

            List<Integer> ans = new ArrayList<>();
            count1 = 0;
            count2 = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] == number1) {
                    count1++;
                } else if (nums[i] == number2) {
                    count2++;
                }
            }

            if (count1 > len / 3) {
                ans.add(number1);
            }
            if (count2 > len / 3) {
                ans.add(number2);
            }
            return ans;
        }
    }
}

// Output -
/*
Input: nums = [3,2,3]
Output: [3]
*/

// Algorithm -
/*
1. We first initialize two numbers and two counts.
2. We traverse the array and check if the current element is equal to either of the two numbers.
3. If it is equal, we increment the count of that number.
4. If it is not equal, we decrement the count of both the numbers.
5. If the count of either of the two numbers becomes zero, we set the corresponding number to the current element
 and set the count to 1.
6. Finally, we traverse the array again and check if the count of either of the two numbers is greater than n/3.
 If so, we add that number to the answer list.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
*/