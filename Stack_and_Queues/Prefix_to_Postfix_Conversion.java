package Stack_and_Queues;

import java.util.Stack;

public class Prefix_to_Postfix_Conversion {

    // Function to check if character
    // is operator or not
    static boolean isOperator(char ch) {
        switch (ch) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }

    // Convert prefix to Infix expression
    public static String convert(String str) {
        // Create a stack
        Stack<String> stack = new Stack<String>();

        // Reading from right to left
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);

            if (isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();

                // Concat the operands and operator
                String temp = (op1 + op2 + c);  // "(" + op1 + c + op2 + ")"; to (op1 + op2 + c)
                stack.push(temp);
            } else {
                // To make character to string
                stack.push(c + "");
            }
        }
        return stack.peek(); // change pop() to peek()
    }

    // Main Function
    public static void main(String[] args) {
        String str = "*+AB-CD";
        System.out.println("Postfix : " + convert(str));
    }
}

// Output -
/*
Input :  Prefix :  *+AB-CD
Output : Postfix : AB+CD-*
Explanation : Prefix to Infix :  (A+B) * (C-D)
              Infix to Postfix :  AB+CD-*

Input :  Prefix :  *-A/BC-/AKL
Output : Postfix : ABC/-AK/L-*
Explanation : Prefix to Infix :  (A-(B/C))*((A/K)-L)
              Infix to Postfix : ABC/-AK/L-*
 */

// Algorithm -
/*
1. Read the Prefix expression in reverse order (from right to left)
2. If the symbol is an operand, then push it onto the Stack
3. If the symbol is an operator, then pop two operands from the Stack
Create a string by concatenating the two operands and the operator after them.
string = operand1 + operand2 + operator
And push the resultant string back to Stack
4. Repeat the above steps until end of Prefix expression.
 */

// Time & Space Complexity -
/*
Time - O(N) where N is for linearly traversing ana array
Space - O(N) because of using stack
 */