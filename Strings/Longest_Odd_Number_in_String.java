package Strings;

public class Longest_Odd_Number_in_String {

    class Solution {
        public String largestOddNumber(String num) {
            for (int i = num.length() - 1; i >= 0; i--) {
                char c = num.charAt(i);
                if (c % 2 == 1) {
                    return num.substring(0, i + 1);
                }
            }
            return "";
        }
    }
}

// Output -
/*
Example 1 :
Input: num = "35427"
Output: "35427"
Explanation: "35427" is already an odd number.

Example 2 :
Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
*/

// Algorithm -
/*
1. We iterate through the string from the end to the beginning.
2. We check if the character at the current index is odd.
3. If it is odd, we return the substring from the beginning to the current index.
4. If it is not odd, we continue to the next index.
5. If we reach the end of the string and haven’t found an odd character, we return an empty string.
*/

// Time & Space Complexity -
/*
Time - O(N), For linearly traversing the string by once
Space - O(1), no extra space is needed
*/