package Strings;

public class Valid_Anagram {

    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;
            int[] alphabet = new int[26];
            for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
            for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
            for (int i : alphabet) if (i != 0) return false;
            return true;
        }
    }
}

// Output -
/*
Input: s = "anagram", t = "nagaram"
Output: true
*/

// Algorihtm -
/*
1. First, we check if the two strings have the same length. If they don’t, then they can’t be anagrams.
2. Next, we create an array of 26 integers, each representing the count of a corresponding English letter in the alphabet.
3. Then, we iterate through the first string and increase the count of each letter in the alphabet array.
4. Then, we iterate through the second string and decrease the count of each letter in the alphabet array.
5. Finally, we check if any count is non-zero, which means that the two strings don’t contain the same letters.
*/

// Time & Space Complexity -
/*
Time - O(N), where N is the length of the string
Space - O(1), because no extra memory is required
*/