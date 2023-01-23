package Stack_and_Queues.Queue_Implementation;

public class Implement_Queue_using_Array {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    // Create Constructor (For initializing size)
    public Implement_Queue_using_Array(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Thw Queue is created with the size of " + size);
    }

    // Main Function
    public static void main(String[] args) {
        Implement_Queue_using_Array queue = new Implement_Queue_using_Array(3);

        // IsEmpty() Function
//        boolean result = queue.isEmpty();
//        System.out.println(result);

        // IsEmpty() Function
//        boolean result1 = queue.isFull();
//        System.out.println(result1);

        // enQueue() Function
//        queue.enQueue(10);
//        queue.enQueue(20);
//        queue.enQueue(30);
//        queue.enQueue(40);

        // deQueue() Function
//        int result = queue.deQueue();
//        System.out.println(result);
//
//        int result2 = queue.deQueue();
//        System.out.println(result2);

        // peek() Function
//        int result = queue.peek();
//        System.out.println(result);

        // deleteQueue() Function
//        queue.deleteQueue();
    }

    // isEmpty() Function
    public boolean isEmpty() {
        // beginning of Queue 1, 2, 3
        return beginningOfQueue == -1 || beginningOfQueue == arr.length;
    }

    // isFull() Function
    public boolean isFull() {
        return topOfQueue == arr.length - 1;
    }

    // enQueue() Function
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0; // index 0
            topOfQueue++;         // index 0
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " is the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " is the queue");
        }
    }

    // deQueue() Function
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = -1;
                topOfQueue = -1;
            }
            return result;
        }
    }

    // peek() Function
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    // deleteQueue() Function
    public void deleteQueue() {
        arr = null;
        System.out.println("The Queue is Deleted Successfully");
    }
}
