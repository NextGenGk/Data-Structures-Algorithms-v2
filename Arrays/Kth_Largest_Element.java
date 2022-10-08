package Arrays;

import java.util.PriorityQueue;

public class Kth_Largest_Element {
    // Function to find k largest array element
    public int findKthLargest(int[] nums, int k) {
        // Implementation using a Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Looping through all elements
        for(int i=0; i<nums.length; i++) {
            // & Insert elements into
            // the priority queue
            pq.add(nums[i]);

            // Check, If size of the priority
            // queue exceeds k, then remove this element
            if(pq.size() > k) {
                pq.poll();
            }
        }
        // Finally, return this remove element
        return pq.poll();
    }
}

// Idea -
/*
Find Largest Element then use (Min Heap) [In Java By Default Min Heap]
Find Smallest Element then use (Max Heap) [Use Comparator - Collections.reverseOrder()]
 */

// Output -
/*
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
*/

// Algorithm -
/*
1. Create a Max Heap (Priority Queue)
2. Loop through to length of the array
3. And add current element
4. Checks, If size of the priority queue exceeds k, than remove (Min Heap) topmost element
5. Finally, return (Min Heap) topmost element
 */

// Time & Space Complexity -
/*
Time - O(n*log(k))
Space - O(k)
 */