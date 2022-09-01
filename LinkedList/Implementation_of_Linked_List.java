package LinkedList;

public class Implementation_of_Linked_List {
    // Node Class
    static class Node {
        int value;
        Node next;
    }

    static class SinglyLinkedList {
        Node head;
        Node tail;
        int size;

        // Creation Method
        public Node createLinkedList(int nodeValue) {
            head = new Node();
            Node node = new Node();
            node.value = nodeValue;
            node.next = head;
            head = node;
            tail = node;
            size = 1;
            return head;
        }
    }

    // Main Function
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.createLinkedList(10);
        System.out.println(list.head.value);
    }
}

// Create a node in Linked List -
// Time - O(1), Space - O(1)