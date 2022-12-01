package Strings;

import java.util.Scanner;

public class Rabin_Karp {
    // Rabin Karp Function
    public static int rabinKarp(String str, String pattern) {

        // base case
        if (pattern.length() > str.length() || pattern.length() == 0) return -1;

        // rabin - karp
        int alphabets = 26;
        int patternHashCode = HashFunction(pattern, alphabets);
        int window = pattern.length();
        int index = -1;
        int substringHashCode = HashFunction(str.substring(0, window), alphabets);

        for (int i = 1; i < str.length() - window + 1; i++) {
            int prev = str.charAt(i - 1) * (int) Math.pow(alphabets, pattern.length() - 1);

            substringHashCode = (substringHashCode - prev) * alphabets + str.charAt(i + window - 1);

            if (substringHashCode == patternHashCode) {
                if (str.substring(i, i + window).equals(pattern)) {
                    System.out.println("found at index: " + i);
                }
            }
        }
        return index;
    }

    // Hash Function
    public static int HashFunction(String inp, int alphabets) {
        int k = inp.length() - 1;

        int res = 0;

        for (int i = 0; i < inp.length(); i++) {
            int asc = inp.charAt(i);
            res = res + (asc * (int) Math.pow(alphabets, k));
            k--;
        }
        return res;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter input string");
        String input = obj.nextLine();
        System.out.println("Enter input string");
        String pattern = obj.nextLine();
        rabinKarp(input, pattern);
    }
}

// Output -
/*
Enter input string
ccaccb
Enter input string
ccb
found at index: 3
 */

// Time & Space Complexity -
/*
Time - O(N - M + 1), where N is the length of the string, & M is the pattern length
Space - O(1), no extra space is needed
 */