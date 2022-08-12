public class Copy_List_with_Random_Pointer {

    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    // Solution Class (Main)
    class Solution {
        // Copy Random List Function
        public Node copyRandomList(Node head) {
            Node curr = head;
            Node temp = null;

            // insert additional node after
            // every node of original list
            while (curr != null) {
                temp = curr.next;

                // Inserting node
                curr.next = new Node(curr.val);
                // New line
                curr.next.next = temp;
                curr = temp;
            }
            curr = head;

            // adjust the random pointers of the
            // newly added nodes
            while (curr != null) {
                if (curr.next != null) {
                    curr.next.random = (curr.random != null) ? curr.random.next
                            : curr.random;
                }
                // move to the next newly added node by
                // skipping an original node
                curr = curr.next.next;
            }

            Node original = head;
            Node copy = head.next;
            // save the start of copied linked list
            Node newTemp = copy;

            // now separate the original list and copied list
            while (original != null) {
                original.next = original.next.next;
                copy.next = (copy.next != null) ? copy.next.next
                        : copy.next;
                original = original.next;
                copy = copy.next;
            }
            return newTemp;
        }
    }
}

// Output -
/*
Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
*/

// Algorithm -
/*
1. Create the copy of node 1 and insert it between node 1 & node 2 in the original Linked List,
   create a copy of 2 and insert it between 2 & 3. Continue in this fashion, add the copy of N after the Nth node
2. Now copy the random link in this fashion

    original->next->random= original->random->next;  /*TRAVERSE
    TWO NODES

3. This works because original->next is nothing but a copy of the original and Original->random->next is nothing
 but a copy of the random.

4. Now restore the original and copy linked lists in this fashion in a single loop.

    original->next = original->next->next;
     copy->next = copy->next->next;

5. Ensure that original->next is NULL and return the cloned list
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/