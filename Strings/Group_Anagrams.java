package Strings;

import java.util.*;

public class Group_Anagrams {

    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();

            for (String s : strs) {
                // eat, tea, tan
                char[] charArray = s.toCharArray();
                // aet, aet, ant
                Arrays.sort(charArray);
                // "aet", "aet", "ant"
                String sorted = new String(charArray);

                if (!map.containsKey(sorted)) {
                    map.put(sorted, new LinkedList<String>());
                }
                // [aet, eat]
                map.get(sorted).add(s);
            }
            return new LinkedList<>(map.values());
        }
    }
}

// Output -
/*
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
*/

// Algorithm -
/*
1. We first create a hash map to store the anagrams.
2. We then iterate through the input array of strings.
3. For each string, we convert it to a character array, sort the characters, and then convert the character array back to a string.
4. We then check if the sorted string is already present in the hash map.
5. If it is not present, we add it to the hash map.
6. If it is present, we append the current string to the list of strings associated with the sorted string.
7. Finally, we return a list of lists of strings.
*/

// Time & Space Complexity -
/*
Time - O(N * klog(k)) since we are sorting k characters n times in the loop.
Space - O(1), best case for insert in map is O(1),
    & worst case is O(N)
*/