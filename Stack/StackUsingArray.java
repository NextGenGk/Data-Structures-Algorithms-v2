package Stack;

// Stack Using Array
public class StackUsingArray {
    // Initialize array
    int[] arr;
    // Initialize topOfStack
    int topOfStack;

    // Create Constructor (For initializing size)
    public StackUsingArray(int size) {
        this.arr = new int[size];
        topOfStack = -1;
        System.out.println("Stack is created with the size of " + size);
    }

    // isEmpty() Function
    public boolean isEmpty() {
        if (topOfStack == -1) {
         // System.out.println("Stack is Empty");
            return true;
        }
        else {
         // System.out.println("Stack is not Empty");
            return false;
        }
    }

    // isFull() Function
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
         // System.out.println("Stack is Full");
            return true;
        }
        else {
         // System.out.println("Stack is not Full");
            return false;
        }
    }

    // Push() Function
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full");
        }
        else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Value " + value + " inserted successfully");
        }
    }

    // Pop() Function
    public void pop() {
        if (isEmpty()) {
            System.out.println("The stack is Empty");
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            System.out.println("Removed " + topStack + " successfully");
        }
    }

    // Peek() Function
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Top stack value is " + arr[topOfStack]);
        }
    }

    // Delete Stack Function
    public void deleteStack() {
        arr = null;
        System.out.println("Stack is deleted successfully");
    }

    // Main Function
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(4);
        stack.isEmpty();
        stack.isFull();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.peek();
        stack.deleteStack();
    }
}
