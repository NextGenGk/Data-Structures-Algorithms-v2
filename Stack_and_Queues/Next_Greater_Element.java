package Stack_and_Queues;

import java.util.Stack;

public class Next_Greater_Element {

    class Solution {
        //Function to find the next greater element for each element of the array.
        public static long[] nextLargerElement(long[] arr, int n) {
            long[] nge = new long[n];
            Stack<Long> stk = new Stack<Long>();

            for (int i = n - 1; i >= 0; i--) {
                while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                    stk.pop();
                }

                if (i < n) {
                    if (!stk.isEmpty()) {
                        nge[i] = stk.peek();
                    } else {
                        nge[i] = -1;
                    }
                }
                stk.push(arr[i]);
            }
            return nge;
        }
    }
}

// Output -
/*
Input:
N = 4, arr[] = [1 3 2 4]
Output:
3 4 4 -1
Explanation:
In the array, the next larger element
to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ? since it doesn't exist, it is -1.
*/

// Algorithm -
/*
1. We initialize an array of size n to store the next greater element for each element.
2. We initialize a stack to store the elements in the decreasing order.
3. We traverse the array from the end.
4. We keep popping elements from the stack while the stack is not empty and the top element of the stack is less than or equal to the current element.
5. If the stack is not empty, then the top element of the stack is the next greater element for the current element.
6. If the stack is empty, then there is no next greater element for the current element.
7. We push the current element to the stack.
8. We return the array of next greater elements.
*/

// Time & Space Complexity -
/*
Time - O(N), where N is linear traversing an array
Space - O(N), where N is using a stack
*/