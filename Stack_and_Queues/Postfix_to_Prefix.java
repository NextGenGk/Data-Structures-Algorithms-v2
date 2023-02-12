package Stack_and_Queues;

import java.util.Stack;

public class Postfix_to_Prefix {

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
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();

                // Concat the operands and operator
                String temp = (c + op2 + op1);
                stack.push(temp);
            } else {
                // To make character to string
                stack.push(c + "");
            }
        }
        return stack.pop();
    }

    // Main Function
    public static void main(String[] args) {
        String str = "AB+CD-*";
        System.out.println("Prefix : " + convert(str));
    }
}

// Output -
/*
Input :  Postfix : AB+CD-*
Output : Prefix :  *+AB-CD
Explanation : Postfix to Infix : (A+B) * (C-D)
              Infix to Prefix :  *+AB-CD

Input :  Postfix : ABC/-AK/L-*
Output : Prefix :  *-A/BC-/AKL
Explanation : Postfix to Infix : ((A-(B/C))*((A/K)-L))
              Infix to Prefix :  *-A/BC-/AKL
 */

// Algorithm -
/*
Algorithm for Postfix to Prefix:

Read the Postfix expression from left to right
1. If the symbol is an operand, then push it onto the Stack
2. If the symbol is an operator, then pop two operands from the Stack
3. Create a string by concatenating the two operands and the operator before them.
    string = operator + operand2 + operand1
    And push the resultant string back to Stack
4. Repeat the above steps until end of Postfix expression.
 */

// Time & Space Complexity -
/*
Time - O(N) where N is for linearly traversing ana array
Space - O(N) because of using stack
 */