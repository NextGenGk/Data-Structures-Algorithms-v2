package Stack_and_Queues;

import java.util.Stack;

public class Remove_K_Digits {

    class Solution {
        public String removeKdigits(String num, int k) {
            int len = num.length();

            // corner Case
            if (k == len) {
                return "0";
            }

            // create a stack
            Stack<Character> stk = new Stack<>();
            int i = 0;

            while (i < len) {
                // whenever meet a digit which is less than the previous digit, discard the previous one
                // Ex - "1234567890" Output - "0" (using while)
                while (!stk.isEmpty() && stk.peek() > num.charAt(i) && k > 0) {
                    stk.pop();
                    k--;
                }
                stk.push(num.charAt(i));
                i++;
            }

            // Ex - "143278" Output = "12"
            while (k > 0) {
                stk.pop();
                k--;
            }

            // construct the number from the stack
            StringBuilder sb = new StringBuilder();
            while (!stk.isEmpty()) {
                sb.append(stk.pop());
            }
            sb.reverse();

            // remove all the 0 at the head
            while (sb.length() > 1 && sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }
            return sb.toString();
        }
    }
}

// Output -
/* Example 1:
Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

Example 2:
Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200.
Note: that the output must not contain leading zeroes.

Example 3:
Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.
*/

// Algorithm -
/*
1. We first initialize a stack to store the digits.
2. We then iterate through the digits of the number from left to right.
3. We keep on popping the stack if the stack is not empty and the top of the stack is greater than the current digit.
4. We push the current digit onto the stack.
5. We keep on doing this until k becomes 0.
6. Once k becomes 0, we start popping the stack and adding the popped digits to the string builder.
7. We keep on doing this until the stack becomes empty.
8. We reverse the string builder and return the result.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(N)
*/