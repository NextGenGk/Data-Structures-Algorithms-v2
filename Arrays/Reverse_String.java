package Arrays;

public class Reverse_String {

    class Solution {
        public void reverseString(char[] s) {
            int start = 0;
            int end = s.length - 1;
            while (start < end) {
                char temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--;
            }
        }
    }
}

// Output -
/*
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
*/

// Algorithm -
/*
1. We start with the first character of the string and the last character of the string.
2. We swap the characters.
3. We increment the start index and decrement the end index.
4. We continue this until the start index is less than the end index.
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
*/