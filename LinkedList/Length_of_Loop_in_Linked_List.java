package LinkedList;

public class Length_of_Loop_in_Linked_List {

    // Definition for singly-linked list.
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    //Function should return the length of the loop in LL.
    class Solution {
        // Returns count of nodes present in loop
        static int countNodes(Node slow_p) {
            int res = 1;
            Node temp = slow_p;
            while (temp.next != slow_p) {
                res++;
                temp = temp.next;
            }
            return res;
        }

        //Function to find the length of a loop in the linked list.
        static int countNodesInLoop(Node head) {
            //Add your code here.
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                // If, slow & fast pointer meet at same point
                // then there is loop
                if (slow == fast) return countNodes(slow);
            }
            return 0;
        }
    }
}

// Output -
/*
Input:
N = 10
value[]={25,14,19,33,10,21,39,90,58,45}
C = 4
Output: 7
Explanation: The loop is 45->33. So length of loop is 33->10->21->39->
90->58->45 = 7. The number 33 is connected to the last node to form the
loop because according to the input the 4th node from the beginning(1 based index)
will be connected to the last node for the loop.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
*/