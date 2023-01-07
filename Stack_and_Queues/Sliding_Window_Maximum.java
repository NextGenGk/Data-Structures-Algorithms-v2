package Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sliding_Window_Maximum {

    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            int[] r = new int[n - k + 1];
            int ri = 0;

            // base case
            if (n == 0) {
                return nums;
            }

            Deque<Integer> dq = new ArrayDeque<>();

            // remove numbers out of range k
            for (int i = 0; i < n; i++) {
                if (!dq.isEmpty() && dq.peek() == i - k) {
                    dq.poll();
                }

                // remove smaller numbers in k range as they are useless
                while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
                    dq.pollLast();
                }

                dq.offer(i);
                if (i >= k - 1) {
                    r[ri++] = nums[dq.peek()];
                }
            }
            return r;
        }
    }
}

// Output -
/*
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
*/

// Algorithm -
/*
1. We maintain a Deque of size k.
2. We iterate through the array and for each element:
    - If the Deque is not empty and the element at the front of the Deque is smaller than the current element,
     we remove the element at the front.
    - We also remove any elements in the Deque that are outside the sliding window
     (i.e. the last element in the Deque is smaller than the current element).
    - We then add the current element to the Deque.
3. Finally, we iterate through the Deque to get the max sliding window.
*/

// Time & Space Complexity -
/*
Time - O(N), This is because every element will just two types push and pop; hence time complexity is linear.
Space - O(K), This is because at any moment, the sum of stack size of both stacks will exactly equal to K,
 As every time we pop exactly one element and push exactly One.
*/