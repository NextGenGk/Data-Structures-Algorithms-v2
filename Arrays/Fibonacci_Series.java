package Arrays;

public class Fibonacci_Series {
    // Fibonacci Function
    public int fib(int n) {
        // Initialize two variable
        int a = 0;
        int b = 1;
        // Constraint
        if (n == 0) {
            return a;
        }

        // Loop start from 2 index until less than equal to n
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

// Output -
/*
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
*/

// Algorithm -
/*
In this method by storing the previous two numbers only because that is all we need to get the next Fibonacci
number in series.
*/

// Output -
/*
Time - O(n)
Space - O(1)
*/

// Fibonacci Recursive
/*
public int fibonacciRecursive(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}
 */

// Output -
/*
Time - O(N), because of linearly traversing
Space - O(N), because of recursive call stack in memory
*/