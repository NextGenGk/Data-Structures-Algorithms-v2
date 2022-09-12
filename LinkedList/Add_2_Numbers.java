package LinkedList;

public class Add_2_Numbers {

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

    class Solution {
        // Add Two Numbers Function
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            // create a dummy node & its point to temp
            ListNode dummy = new ListNode();
            ListNode temp = dummy;
            // carry initialize with 0
            int carry = 0;

            // while, l1 is not null OR l2 is not null OR carry is equal to 1
            while (l1 != null || l2 != null || carry == 1) {
                // sum initialize with 0
                int sum = 0;

                // l1 is not null than l1 is added to the sum
                // and l1 should increase by one step
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                // l2 is not null than l2 is added to the sum
                // and l2 should increase by one step
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                // total sum = (sum + carry)
                sum += carry;
                // find carry (10 / 10 = 1)
                carry = sum / 10;
                // create a new node and added (10 % 10 = 0) to the new node
                ListNode node = new ListNode(sum % 10);
                // new node points to temp next
                temp.next = node;
                // & temp should increase by one step
                temp = temp.next;
            }
            // return dummy's next pointer
            return dummy.next;
        }
    }
}

// Output -
/*
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
*/

// Time & Space Complexity -
/*
Time - O(max(m,n)). Assume that m and n represent the length of l1 and l2 respectively, the algorithm above iterates at most max(m,n) times.

Space -  O(max(m,n)). The length of the new list is at most max(m,n)+1.
*/