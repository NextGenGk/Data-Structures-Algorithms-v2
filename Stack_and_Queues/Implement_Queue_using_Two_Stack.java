package Stack_and_Queues;

import java.util.Stack;

public class Implement_Queue_using_Two_Stack {

    // Queue Class
    class MyQueue {
        Stack<Integer> input;
        Stack<Integer> output;

        // Constructor
        public MyQueue() {
            input = new Stack<>();
            output = new Stack<>();
        }

        // push() Function
        public void push(int x) {
            input.push(x);
        }

        // pop() Function
        public int pop() {
            in2out();
            return output.pop();
        }

        // top/peek Function
        public int peek() {
            in2out();
            return output.peek();
        }

        // isEmpty() Function
        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }

        // Helper Function
        private void in2out() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
        }
    }
}

// Output -
/*
Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false
 */

// Algorithm -
/*
enQueue(q, x):
1. While stack1 is not empty, push everything from stack1 to stack2.
2. Push x to stack1 (assuming size of stacks is unlimited).
3. Push everything back to stack1.

Here time complexity will be O(n)

deQueue(q):
1. If stack1 is empty then error
2. Pop an item from stack1 and return it

Here time complexity will be O(1)
 */

// Steps -
/*
push() operation -
push(x)
1. Add x to input stack

pop() operation -
if (output stack is not empty) {
    output.pop();
    }
else {
    add elements to input stack to output stack
    output.pop()
    }

top() operation() -
if (output stack is not empty) {
    output.top();
    }
else {
    add elements to input stack to output stack
    output.top()
    }
 */

// Time & Space Complexity -
/*
Time -
Push Operation - O(1)
Pop Operation (Top Operation) - O(N) in general and O(1) amortized time complexity.

Space -
O(N). where N is the size of the elements. We have N elements in queue,
so the space complexity is O(N).
 */

/* ------------ Brute Force -------------- */

// Not an Efficient Approach
// Steps -
/*
push() operation
push(x)
1. s1 -> s2
2. x in s1
2. s2 -> s1

pop() operation
pop()
1. Removing the top element of s1, s1.pop()
 */

// Time & Space Complexity -
/*
Time -
Push Operation - O(N)
Pop Operation - O(1)
Space - O(N)
*/