public class Reverse_Linked_List {
    //  Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        // Reverse Linked List Function
        public ListNode reverseList(ListNode head) {
            // if(head == null || head.next == null) {
            //     return head;
            // }

            // Create two variable cur & prev
            // head point to cur & null to prev
            ListNode cur = head;
            ListNode prev = null;

            // looping till cur is not equal to null
            while (cur != null) {
                // Create a temporary and store cur next variable
                ListNode temp = cur.next;
                // prev point to cur next variable
                cur.next = prev;
                // update the value of cur & prev element
                // prev update to cur & cur to temp
                prev = cur;
                cur = temp;
            }
            // Finally return prev element
            return prev;
        }
    }
}
// Output -
/*
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
*/

// Algorithm -
/*
1. Create two variable cur & prev then head point to cur & null to prev
2. Looping till cur is not equal to null
3. Create a temporary and store cur next variable
4. prev point to cur next variable
5. update the value of cur & prev element then prev update to cur & cur to temp
5. Finally return prev element
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/

/*-------------Iterative---------------*/
// Java program for reversing the linked list

//class LinkedList {
//    static Node head;
//
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//
//    /* Function to reverse the linked list */
//    Node reverse(Node node) {
//        Node prev = null;
//        Node current = node;
//        Node next = null;
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        node = prev;
//        return node;
//    }
//
//    // prints content of double linked list
//    void printList(Node node) {
//        while (node != null) {
//            System.out.print(node.data + " ");
//            node = node.next;
//        }
//    }
//
//    /* Main Function */
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.head = new Node(85);
//        list.head.next = new Node(15);
//        list.head.next.next = new Node(4);
//        list.head.next.next.next = new Node(20);
//
//        System.out.println("Given Linked list");
//        list.printList(head);
//        head = list.reverse(head);
//        System.out.println("");
//        System.out.println("Reversed linked list ");
//        list.printList(head);
//    }
//}

// Output -
/*
Given linked list
85 15 4 20
Reversed Linked list
20 4 15 85
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/

/*--------------Recursive---------------*/
// Recursive Java program to reverse
// a linked list

//class recursion {
//    static Node head; // head of list
//
//    static class Node {
//        int data;
//        Node next;
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//
//    static Node reverse(Node head) {
//        if (head == null || head.next == null)
//            return head;
//
//        /* reverse the rest list and put
//        the first element at the end */
//        Node rest = reverse(head.next);
//        head.next.next = head;
//
//        /* tricky step -- see the diagram */
//        head.next = null;
//
//        /* fix the head pointer */
//        return rest;
//    }
//
//    /* Function to print linked list */
//    static void print() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    static void push(int data) {
//        Node temp = new Node(data);
//        temp.next = head;
//        head = temp;
//    }
//
//
//    /* Main Function */
//    public static void main(String[] args) {
//        /* Start with the empty list */
//
//        push(20);
//        push(4);
//        push(15);
//        push(85);
//
//        System.out.println("Given linked list");
//        print();
//
//        head = reverse(head);
//
//        System.out.println("Reversed Linked list");
//        print();
//    }
//}

// Output -
/*
Given linked list
85 15 4 20
Reversed Linked list
20 4 15 85
 */

// Algorithm -
/*
1) Divide the list in two parts - first node and rest of the linked list.
2) Call reverse for the rest of the linked list.
3) Link rest to first.
4) Fix head pointer
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n)
*/