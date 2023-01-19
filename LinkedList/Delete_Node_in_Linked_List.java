package LinkedList;

public class Delete_Node_in_Linked_List {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // Solution Class (Main)
    class Solution {
        // Delete Node Function
        public void deleteNode(ListNode node) {
            // Copy next node value to current node
            // & finally delete the next node
            ListNode temp = node.next;
            node.val = node.next.val;
            node.next = node.next.next;
            temp.next = null;

            // Store the node next value in temp
            // ListNode temp = node.next;
            // node next value is store in current node value
            // node.val = node.next.val;
            // last node next value is store in node next value
            // node.next = node.next.next;
            // null is store in temp next variable
            // temp.next = null;
        }
    }
}

// Output -
/*
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after
calling your function.
*/

// Algorithm -
/*
1. Copy next node value in current node
2. & delete the next node
*/

// Time & Space Complexity -
/*
Time - O(1), because, we copy next node value in current node & delete the next node
Space - O(1), no extra space is needed
*/