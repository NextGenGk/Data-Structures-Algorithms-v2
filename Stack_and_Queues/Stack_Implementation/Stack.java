package Stack_and_Queues.Stack_Implementation;

public class Stack {
    LinkedList.SinglyLinkedList linkedList;

    // Constructor
    public Stack() {
        linkedList = new LinkedList.SinglyLinkedList();
    }

    // Main Function
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
    }

    // Push Method - O(1)
    public void push(int value) {
        linkedList.insert(value, 0);
        System.out.println("Successfully Inserted " + value);
    }
}
