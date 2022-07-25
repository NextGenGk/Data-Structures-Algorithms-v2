public class Remove_Nth_Node_From_End_of_List {
      // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    // Remove Nth Node From End of List Function
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // If, there is only one element
        // & remove this element
        if(head.next == null) {
            return null;
        }

        // Counting Size of Linked List
        int size = 0;
        ListNode cur = head;
        while(cur != null) {
            cur = cur.next;
            size++;
        }

        // Delete size th node
        if(n == size) {
            return head.next;
        }

        // Find Nth Node (to be deleted)
        int deleteNthNode = size - n;
        // Store head value in prev variable
        ListNode prev = head;
        // Find Nth Node previous element
        int i=1;
        // looping through, while i is less than delete Nth Node
        // untill then store the prev.next element on prev variable
        // & increment i by 1
        while(i < deleteNthNode) {
            prev = prev.next;
            i++;
        }
        // prev.next element point to the prev.next.next
        prev.next = prev.next.next;
        // Finally return head;
        return head;
    }
}

// Output -
/*
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
*/

// Algorithm -
/*
1. Counting Size of Linked List
2. Find Nth Node (to be deleted) (size -n)
3. Find Nth Node previous element
4. looping through, while i is less than delete Nth Node
   until then store the prev.next element on prev variable
   & increment i by 1
5. prev.next element point to the prev.next.next
*/

// Time & Space Complexity-
/*
Time - O(n)
Space - O(1)
*/