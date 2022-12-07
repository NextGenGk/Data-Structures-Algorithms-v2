package Strings;

public class Remove_Consecutive_Characters {

    class Solution {
        public String removeConsecutiveCharacter(String S) {
            String res = "";
            for (int i = 0; i < S.length(); i++) {
                if (i < S.length() - 1 && S.charAt(i) == S.charAt(i + 1)) continue;
                else res += S.charAt(i);
            }
            return res;
        }
    }
}

// Output-
/*
Input:
S = aabb
Output:  ab
Explanation: 'a' at 2nd position is appearing 2nd time consecutively.
Similar explanation for b at 4th position.
*/

// Algorithm -
/*1. We initialize a String variable res to store the result.
2. We loop through the String S and check if the current character is the same as the next character.
3. If the current character is the same as the next character, we skip the current character and continue the loop.
4. If the current character is not the same as the next character, we add the current character to the result String.
5. Finally, we return the result String.
*/

// Time & Space Complexity -
/*
Time - O(N), where N is for linearly traversing an string
Space - O(1), no extra space is needed
*/