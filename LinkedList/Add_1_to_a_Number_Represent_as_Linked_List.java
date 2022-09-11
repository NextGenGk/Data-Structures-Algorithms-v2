package LinkedList;

public class Add_1_to_a_Number_Represent_as_Linked_List {

    // Definition for singly-linked list.
    static class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
        }
    }

    class Solution {
        // Reverse Linked List Function
        public static Node reverse(Node head) {
            Node cur = head;
            Node prev = null;

            while (cur != null) {
                Node temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
            return prev;
        }

        // Add One Function
        public static Node addOne(Node head) {
            //code here.
            Node newHead = reverse(head);

            Node cur = newHead;
            Node prev = null;
            Node newCur = newHead;
            int carry = 0;

            while (cur != null) {
                int sum = 0;

                // if, prev is null means we find the first node
                // than added this node's data and 1 into sum
                // else, added to node's data and carry into sum
                if (prev == null) {
                    sum = cur.data + 1;
                } else {
                    sum = cur.data + carry;
                }

                carry = sum / 10;
                cur.data = sum % 10;
                // move prev & cur pointer
                prev = cur;
                cur = cur.next;
            }

            // if carry is equal to one means
            // we create a node and attach to the prev next
            if (carry == 1) {
                Node node = new Node(1);
                prev.next = node;
            }

            // finally, reverse the new current head
            return reverse(newCur);
        }
    }
}

// Output -
/*
Input:
LinkedList: 4->5->6
Output: 457
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
*/