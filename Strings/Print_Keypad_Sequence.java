package Strings;

public class Print_Keypad_Sequence {

    // Function which computes the sequence
    static String printSequence(String[] arr, String input) {
        String output = "";

        // length of input string
        int n = input.length();
        for (int i = 0; i < n; i++) {
            // Checking for space
            if (input.charAt(i) == ' ')
                output = output + "0";

            else {
                // Calculating index for each
                // character
                int position = input.charAt(i) - 'A';
                output = output + arr[position];
            }
        }
        return output;
    }

    // Main Function
    public static void main(String[] args) {
        // storing the sequence in array
        String[] str
                = {"2", "22", "222", "3", "33", "333",
                "4", "44", "444", "5", "55", "555",
                "6", "66", "666", "7", "77", "777",
                "7777", "8", "88", "888", "9", "99",
                "999", "9999"};

        String input = "BLAZING";
        System.out.println(printSequence(str, input));
    }
}

// Output -
/*
Input: "BLAZING"
Output: 2255529999444664
Explanation: For obtaining a number, we need to press a number corresponding to that character
for a number of times equal to the position of the character. For example, for character E,
press number 3 two times and accordingly.
 */

// Algorithm -
/*
1. We first declare a String array arr[] that will store the sequence.
2. We then declare a String input that will store the input string.
3. We then declare a String output that will store the output string.
4. We then declare a variable n that will store the length of the input string.
5. We then loop through the input string and check if the character is a space. If it is, we append a “0” to the output string.
6. If the character is not a space, we calculate the index of the character in the alphabet.
7. We then append the sequence at the index to the output string.
8. Finally, we return the output string.
 */

// Time & Space Complexity -
/*
Time - O(N), For traversing the string
Space - O(N), For storing the answer.
 */