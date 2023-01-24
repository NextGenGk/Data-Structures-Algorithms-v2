package Stack_and_Queues.Stack_Implementation;

    class Stack {
        LinkedList.SinglyLinkedList linkedList;

        // Constructor
        public Stack() {
            linkedList = new LinkedList.SinglyLinkedList();
            System.out.println("Stack is created successfully");
        }

        // Main Function
        public static void main(String[] args) {
        Stack stack = new Stack();
//        stack.push(10);
//        stack.push(20);

//        int result = stack.pop();
//        System.out.println(result);

//        boolean result = stack.isEmpty();
//        System.out.println(result);

//        int result = stack.peek();
//        System.out.println(result);

//        stack.deleteStack();
    }

    // Push Method - O(1)
    public void push(int value) {
        linkedList.insert(value, 0);
        System.out.println("Successfully Inserted " + value);
    }

    // IsEmpty Method - O(1)
    public boolean isEmpty() {
        return linkedList.head == null;
    }

    // Pop Method - O(1)
    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            result = linkedList.head.value;
            linkedList.delete(0);
        }
        return result;
    }

    // Peek Method - O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    // Delete Method - O(1)
    public void deleteStack() {
        linkedList.head = null;
        System.out.println("Stack is Deleted Successfully");
    }
}
