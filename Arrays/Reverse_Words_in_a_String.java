package Arrays;

public class Reverse_Words_in_a_String {
    class Solution {
        public String reverseWords(String s) {
            int i = s.length() - 1;

            String ans = "";

            while (i >= 0) {
                while (i >= 0 && s.charAt(i) == ' ') i--;

                int j = i;

                if (i < 0) break;

                while (i >= 0 && s.charAt(i) != ' ') i--;
                if (ans.isEmpty()) {
                    ans = ans.concat(s.substring(i + 1, j + 1));
                } else {
                    ans = ans.concat(" " + s.substring(i + 1, j + 1));
                }
            }

            return ans;
        }
    }
}

// Output -
/*
Input: s = "the sky is blue"
Output: "blue is sky the"
*/

// Algorithm -
/*
1. We start from the end of the string and keep moving backward until we hit a space.
2. Once we hit a space, we keep moving backward until we hit a non-space character.
3. We keep track of the start and end of the word.
4. If the string is empty, we return the word.
5. Otherwise, we add a space and the word to the string.
6. We keep repeating the process until we reach the beginning of the string.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
*/