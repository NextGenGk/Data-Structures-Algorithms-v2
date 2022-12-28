package Stack_and_Queues;

import java.util.Stack;

// Brute Force Method -

public class Previous_Smaller_Elements {
    static void prevGreater(int[] arr, int n) {
        // Previous greater for first element never exists,
        // so we print -1.
        System.out.print("-1, ");

        // Let us process remaining elements.
        for (int i = 1; i < n; i++) {

            // Find first element on
            // left side that is greater than arr[i].
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    System.out.print(arr[j] + ", ");
                    break;
                }
            }

            // If all elements on left are smaller.
            if (j == -1)
                System.out.print("-1, ");
        }
    }

// Approach -
/*
A simple solution is to run two nested loops.
The outer loop picks an element one by one. The inner loop, find the previous element that is greater.
 */

// Time & Space Complexity -
/*
Time - O(N^2)
Space - O(N)
 */

// Optimal Solution -

    static void prevGreater1(int[] arr, int n) {
        // Create a stack and push
        // index of first element to it
        Stack<Integer> s = new Stack<Integer>();
        s.push(arr[0]);

        // Previous greater for first element is always -1.
        System.out.print("-1, ");

        // Traverse remaining elements
        for (int i = 1; i < n; i++) {
            // Pop elements from stack while stack is not empty and top of stack is smaller
            // than arr[i]. We always have elements in decreasing order in a stack.
            while (!s.empty() && s.peek() < arr[i]) {
                s.pop();
            }

            // If stack becomes empty, then no element is greater on left
            // side. Else top of stack is previous greater.
            if (s.empty()) {
                System.out.print("-1, ");
            } else {
                System.out.print(s.peek() + ", ");
            }
            s.push(arr[i]);
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 20, 40, 12, 30};
        int n = arr.length;
        prevGreater1(arr, n);
    }
}


// Output -
/*
-1, 10, 4, -1, -1, 40, 40,
 */

// Algorithm -
/*
1. We first push the first element to the stack.
2. We then print -1 as the previous greater for the first element.
3. We then traverse the array from the second element.
4. We keep popping elements from the stack while the stack is not empty and the top of the stack is smaller than the current element.
5. If the stack becomes empty, then the current element is the smallest element in the remaining elements.
6. If the stack is not empty, then the top of the stack is the previous greater for the current element.
7. We then push the current element to the stack.
8. We then print the top of the stack as the previous greater for the current element.
 */

// Time & Space Complexity -
/*
Time - O(N). It seems more than O(N) at first look. If we take a closer look, we can observe that every element of
array is added and removed from stack at most once. So there are total 2n operations at most.
Assuming that a stack operation takes O(1) time, we can say that the time complexity is O(n).
Space - O(N) in worst case when all elements are sorted in decreasing order.
 */