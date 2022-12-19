package Stack_and_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Single_Queue {
    // Create a queue
    Queue<Integer> q1 = new LinkedList<Integer>();

    // Main Function
    public static void main(String[] args) {
        Implement_Stack_using_Single_Queue stack = new Implement_Stack_using_Single_Queue();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("current size: " + stack.size());
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());

        stack.push(40);
        System.out.println(stack.top());

        stack.pop();
        System.out.println(stack.top());
        System.out.println("current size: " + stack.size());
    }

    // push() Function
    void push(int x) {
        //  Get previous size of queue
        int size = q1.size();

        // Push the current element
        q1.add(x);

        // Pop all the previous elements and put them after
        // current element
        for (int i = 0; i < size - 1; i++) {
            q1.add(q1.remove());
        }
    }

    // pop() Function
    void pop() {
        // if no elements are there in q1
        if (q1.isEmpty()) {
            return;
        }
        q1.remove();
    }

    // top() Function
    int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }

    // size() Function
    int size() {
        return q1.size();
    }
}

// Algorithm -
/*
1. The idea behind this approach is to make one queue and push the first element in it.
2. After the first element, we push the next element and then push the first element again and finally pop the
first element.
3. So, according to the FIFO rule of the queue, the second element that was inserted will be at the front and then
 the first element as it was pushed again later and its first copy was popped out.
4. So, this acts as a Stack and we do this at every step i.e. from the initial element to the second last element,
and the last element will be the one that we are inserting and since we will be pushing the initial elements after
pushing the last element, our last element becomes the first element.
 */

// Time & Space Complexity -
/*
Time Complexity:
Push operation: O(N)
Pop operation: O(1)
Space: O(N) since 1 queue is used.
 */