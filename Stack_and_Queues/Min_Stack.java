package Stack_and_Queues;

import java.util.Stack;

public class Min_Stack {

    class MinStack {
        Stack<Long> stk = new Stack<Long>();
        Long mini;

        public MinStack() {
            mini = Long.MAX_VALUE;
        }

        public void push(int val) {
            Long value = (long) val;
            if (stk.isEmpty()) {
                mini = value;
                stk.push(value);
            } else {
                if (value < mini) {
                    stk.push(2 * value - mini);
                    mini = value;
                } else {
                    stk.push(value);
                }
            }
        }

        public void pop() {
            if (stk.isEmpty()) {
                return;
            } else {
                // rollback to previous minimum
                Long value = stk.pop();
                if (value < mini) {
                    mini = (2 * mini - value);
                }
            }
        }

        public int top() {
            Long value = stk.peek();
            if (value < mini) {
                return mini.intValue();
            }
            return value.intValue();
        }

        public int getMin() {
            return mini.intValue();
        }
    }

// Output -
/*
Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
*/

// Algorithm -
/*
Solution 2:

Approach:

Let’s take a variable that stores the minimum number. So whenever a push operation comes in just take that number put it in the stack and update the variable to the number.

Push operation:

Now if there is a push operation just check whether that number is less than the min number. If it is smaller than min we will push a modified value which is a push(2 * Val – min) into the stack and will update min to the value of the original number. If it’s not then we will just push it as it is.

getMin() operation:

We will just return the value of min.

Top operation:

While returning the top value we know that it is a modified value. We will check if the top value is lesser than min, If it is then we will return the min as the top value.

Pop operation:

While making pop we will check if the top value is lesser than min, If it is then we must update our min to its previous value. In order to do that min = (2 * min) – (modified value) and we will pop the element.
*/

// Time & Space Complexity -
/*
Time - O(1)
Space - O(N)
*/

// Brute Force

    class MinStack1 {
        Stack<Pair> stk;

        public MinStack1() {
            stk = new Stack<Pair>();
        }

        public void push(int val) {
            int min;
            if (stk.isEmpty()) {
                min = val;
            } else {
                min = Math.min(stk.peek().y, val);
            }
            stk.push(new Pair(val, min));
        }

        public void pop() {
            stk.pop();
        }

        public int top() {
            return stk.peek().val;
        }

        public int getMin() {
            return stk.peek().y;
        }
    }

    class Pair {
        int val;
        int y;

        public Pair(int val, int y) {
            this.val = val;
            this.y = y;
        }
    }

// Algorithm -
/*
Solution 1: Using pairs to store the value and minimum element till now.

Approach:

The first element in the pair will store the value and the second element will store the minimum element till now.

When the first push operation comes in we will push the value and store it as minimum itself in the pair.

In the second push operation, we will check if the top element’s minimum is less than the new value. If it is then we will push the value with minimum as the previous top’s minimum. To get the getMin element to take the top’s second element.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(2*N)
*/

    /*
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}