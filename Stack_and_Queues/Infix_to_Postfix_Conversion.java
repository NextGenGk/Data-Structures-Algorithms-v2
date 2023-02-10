package Stack_and_Queues;

import java.util.Stack;

public class Infix_to_Postfix_Conversion {

    class Solution {
        // A utility function to return
        // precedence of a given operator
        // Higher returned value means
        // higher precedence
        static int Prec(char ch) {
            switch (ch) {
                case '+':
                case '-':
                    return 1;

                case '*':
                case '/':
                    return 2;

                case '^':
                    return 3;
            }
            return -1;
        }

        // The main method that converts
        // given infix expression
        // to postfix expression.
        static String infixToPostfix(String exp) {
            // initializing empty String for result
            String result = "";

            // initializing empty stack
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < exp.length(); ++i) {
                char c = exp.charAt(i);

                // If the scanned character is an
                // operand, add it to output.
                if (Character.isLetterOrDigit(c))
                    result += c;

                    // If the scanned character is an '(',
                    // push it to the stack.
                else if (c == '(')
                    stack.push(c);

                    // If the scanned character is an ')',
                    // pop and output from the stack
                    // until an '(' is encountered.
                else if (c == ')') {
                    while (!stack.isEmpty() &&
                            stack.peek() != '(')
                        result += stack.pop();

                    stack.pop();
                } else // an operator is encountered
                {
                    while (!stack.isEmpty() && Prec(c) <=
                            Prec(stack.peek())) {

                        result += stack.pop();
                    }
                    stack.push(c);
                }
            }

            // pop all the operators from the stack
            while (!stack.isEmpty()) {
                if (stack.peek() == '(')
                    return "Invalid Expression";
                result += stack.pop();
            }
            return result;
        }
    }
}

// Output -
/*
Input: str = "a+b*(c^d-e)^(f+g*h)-i"
Output: abcd^e-fgh*+^*+i-
Explanation:
After converting the infix expression
into postfix expression, the resultant
expression will be abcd^e-fgh*+^*+i-
 */

// Algorithm -
/*
1. We are using a stack to store the operators.
2. If the scanned character is an operand, add it to output.
3. If the scanned character is an ‘(‘, push it to the stack.
4. If the scanned character is an ‘)’, pop and output from the stack until an ‘(‘ is encountered.
5. If an operator is scanned
    a. If the stack is empty, push the operator to stack.
    b. If the precedence of the scanned operator is greater than the precedence of the operator in the
    stack(or the stack is empty), push it.
    c. If the precedence of the scanned operator is less than or equal to the precedence of the operator
     in the stack, pop the operator from the stack and add it to the output until the precedence of the
     scanned operator is less-than or equal to the precedence of the operator residing on the top of the stack.
     Push the scanned operator to the stack.
6. After the expression is scanned, pop and output from the stack until it is not empty.
 */

// Time & Space Complexity -
/*
Time - O(N) where N is for linearly traversing ana array
Space - O(N) because of using stack
 */