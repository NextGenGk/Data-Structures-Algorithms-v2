package Stack_and_Queues;
import java.util.Stack;

public class Next_Greater_Element_II_Circular {

    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int n = nums.length;
            int[] nge = new int[n];
            Stack<Integer> st = new Stack<>();
            // twice of the length
            for (int i = 2 * n - 1; i >= 0; i--) {
                while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                    st.pop();
                }

                // not running till i'th index is less than n length (elements)
                if (i < n) {
                    if (!st.isEmpty()) nge[i] = st.peek();
                    else nge[i] = -1;
                }
                // value is pushing to the stack in each iteration
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

// Algorithm -
/*
1. We first create an array of size n to store the next greater elements.
2. We then create a stack and push the first element to the stack.
3. We then iterate through the remaining elements and do the following:
    a. If the stack is empty or the top of the stack is greater than the current element, then we push the current element to the stack.
    b. If the stack is not empty and the top of the stack is less than the current element, then we keep popping the stack while the top of the stack is greater than the current element.
    c. We keep popping the stack until the stack becomes empty or the top of the stack is not less than the current element.
    d. If the stack becomes empty, then we push the current element to the stack.
    e. Otherwise, we push the top of the stack to the next greater element array.
    f. We then push the current element to the stack.
4. Once we are done with the iteration, we return the next greater element array.
*/

// Time & Space Complexity -
/*
Time - O(2*N + 2*N) = O(N)
Space - O(N), where N is using a stack
*/