package Strings;

import java.util.HashMap;

public class Isomorphic_String {

    class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> map = new HashMap<>();

            if (s.length() != t.length()) return false;

            for (int i = 0; i < s.length(); i++) {
                char p1 = s.charAt(i);
                char p2 = t.charAt(i);

                if (map.containsKey(p1)) {
                    if (map.get(p1) != p2) {
                        return false;
                    }
                }

                // if map contains value of p2 means
                // p2 key is possible, so return false
                else if (map.containsValue(p2)) {
                    return false;
                } else {
                    map.put(p1, p2);
                }
            }
            return true;
        }
    }
}

// Output -
/*
Input: s = "egg", t = "add"
Output: true

Idea - One to One Mapping
e - a
g - d
*/

// Algorithm -
/*
1. We first check if the lengths of the two strings are the same. If not, then we return false.
2. We create a HashMap to store the characters of the first string as keys and the characters of the second string as values.
3. We then iterate through the characters of the first string and check if the character is already present in the HashMap as a key. If it is, then we check if the value of the key in the HashMap is equal to the character in the second string. If not, then we return false.
4. If the character is not present in the HashMap as a key, then we check if the character of the second string is already present in the HashMap as a value. If it is, then we return false.
5. If the character is not present in the HashMap as a key and the character is not present in the HashMap as a value, then we add the character as a key and the character of the second string as a value to the HashMap.
6. Finally, we return true.
*/

// Time & Space Complexity -
/*
Time - O(N), because we linearly traverse an array by once
Space - O(N), because using HashMap to store the characters
*/