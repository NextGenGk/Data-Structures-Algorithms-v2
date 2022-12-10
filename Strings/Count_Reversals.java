package Strings;

public class Count_Reversals {

    class Solution {
        int countRev(String s) {
            if (s.length() % 2 != 0) return -1;

            int open = 0, close = 0, rev = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '{') {
                    open++;
                } else {
                    if (open == 0) {
                        close++;
                    } else {
                        open--;
                    }
                }
            }
            rev = (int) (Math.ceil(open / 2.0) + Math.ceil(close / 2.0));
            return rev;
        }
    }
}

// Output -
/*
Input:
S = "}{{}}{{{"
Output: 3
Explanation: One way to balance is: "{{{}}{}}". There is no balanced sequence
that can be formed in lesser reversals.
 */

// Algorithm -
/*
1. We first check if the string has an odd number of characters. If it does, we return -1.
2. We initialize two variables, open and close, to keep track of the number of opening and closing braces.
3. We loop through the string and increment or decrement the open and close variables accordingly.
4. We calculate the number of reverse braces by taking the ceiling of the number of open braces divided by 2 and adding it to the ceiling of the number of close braces divided by 2.
5. We return the number of reverse braces.
 */

// Time & Space Complexity -
/*
Time - O(N), because we linearly traversing
Space - O(1), no extra space is needed
 */