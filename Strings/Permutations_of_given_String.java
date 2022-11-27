package Strings;

public class Permutations_of_given_String {

    // Main Function
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        Permutations_of_given_String permutation = new Permutations_of_given_String();
        permutation.permute(str, 0, n - 1);
    }

    /**
     * permutation function
     * str string to calculate permutation for
     * l starting index
     * r end index
     */
    private void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    // Swap Function
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

// Output -
/*
Input: S = “ABC”
Output: “ABC”, “ACB”, “BAC”, “BCA”, “CBA”, “CAB”
 */

// Algorithm -
/*
1. We first print the string if the length of the string is 1.
2. If not, we swap the first character with all the characters one by one, from left to right.
3. We call the permute() function recursively with the index set to the next character.
4. Once we reach the end of the string, we swap the characters back to their original position.
 */

// Time & Space Complexity -
/*
Time - O(N * N!) Note that there are N! permutations and it requires O(N) time to print a permutation.
Space - O(R – L)
 */