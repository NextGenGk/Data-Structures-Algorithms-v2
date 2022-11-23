package Strings;

public class Longest_Palindromic_Substring {

    class Solution {
        public String longestPalindrome(String s) {
            // calculate / mark all palindromic substring
            int start = 0;
            int end = 0;
            for (int i = 0; i < s.length(); i++) {
                // set len1 "baab"
                int len1 = expandFromCentre(s, i, i + 1);
                // set len2 "bab"
                int len2 = expandFromCentre(s, i, i);
                // calculate max length
                int maxLen = Math.max(len1, len2);
                // if end - start is less than maxLen
                // then update the start or end index
                if (end - start < maxLen) {
                    start = i - (maxLen - 1) / 2;
                    end = i + maxLen / 2;
                }
            }
            // cutting the max length palindromic substring
            return s.substring(start, end + 1);
        }

        // Helper Function
        int expandFromCentre(String s, int i, int j) {
            while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            }
            // return boundary of maxLen
            return j - i - 1;
        }
    }
}

// Output -
/*
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
*/

// Idea -
// Intuition - Expand from centre

// Algorithm -
/*
1. We start with a simple loop that iterates through the string.
2. For each character in the string, we expand around that character.
3. We expand around the character to the left and to the right.
4. We keep expanding as long as the characters to the left and right are the same.
5. We keep track of the longest palindrome we’ve seen so far.
6. We update the start and end indices of the longest palindrome.
7. We return the substring of the original string that corresponds to the longest palindrome.
*/

// Time & Space Complexity -
/*
Time - O(N^2)
Space - O(1)
*/