package Stack_and_Queues.Queue_Implementation;

public class Implement_Queue_using_LinkedList {
    LinkedList.SinglyLinkedList list;

    // Create Queue
    public Implement_Queue_using_LinkedList() {
        list = new LinkedList.SinglyLinkedList();
        System.out.println("Queue is created successfully");
    }

    // Main Function
    public static void main(String[] args) {
        Implement_Queue_using_LinkedList queue = new Implement_Queue_using_LinkedList();
//        boolean result = queue.isEmpty();
//        System.out.println(result);

//        queue.enQueue(10);
//        queue.enQueue(20);
//        queue.enQueue(30);

//        queue.deQueue();
//        queue.deQueue();
//        queue.deQueue();

//        int res = queue.peek();
//        System.out.println(res);

//        queue.deleteQueue();
    }

    // isEmpty Method - O(1)
    public boolean isEmpty() {
        return list.head == null;
    }

    // EnQueue Method - O(1)
    public void enQueue(int value) {
        list.insert(value, list.size);
        System.out.println("Successfully inserted " + value + " in the Queue");
    }

    // DeQueue Method - O(1)
    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
        } else {
            value = list.head.value;
            list.delete(0);
        }
        return value;
    }

    // Peek Method - O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            return list.head.value;
        }
    }

    // Delete Method - O(1)
    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("Queue is deleted successfully");
    }
}
