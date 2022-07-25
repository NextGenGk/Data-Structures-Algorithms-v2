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
//    // Driver Code
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


