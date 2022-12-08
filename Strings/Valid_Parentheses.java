package Strings;

import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        // Create a Stack
        Stack<Character> stack = new Stack<>();
        // Loop for each character of the string
        for (char c : s.toCharArray()) {
            // If left symbol is encountered,
            // then put it into the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If none of the valid symbols is encountered
                if (stack.isEmpty()) return false;
                // If right symbol is encountered & stack's top element is left symbol,
                // then return false
                if (c == ')' && stack.peek() != '(') return false;
                if (c == '}' && stack.peek() != '{') return false;
                if (c == ']' && stack.peek() != '[') return false;

                // If left parentheses & right parentheses same, then simply pop the top element
                stack.pop();
            }
        }
        // If left & right element are same,
        // that means this is valid parentheses, return
        return stack.isEmpty();
    }
}

// Output -
/*
Input: s = "()[]{}"
Output: true
*/

// Algorithm -
/*
1. Traverse the string from left to right. (for each character of the string)
2. If we encounter the open/left parenthesis, then we will push it to the Stack data structure due to its
Last In First Out (LIFO) property.
3. If we encounter any of the close/right parentheses, we will check it with the top of the stack.
 If it is the correct corresponding open/left parenthesis, we will move further, else we will return false.
4. At last, for valid string, the stack should be empty because all the left parentheses
 should have matched with the right ones.
 */

// Time & Space Complexity -
/*
Time - O(N), where N, because of linearly traversing an character array
Space - O(1), no extra space is needed
 */