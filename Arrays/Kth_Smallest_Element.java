package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Smallest_Element {

    // Kth Smallest Function
    static int kthSmallest(int[] arr, int k) {

        // Implementation using a Priority Queue [Pass Comparator]
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; ++i) {

            // Insert elements into
            // the priority queue
            pq.add(arr[i]);

            // If size of the priority
            // queue exceeds k
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // finally, return top element
        return pq.peek();
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 3, 9, 1};
        int result = kthSmallest(arr, 3);
        System.out.println(result);
    }
}

// Idea -
/*
Find Largest Element then use (Min Heap) [In Java By Default Min Heap]
Find Smallest Element then use (Max Heap) [Use Comparator - Collections.reverseOrder()]
 */


// Output -
// 4 (smallest)

// Algorithm -
/*
1. Create a Max Heap (Priority Queue)
2. Loop through to length of the array
3. And add current element
4. Checks, If size of the priority queue exceeds k, than remove (Max Heap) topmost element
5. Finally, return (Max Heap) topmost element
 */

// Time & Space Complexity -
/*
Time - O(n*log(k))
Space - O(k)
 */