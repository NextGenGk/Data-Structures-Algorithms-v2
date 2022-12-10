package Strings;

public class Palindromic_Substrings {

    class Solution {
        int count = 0;

        // Count Substring Function
        public int countSubstrings(String s) {
            if (s == null || s.length() == 0) return 0;

            for (int i = 0; i < s.length(); i++) { // i is the mid point
                // aaa
                extendPalindrome(s, i, i); // odd length;
                // aaaa
                extendPalindrome(s, i, i + 1); // even length
            }
            return count;
        }

        // Helper Function
        private void extendPalindrome(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
    }
}

// Output -
/*
Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
*/

// Idea -
// Idea is start from each index and try to extend palindrome for both odd and even length.

// Algorithm -
/*
1. We start with a count variable set to 0.
2. We loop through the string s.
3. For each character in s, we check if it forms a palindrome with its neighbor.
4. If it does, we increment count and expand the palindrome on that character.
5. We do this twice: once for the character itself, and once for the character and its next neighbor.
*/

// Time & Space Complexity -
/*
Time - O(N^2), where N is linearly traversing and other N is n numbers of palindrome
Space - O(1), no extra space is needed
*/