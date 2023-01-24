package Stack_and_Queues.Queue_Implementation;

public class LinkedList {

    // Main Function
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10, 0);
        list.insert(20, 1);
        list.insert(30, 2);
        list.insert(40, 3);
        list.traverse();
        list.search(30);
        list.delete(0);
        list.traverse();
    }

    // Node Class
    static class Node {
        int value;
        Node next;
    }

    // Create class SinglyLinkedList
    static class SinglyLinkedList {
        Node head;
        Node tail;
        int size;

        // Creation
        public Node create(int nodeValue) {
            head = new Node();
            Node node = new Node();
            node.value = nodeValue;
            node.next = head;
            head = node;
            tail = node;
            size = 1;
            return head;
        }

        // Insertion
        public void insert(int nodeValue, int location) {
            Node node = new Node();
            node.value = nodeValue;
            if (head == null) {
                create(nodeValue);
                return;
            } else if (location == 0) {
                node.next = head;
                head = node;
            } else if (location >= size) {
                node.next = null;
                tail.next = node;
                tail = node;
            } else {
                Node tempNode = head;
                int index = 0;
                while (index < location - 1) {
                    tempNode = tempNode.next;
                    index++;
                }
//                Node nextNode = tempNode.next;
//                tempNode.next = node;
//                node.next = nextNode;
                node.next = tempNode.next;
                tempNode.next = node;
            }
            size++;
        }

        // Traversal
        public void traverse() {
            if (head == null) {
                System.out.println("Linked List doesn't exist");
            } else {
                Node tempNode = head;
                for (int i = 0; i < size; i++) {
                    System.out.print(tempNode.value);
                    if (i != size - 1) {
                        System.out.print(" -> ");
                    }
                    tempNode = tempNode.next;
                }
                System.out.println("\n");
            }
        }

        // Searching
        public boolean search(int nodeValue) {
            if (head != null) {
                Node tempNode = head;
                for (int i = 0; i < size; i++) {
                    if (tempNode.value == nodeValue) {
                        System.out.print("Node Found ! at location: " + i + "\n");
                        return true;
                    }
                    tempNode = tempNode.next;
                }
            }
            System.out.println("Node Not Found! ");
            return false;
        }

        // Deletion
        public void delete(int location) {
            if (head == null) {
                System.out.println("Linked List doesn't exist");
                return;
            } else if (location == 0) {
                head = head.next;
                size--;
                if (size == 0) {
                    tail = null;
                }
            } else if (location >= size) {
                Node tempNode = head;
                for (int i = 0; i < size - 1; i++) {
                    tempNode = tempNode.next;
                }
                // Linked list have only one element
                if (tempNode == head) {
                    head = tail = null;
                    size--;
                    return;
                }
                // Linked list have one or more element
                tempNode.next = null;
                tail = tempNode;
                size--;
            } else {
                Node tempNode = head;
                for (int i = 0; i < location - 1; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                size--;
            }
        }

        // Delete entire linked list
        public void deleteEntire() {
            head = null;
            tail = null;
            System.out.println("deleted successfully");
        }
    }
}

// Create a node in Linked List -
// Time - O(1), Space - O(1)