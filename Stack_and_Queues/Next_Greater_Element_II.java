package Stack_and_Queues;
import java.util.Stack;

public class Next_Greater_Element_II {

    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int n = nums.length;
            int[] nge = new int[n];
            Stack<Integer> st = new Stack<>();
            for (int i = 2 * n - 1; i >= 0; i--) {
                while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                    st.pop();
                }

                if (i < n) {
                    if (!st.isEmpty()) nge[i] = st.peek();
                    else nge[i] = -1;
                }

                st.push(nums[i % n]);
            }
            return nge;
        }
    }
}

// Output -
/*
Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2;
The number 2 can't find next greater number.
The second 1's next greater number needs to search circularly, which is also 2.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(N)
*/