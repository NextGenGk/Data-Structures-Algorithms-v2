package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_OverLapping_Intervals {

    class Solution {
        public int[][] merge(int[][] intervals) {
            // Base case
            if (intervals.length <= 1)
                return intervals;

            // Sort by ascending starting point
            Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

            List<int[]> result = new ArrayList<>();
            int[] newInterval = intervals[0];
            result.add(newInterval);
            for (int[] interval : intervals) {
                if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
                    newInterval[1] = Math.max(newInterval[1], interval[1]);
                else {                             // Disjoint intervals, add the new interval to the list
                    newInterval = interval;
                    result.add(newInterval);
                }
            }
            return result.toArray(new int[result.size()][]);
        }
    }
}

// Output -
/*
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
*/

// Algorithm -
/*
1. Sort the intervals by their starting point.
2. Create a new interval initialized with the first interval.
3. Iterate over the rest of the intervals and merge them one by one with the current interval if they overlap.
4. If they don’t overlap, add the current interval to the result and update the current interval with the next interval.
5. Add the current interval to the result if it is not added in the loop.
*/

// Time & Space Complexity -
/*
Time - O(N(logN)), log*N for sorting & N for linear traverse an array
Space - O(N), because of using extra space
*/