package Stack_and_Queues;

import java.util.Stack;

public class Next_Smaller_Element {

// Brute Force Method -

    public static int[] help_classmate(int[] arr, int n) {
        int[] nse = new int[n];
        Stack<Integer> stk = new Stack<Integer>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && stk.peek() >= arr[i]) {
                stk.pop();
            }

            if (stk.isEmpty()) {
                nse[i] = -1;
            } else {
                nse[i] = stk.peek();
            }
            stk.push(arr[i]);
        }
        return nse;
    }

// Approach -
/*
Use two loops: The outer loop picks all the elements one by one. The inner loop looks for the first smaller element
for the element picked by outer loop. If a smaller element is found then that element is printed as next, otherwise,
-1 is printed.
 */

// Time & Space Complexity -
/*
Time - O(N^2)
Space - O(1)
*/

// Optimal Solution -

    class Solution {
        static void printNSE(int[] arr, int n) {
            int next, i, j;
            for (i = 0; i < n; i++) {
                next = -1;
                for (j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
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
            printNSE(arr, n);
        }
    }
}

// Output -
/*
Input: N = 5, arr[] = {3, 8, 5, 2, 25}
Output: 2 5 2 -1 -1
Explanation:
1. Roll number 1 has 3 marks. The first person who has less marks than him is roll number 4,
who has 2 marks.
2. Roll number 2 has 8 marks, he helps student with 5 marks.
3. Roll number 3 has 5 marks, he helps student with 2 marks.
4. Roll number 4 and 5 can not pick anyone as no student with higher roll number has lesser marks than them.
This is denoted by -1.
Output shows the marks of the weaker student that each roll number helps in order. ie- 2,5,2,-1,-1
 */

// Algorithm -
/*
1. We first create an array of size n.
2. We create a stack of size n.
3. We traverse the array from end to start.
4. We push the element into the stack.
5. We check if the stack is empty or not. If it is empty, then we push -1 into the array.
6. If the stack is not empty, then we check if the top element of the stack is greater than or equal to the current
element. If it is, then we pop the top element and push the current element into the stack.
7. If the stack is not empty and the top element is less than the current element, then we push the current element
into the stack.
8. We return the array.
 */

// Time & Space Complexity -
/*
Time - O(N), where N is linear traversing an array
Space - O(N), where N is using a stack
*/