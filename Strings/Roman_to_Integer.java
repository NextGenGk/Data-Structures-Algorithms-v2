package Strings;

import java.util.HashMap;

public class Roman_to_Integer {

    class Solution {
        public int romanToInt(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                    ans += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                    // IV {0,1}
                    i++;
                } else {
                    ans += map.get(s.charAt(i));
                }
            }
            return ans;
        }
    }
}

// Output -
/*
Input: s = "III"
Output: 3
Explanation: III = 3.
*/

// Algorithm -
/*
1. We create a HashMap to store the mapping between the Roman numerals and their corresponding integer values.
2. We iterate through the string and for each character, we check if the next character is smaller than the current character.
If it is, then we add the difference between the two to the answer.
3. If the next character is not smaller, then we add the value of the current character to the answer.
4. We return the answer.
*/

// Time & Space Complexity -
/*
Time - O(N), because we linearly traverse a map
Space - O(1), no extra space is needed
*/
