package LinkedList;

public class Merge_Two_Linked_List {

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
        // Merge Two Linked List Function
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // Create two variable finalHead fH
            // & finalTail fT
            ListNode fH = null;
            ListNode fT = null;

            // If, list1 is null, return list2
            if (list1 == null) {
                return list2;
            }

            // If, list2 is null, return list1
            if (list2 == null) {
                return list1;
            }

            // Check, while list1 is not null &&
            // list2 is not null, which means value is present in both list
            while (list1 != null && list2 != null) {
                // & check if, fH & fT is equal to null, is true!
                if (fH == null && fT == null) {
                    // then start comparing list1 value & list2 val
                    // which element is small then add this smaller element on
                    // fH & fT & increment the small element by one
                    if (list1.val > list2.val) {
                        fH = list2;
                        fT = list2;
                        list2 = list2.next;
                    }
                    // which element list1 element is small then add this smaller element on
                    // fH & fT & increment the small element by one
                    else {
                        fH = list1;
                        fT = list1;
                        list1 = list1.next;
                    }
                }
                // Else,
                else {
                    // then start comparing list1 value & list2 val
                    // which element is small then add this smaller element
                    // list1 on fT & increment the fT element by one
                    if (list1.val < list2.val) {
                        fT.next = list1;
                        fT = fT.next;
                        list1 = list1.next;
                    }
                    // which element is list2 element is small then add this smaller element
                    // list2 on fT & increment the fT element by one
                    else {
                        fT.next = list2;
                        fT = fT.next;
                        list2 = list2.next;
                    }
                }
            }

            // If, list1 element is remaining
            // add this list1 element in fT next
            if (list1 != null) {
                fT.next = list1;
            }

            // If, list2 element is remaining
            // add this list2 element in fT next
            if (list2 != null) {
                fT.next = list2;
            }

            // Finally, Return the head of the merged linked list.
            return fH;
        }
    }
}

// Output -
/*
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
*/

// Algorithm -
/*
1. Create two variable finalHead fH & finalTail fT
2. Check, while list1 is not null && list2 is not null,
   which means value is present in both list & check if, fH & fT is equal to null, is true!
   1. then start comparing list1 value & list2 val
      which element is small then add this smaller element on
      fH & fT & increment the small element by one
   2. which element list1 element is small then add this smaller element on
      fH & fT & increment the small element by one
3. Else,
   1. then start comparing list1 value & list2 val
      which element is small then add this smaller element
      list1 on fT & increment the fT element by one
   2. which element is list2 element is small then add this smaller element
      list2 on fT & increment the fT element by one
4. If, list1 element is remaining add this list1 element in fT next
5. If, list2 element is remaining add this list2 element in fT next
6. Finally, Return the head of the merged linked list.
*/

// Time & Space Complexity -
/*
Time - O(1)
Space - O(1)
*/