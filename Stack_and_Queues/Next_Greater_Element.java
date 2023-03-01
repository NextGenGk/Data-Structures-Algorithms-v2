package Stack_and_Queues;

import java.util.Stack;

public class Next_Greater_Element {

    // Brute Force Method -

    /* prints element and NGE pair for all elements of arr[] of size n */
    static void printNGE(int[] arr, int n) {
        int next;
        for (int i = 0; i < n; i++) {
            next = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " -- " + next);
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {11, 13, 21, 3};
        int n = arr.length;
        printNGE(arr, n);
    }

// Output -
/*
11 --> 13
13 --> 21
21 --> -1
3 --> -1
 */

// Approach -
/*
Follow the steps mentioned below to implement the idea:

1. Traverse the array from index 0 to end.
2. For each element start another loop from index i+1 to end.
3. If a greater element is found in the second loop then print it and break the loop, else print -1.
 */

// Time & Space Complexity -
/*
Time - O(N^2)
Space - O(1)
*/

    // Optimal Solution -

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