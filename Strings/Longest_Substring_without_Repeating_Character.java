package Strings;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_without_Repeating_Character {

    class Solution {
        // Length of Longest Substring Function
        public int lengthOfLongestSubstring(String s) {
            // Initialize variable left, right & max to 0
            int left = 0;
            int right = 0;
            int max = 0;

            // Create a Set
            Set<Character> set = new HashSet<>();

            // While right is less than string length
            while (right < s.length()) {
                // then pick 1st character of string
                char c = s.charAt(right);
                // If set.add (char)
                if (set.add(c)) {
                    // Find max window length & increment right pointer
                    max = Math.max(max, right - left + 1);
                    right++;
                }
                // Else
                else {
                    // While string left char is not equal to char at left
                    while (s.charAt(left) != c) {
                        // while string left char is not equal to c
                        set.remove(s.charAt(left));
                        left++;
                    }
                    // Finally, the char remove frm the string * increment left pointer
                    set.remove(c);
                    left++;
                }
            }
            // Finally, return max length window
            return max;
        }
    }
}

// Output -
/*
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
*/

// Algorithm -
/*
1. Initialize variable left, right & max to 0
2. Create a Set
3. While right is less than string length, then pick 1st character of string
4. If set.add (char), Find max window length & increment right pointer
5. Else, while string left char is not equal to char at left, while string left char
   is not equal to c
6. Finally, the char remove frm the string & increment left pointer
7. Finally, return max length window
*/

// Time & Space Complexity -
/*
Time - O(N), where N is linearly traversing an string
Space - O(N) , because we using Set
*/
