package Stack_and_Queues;

// Implement Stack Using Array
public class Implement_Stack_using_Array {
    // Initialize array
    int[] arr;
    // Initialize topOfStack
    int topOfStack;

    // Create Constructor (For initializing size)
    public Implement_Stack_using_Array(int size) {
        this.arr = new int[size];
        topOfStack = -1;
        System.out.println("Stack is created with the size of " + size);
    }

    // isEmpty() Function
    public boolean isEmpty() {
        // System.out.println("Stack is Empty");
        // System.out.println("Stack is not Empty");
        return topOfStack == -1;
    }

    // Push() Function
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full");
        }
        else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Value " + value + " Inserted Successfully");
        }
    }

    // Pop() Function
    public void pop() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty");
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            System.out.println("Removed " + topStack + " Successfully");
        }
    }

    // Peek() Function
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Top Stack value is " + arr[topOfStack]);
        }
    }

    // isFull() Function
    public boolean isFull() {
        // System.out.println("Stack is Full");
        // System.out.println("Stack is not Full");
        return topOfStack == arr.length - 1;
    }

    // Delete Stack Function
    public void deleteStack() {
        arr = null;
        System.out.println("Stack is Deleted Successfully");
    }

    // Main Function
    public static void main(String[] args) {
        Implement_Stack_using_Array stack = new Implement_Stack_using_Array(4);
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
