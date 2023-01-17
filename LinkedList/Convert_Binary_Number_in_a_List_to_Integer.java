package LinkedList;

public class Convert_Binary_Number_in_a_List_to_Integer {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    // Solution Class (Main)
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
            // Finally, return prev element
            return prev;
        }

        // eGet Decimal Value Function
        public int getDecimalValue(ListNode head) {
            ListNode newTemp = reverseList(head);
            // Total Answer (total)
            int total = 0;
            // Power
            int i = 0;
            // Value of the node
            int x;

            while (newTemp != null) {
                x = newTemp.val;
                total += Math.pow(2, i) * x;
                i++;
                newTemp = newTemp.next;
            }
            return total;
        }
    }
}

// Output -
/*
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1), no extra space is needed
*/