package LinkedList;

public class Sort_List {
    // Definition for singly-linked list.
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        // Find Middle of the Linked List Function
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) return head;

            ListNode temp = null;
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                temp = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            temp.next = null;

            ListNode l1 = sortList(head);
            ListNode l2 = sortList(slow);

            return mergeList(l1, l2);
        }

        // Merge 2 Linked list Function
        public ListNode mergeList(ListNode list1, ListNode list2) {
            ListNode fH = null;
            ListNode fT = null;

            while (list1 != null && list2 != null) {
                if (fH == null && fT == null) {
                    if (list1.val < list2.val) {
                        fH = list1;
                        fT = list1;
                        list1 = list1.next;
                    } else {
                        fH = list2;
                        fT = list2;
                        list2 = list2.next;
                    }
                } else {
                    if (list1.val < list2.val) {
                        fT.next = list1;
                        fT = fT.next;
                        list1 = list1.next;
                    } else {
                        fT.next = list2;
                        fT = fT.next;
                        list2 = list2.next;
                    }
                }

                if (list1 != null) {
                    fT.next = list1;
                }

                if (list2 != null) {
                    fT.next = list2;
                }
            }
            return fH;
        }
    }
}

// Output -
/*
Input: head = [4,2,1,3]
Output: [1,2,3,4]
*/

// Logic -
/*
1. Find middle of the linked list
2. Sort 1st & 2nd half of middle linked list
3. Merge the two sorted linked list in one Linked list
*/

// Time & Space Complexity -
/*
Time - O(NlogN)
Space - O(1)
*/