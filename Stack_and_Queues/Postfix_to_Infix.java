package Stack_and_Queues;

import java.util.Stack;

public class Postfix_to_Infix {

    // Function to check if character
    // is operand or not
    static boolean isOperand(char c) {
        return (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z');
    }

    // Convert Postfix to Infix expression
    public static String convert(String exp) {
        // create a stack
        Stack<String> stack = new Stack<>();

        // Reading from left to right
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // if character is operand
            // then push it into the stack
            if (isOperand(c)) {
                stack.push(c + "");
            }
            // else, popped out 2 elements
            // and concat the operands and operator
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String temp = "(" + op2 + c + op1 + ")";
                stack.push(temp);
            }
        }
        return stack.peek();
    }

    // Main Function
    public static void main(String[] args) {
        String exp = "abc++";
        System.out.println("Infix : " + convert(exp));
    }
}

// Output -
/*
Input : abc++
Output : (a + (b + c))

Input  : ab*c+
Output : ((a*b)+c)
 */

// Algorithm -
/*
1. We are reading the expression from left to right.
2. If the character is an operand, we push it into the stack.
3. If the character is an operator, we pop out two elements from the stack, concatenate them with the
operator and push the result back into the stack.
4. At the end, the stack will contain only one element which is the infix expression.
 */

// Time & Space Complexity -
/*
Time - O(N) where N is the size of the postfix expression
Space - O(N) because of using stack
 */