package Stack_and_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Single_Queue {
    Queue<Integer> q1 = new LinkedList<Integer>();

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

    void push(int x) {
        int size = q1.size();

        q1.add(x);

        for (int i = 0; i < size; i++) {
            q1.add(q1.remove());
        }
    }

    void pop() {
        if (q1.isEmpty()) {
            return;
        }
        q1.remove();
    }

    int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }

    int size() {
        return q1.size();
    }
}
