package Strings;

import java.util.ArrayList;
import java.util.List;

public class Print_All_Subsequences_of_String {

    // Declare a Global List
    static List<String> list = new ArrayList<>();

    // Find Subsequences Function
    public static void findSubsequences(String s, String ans) {
        if (s.length() == 0) {
            list.add(ans);
            return;
        }

        // We add adding 1st character in string
        findSubsequences(s.substring(1), ans + s.charAt(0));

        // Not adding first character of the string because the concept of subsequence either
        // character will present or not
        findSubsequences(s.substring(1), ans);
    }

    // Creating a public static Arraylist such that we can store values
    // IF there is any question of returning then we can directly return too
    // public static List<String> list = new ArrayList<String>();
    public static void main(String[] args) {
        String s = "abc";
        findSubsequences(s, ""); // Calling a function
        System.out.println(list);
    }
}

// Output -
/*
Input : abc
Output : a, b, c, ab, bc, ac, abc
 */

// Algorithm -
/*
1. We start with the empty string and empty answer.
2. We recursively call the function with the string without the first character and the answer
with the first character.
3. We recursively call the function with the string without the first character and the answer
without the first character.
 */

// Time & Space Complexity -
/*
Time - O(N^2)
Space - O(1)
 */