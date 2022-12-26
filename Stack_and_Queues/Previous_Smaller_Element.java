package Stack_and_Queues;

import java.util.Stack;

public class Previous_Smaller_Element {

// Brute Force Method -

    // Prints smaller elements on left side of every element
    static void printPrevSmaller(int[] arr, int n) {
        // Always print empty or '_' for first element
        System.out.print("_, ");
        // Start from second element
        for (int i = 1; i < n; i++) {
            // look for smaller element on left of 'i'
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    System.out.print(arr[j] + ", ");
                    break;
                }
            }
            // If there is no smaller element on left of 'i'
            if (j == -1)
                System.out.print("_, ");
        }
    }

//    // Main Function
//    public static void main(String[] args) {
//        int[] arr = { 1, 3, 0, 2, 5 };
//        int n = arr.length;
//        printPrevSmaller(arr, n);
//    }

// Algorithm -
/*
A Simple Solution is to use two nested loops. The outer loop starts from the second element, the inner loop goes
to all elements on the left side of the element picked by the outer loop and stops as soon as it finds a smaller element.
 */

// Output -
/*
_, 1, _, 0, 2, ,
 */

// Time & Space Complexity -
/*
Time - O(N^2)
Space - O(N)
 */

// Optimal Solution -

    // Prints smaller elements on left side of every element
    static void prevSmaller(int[] arr, int n) {
        // Create an empty stack
        Stack<Integer> stk = new Stack<>();

        // Traverse all array elements
        for (int i = 0; i < n; i++) {
            // Keep removing top element from stk while the top
            // element is greater than or equal to arr[i]
            while (!stk.empty() && stk.peek() >= arr[i]) {
                stk.pop();
            }

            // If all elements in stk were greater than arr[i]
            if (stk.empty()) {
                System.out.print("_, ");
            } else //Else print the nearest smaller element
            {
                System.out.print(stk.peek() + ", ");
            }

            // Push this element
            stk.push(arr[i]);
        }
    }

    //    // Main Function
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 2, 5};
        int n = arr.length;
        prevSmaller(arr, n);
    }
}

// Output -
/*
_, 1, _, 0, 2, ,
 */

// Algorithm -
/*
Let input sequence be 'arr[]' and size of array be 'n'

1) Create a new empty stack S

2) For every element 'arr[i]' in the input sequence 'arr[]',
   where 'i' goes from 0 to n-1.
    a) while S is nonempty and the top element of
       S is greater than or equal to 'arr[i]':
           pop S

    b) if S is empty:
           'arr[i]' has no preceding smaller value
    c) else:
           the nearest smaller value to 'arr[i]' is
           the top element of S

    d) push 'arr[i]' onto S
 */

// Time & Space Complexity -
/*
Time - O(N), Time complexity of the above program is O(n) as every element is pushed and popped at most once to the
stack. So overall constant number of operations are performed per element.
Space - O(N)
 */