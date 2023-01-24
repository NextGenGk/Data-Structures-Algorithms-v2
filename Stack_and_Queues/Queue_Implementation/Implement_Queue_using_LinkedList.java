package Stack_and_Queues.Queue_Implementation;

public class Implement_Queue_using_LinkedList {
    LinkedList.SinglyLinkedList list;

    public Implement_Queue_using_LinkedList() {
        list = new LinkedList.SinglyLinkedList();
        System.out.println("Queue is created successfully");
    }

    public static void main(String[] args) {
        Implement_Queue_using_LinkedList queue = new Implement_Queue_using_LinkedList();
        boolean result = queue.isEmpty();
        System.out.println(result);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
    }

    // O(1)
    public boolean isEmpty() {
        return list.head == null;
    }

    // O(1)
    public void enQueue(int value) {
        list.insert(value, list.size);
        System.out.println("Successfully inserted " + value + " in the Queue");
    }
}
