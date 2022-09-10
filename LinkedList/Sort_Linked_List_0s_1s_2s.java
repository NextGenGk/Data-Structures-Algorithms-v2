package LinkedList;

public class Sort_Linked_List_0s_1s_2s {

    // Node class
    class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    class Solution {
        //Function to sort a linked list of 0s, 1s and 2s.
        Node segregate(Node head) {
            // add your code here
            if (head == null || head.next == null) return head;

            Node zeroD = new Node(0);
            Node oneD = new Node(0);
            Node twoD = new Node(0);

            Node zero = zeroD, one = oneD, two = twoD;

            Node cur = head;
            while (cur != null) {
                if (cur.data == 0) {
                    zero.next = cur;
                    cur = cur.next;
                    zero = zero.next;
                } else if (cur.data == 1) {
                    one.next = cur;
                    cur = cur.next;
                    one = one.next;
                } else {
                    two.next = cur;
                    cur = cur.next;
                    two = two.next;
                }
            }

            zero.next = (oneD.next != null) ? oneD.next : twoD.next;
            one.next = twoD.next;
            two.next = null;
            head = zeroD.next;

            return head;
        }
    }
}

// Output -
/*
Input:
N = 8
value[] = {1,2,2,1,2,0,2,2}
Output: 0 1 1 2 2 2 2 2
Explanation: All the 0s are segregated to the left end of the linked list,
2s to the right end of the list, an 1s in between.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(N)
*/