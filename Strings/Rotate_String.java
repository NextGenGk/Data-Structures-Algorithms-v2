package Strings;

public class Rotate_String {

    class Solution {
        public boolean rotateString(String s, String goal) {
            return (s.length() == goal.length() && (s + s).contains(goal));
        }
    }
}

// Output -
/*
Input: s = "abcde", goal = "cdeab"
Output: true
*/

/* Idea -
We can easily see whether it is rotated if goal can be found in (s + s).
For example, with s = "abcde", goal = "cdeab", we have

“abcdeabcde” (s + s)
  “cdeab” (goal)
goal is found in (s + s), so goal is a rotated string of A.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
*/