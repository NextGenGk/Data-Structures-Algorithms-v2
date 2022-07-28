public class Intersection_of_Two_Linked_List {

    // Definition for singly-linked list.
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
      val = x;
      next = null;
        }
    }

// Solution Class (Main)
    public class Solution {
        // Get Intersection Node Function
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            // Create two variable x & y
            // & store the value of headA & headB
            ListNode x = headA;
            ListNode y = headB;

            // Looping while true &
            while (true) {

                // check, if x is equal to y
                // means, we find the intersection point
                // & return any of them
                if (x == y) {
                    return x;
                }

                // Check, if x is null
                // headB assign to x
                if (x == null) {
                    x = headB;
                }
                // Else, increment the x by 1
                else {
                    x = x.next;
                }

                // Check, if y is null
                // headB assign to y
                if (y == null) {
                    y = headA;
                }
                // Else, increment the y by 1
                else {
                    y = y.next;
                }
            }
        }
    }
}

// Output -
/*
Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before
the intersected node in A; There are 3 nodes before the intersected node in B.
*/

// Algorithm -
/*
1. Create two variable x & y, & store the value of headA & headB
2. Check,
      1. If x is equal to y means, we find the intersection point
           & return any of them
      2. Check, if x is null headB assign to x
      2. Else, increment the x by 1
3. Check,
      1. Check, if y is null headB assign to y
      2. Else, increment the y by 1
*/

// Time & Space Complexity -
/*
Time - O(m + n)
Space - O(1)
*/