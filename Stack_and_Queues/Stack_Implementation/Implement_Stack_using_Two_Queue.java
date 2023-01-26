package Stack_and_Queues.Stack_Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Two_Queue {

    // Main Function
    public static void main(String[] args) {
        Stack s = new Stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        System.out.println("current size: " + Stack.size());
        System.out.println(Stack.top());
        Stack.pop();
        System.out.println(Stack.top());
        Stack.pop();
        System.out.println(Stack.top());

        System.out.println("current size: " + Stack.size());
    }

    static class Stack {
        // Create two queues
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();

        // To maintain current number of elements
        static int curr_size;

        // push() Function
        static void push(int x) {
            // Push x first in empty q2
            q2.add(x);

            // Push all the remaining
            // elements in q1 to q2.
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
            // swap the names of two queues
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        // pop() Function
        static void pop() {
            // if no elements are there in q1
            if (q1.isEmpty())
                return;
            q1.remove();
        }

        // top() / peek() Function
        static int top() {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }

        // size() Function
        static int size() {
            return q1.size();
        }
    }
}

// Output -
/*
current size: 3
3
2
1
current size: 1
 */

// Algorithm -
/*
The idea is to keep newly entered element at the front of ‘q1’ so that pop operation dequeues from ‘q1’. ‘q2’
is used to put every new element in front of ‘q1’.

Follow the below steps to implement the push(s, x) operation:
1. Enqueue x to q2.
2. One by one dequeue everything from q1 and enqueue to q2.
3. Swap the queues of q1 and q2.

Follow the below steps to implement the pop(s) operation:
1. Dequeue an item from q1 and return it.
 */

/* Steps -
push() operation -
push(x)
1. Add x to q2
2. Push all the remaining elements in q1 to q2.
3. Swap q1 to q2

pop() operation -
pop()
1. Remove the top element of q1, q1.pop (Queue - FIFO)
 */

// Time & Space Complexity -
/*
Time -
Push operation - O(N), As all the elements need to be popped out from the Queue (q1) and push them back to Queue (q2).
Pop operation - O(1), As we need to remove the front element from the Queue.
Space - O(N), As we use two queues for the implementation of a Stack.
 */