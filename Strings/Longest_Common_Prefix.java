package Strings;

import java.util.Arrays;

public class Longest_Common_Prefix {

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            StringBuilder res = new StringBuilder();

            // Sort the array
            Arrays.sort(strs);

            // Get the first and last element
            char[] first = strs[0].toCharArray();
            char[] last = strs[strs.length - 1].toCharArray();

            // Start Comparing
            for (int i = 0; i < first.length; i++) {
                if (first[i] != last[i]) {
                    break;
                }
                res.append(first[i]);
            }

            return res.toString();
        }
    }

// Output -
/*
Input: strs = ["flower","flow","flight"]
Output: "fl"
*/

// Algorithm -
/*
1. First, we sort the array.
2. Then, we get the first and last element of the array.
3. Then, we iterate through the first's string length
4. If the first and last element are not equal, we break out of the loop.
5. Otherwise, we append the character to the result string.
*/

// Time & Space Complexity -
/*
Time - O(N*log*N), because we using sorting (uses QuickSort Algorithm)
Space - O(1), no extra space is needed
*/