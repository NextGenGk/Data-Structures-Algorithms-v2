package LinkedList;

public class Flatten_a_Linked_List {

    // Node class  used in the program
    class Node {
	    int data;
	    Node next;
	    Node bottom;

	Node(int d) {
		data = d;
		next = null;
		bottom = null;
	    }
    }

    /*  Function which returns the  root of
    the flattened linked list. */
    class Solution {
        // Simple Merge two Linked List Function
        Node mergeTwoLists(Node a, Node b) {

            Node temp = new Node(0);
            Node res = temp;

            while (a != null && b != null) {
                if (a.data < b.data) {
                    temp.bottom = a;
                    temp = temp.bottom;
                    a = a.bottom;
                } else {
                    temp.bottom = b;
                    temp = temp.bottom;
                    b = b.bottom;
                }
            }

            if (a != null) temp.bottom = a;
            else temp.bottom = b;
            return res.bottom;

        }

        // Flatten to Linked list Function
        Node flatten(Node root) {
            if (root == null || root.next == null)
                return root;

            // recur for list on right
            root.next = flatten(root.next);

            // now merge
            root = mergeTwoLists(root, root.next);

            // return the root
            // it will be in turn merged with its left
            return root;
        }
    }
}

// Output -
/*
Input:
5 -> 10 -> 19 -> 28
|     |     |     |
7     20    22   35
|           |     |
8          50    40
|                 |
30               45

Output:  5-> 7-> 8- > 10 -> 19-> 20->22-> 28-> 30-> 35-> 40-> 45-> 50.
Explanation:
The resultant linked lists has every node in a single level.
(Note: | represents the bottom pointer.)
*/

// Approach -
/*
Since each list, followed by the bottom pointer, are in sorted order. Our main aim is to make a single list in sorted order of all nodes. So, we can think of a merge algorithm of merge sort.

The process to flatten the given linked list is as follows:-

1. We will recurse until the head pointer moves null. The main motive is to merge each list from the last.
2. Merge each list chosen using the merge algorithm. The steps are
3. Create a dummy node. Point two pointers, i.e, temp and res on dummy node. res is to keep track of dummy node and temp pointer is to move ahead as we build the flattened list.
4. We iterate through the two chosen. Move head from any of the chosen lists ahead whose current pointed node is smaller.
5. Return the new flattened list found.
*/

// Time & Space Complexity -
/*
Time - O(N), where N is the total number of nodes present
Reason: We are visiting all the nodes present in the given list.

Space - O(1)
Reason: We are not creating new nodes or using any other data structure.
*/