public class Palindrome_Linked_List {

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
        // Find Middle Index Function
        public ListNode findMiddle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        // Reverse Linked List Function
        public ListNode reverse(ListNode head) {
            ListNode cur = head;
            ListNode prev = null;

            while (cur != null) {
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
            return prev;
        }

        // Is Palindrome Function
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }

            ListNode middle = findMiddle(head);
            ListNode secondHalfStart = reverse(middle.next);

            ListNode firstHalfStart = head;
            while (secondHalfStart != null) {
                if (firstHalfStart.val != secondHalfStart.val) {
                    return false;
                }
                firstHalfStart = firstHalfStart.next;
                secondHalfStart = secondHalfStart.next;
            }
            return true;
        }
    }
}

// Output -
/*
Input: head = [1,2,2,1]
Output: true
*/

// Algorithm -
/*
1. Find Middle Index
2. Reverse the Mid + 1 to the last element of the linked list
3. Check, is Palindrome or not
*/

// Time & Space Complexity -
/*
Time- O(n)
Space - O(1)
*/