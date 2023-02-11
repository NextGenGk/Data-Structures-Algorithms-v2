package Stack_and_Queues;

import java.util.Stack;

public class Prefix_to_Infix_Conversion {

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
                String temp = "(" + op1 + c + op2 + ")";
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
        String str = "*+AB-CD";
        System.out.println("Infix : " + convert(str));
    }
}

// Output -
/*
Input :  Prefix :  *+AB-CD
Output : Infix : ((A+B)*(C-D))

Input :  Prefix :  *-A/BC-/AKL
Output : Infix : ((A-(B/C))*((A/K)-L))
 */

// Algorithm -
/*
Algorithm for Prefix to Infix:

1. Read the Prefix expression in reverse order (from right to left)
2. If the symbol is an operand, then push it onto the Stack
3. If the symbol is an operator, then pop two operands from the Stack
Create a string by concatenating the two operands and the operator between them.
string = (operand1 + operator + operand2)
And push the resultant string back to Stack
4. Repeat the above steps until the end of Prefix expression.
5. At the end stack will have only 1 string i.e resultant string
 */

// Time & Space Complexity -
/*
Time - O(N) where N is for linearly traversing ana array
Space - O(N) because of using stack
 */