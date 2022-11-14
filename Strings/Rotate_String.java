package Strings;

public class Rotate_String {

    class Solution {
        public boolean rotateString(String s, String goal) {

            return (s.length() == goal.length() && (s + s).contains(goal));
        }
    }

// Output -
/*
Input: s = "abcde", goal = "cdeab"
Output: true
*/

/* Idea -
We can easily see whether it is rotated if B can be found in (A + A).
For example, with A = "abcde", B = "cdeab", we have

“abcdeabcde” (A + A)
  “cdeab” (B)
B is found in (A + A), so B is a rotated string of A.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
*/
}
