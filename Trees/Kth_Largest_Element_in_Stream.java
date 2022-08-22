package Trees;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_Stream {

    class KthLargest {
        // declare a priorityQueue
        final PriorityQueue<Integer> q;
        // declare a variable k
        final int k;

        // Kth Largest Function
        // KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of        integers nums.
        public KthLargest(int k, int[] nums) {
            // Initializes the k
            this.k = k;
            // create a priorityQueue
            q = new PriorityQueue<>();
            // add all the elements in stream 1 by 1
            for (int a : nums) {
                add(a);
            }
        }

        // int add(int val) Appends the integer val to the stream and returns the element
        public int add(int val) {
            // add the integer value to the queue
            q.offer(val);
            // if queue size exceedes k
            // the current element
            if (q.size() > k) {
                q.poll();
            }
            // finally, return the kth largest element (means - min value)
            return q.peek();
        }
    }
}

/*
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

// Output -
/*
Input
["KthLargest", "add", "add", "add", "add", "add"]
[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
Output
[null, 4, 5, 5, 8, 8]

Explanation
KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
kthLargest.add(3);   // return 4
kthLargest.add(5);   // return 5
kthLargest.add(10);  // return 5
kthLargest.add(9);   // return 8
kthLargest.add(4);   // return 8
*/

// Time & Space Complexity -
/*
Time (for Arranging) - O(n * logK)
Space - O(logk)
*/