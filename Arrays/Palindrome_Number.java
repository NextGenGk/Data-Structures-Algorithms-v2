package Arrays;

public class Palindrome_Number {
    // Is Palindrome Function
    public boolean isPalindrome(int x) {

        // Constraint
        if (x < 0) {
            return false;
        }
        // Store the given number (x) in a number variable
        int number = x;
        // This will store the reverse of the number
        int reverse = 0;
        while (number > 0) {
            // Store the remainder in rem variable
            int rem = number % 10;
            // Add this remainder to reverse
            reverse = reverse * 10 +  rem;
            // And then divide the number by 10
            number = number/10;
        }
        // If number is equal to reverse
        if (x == reverse) {
            return true;
        }
        // Else
        else {
            return false;
        }

//         2nd Method
//         int s = 0;
//         int c = x;
//         while(x > 0) {
//             int rem = x % 10;
//             s = s * 10 + rem;
//             x = x / 10;
//         }
//         if(c == s) {
//             return true;
//         }
//         else {
//             return false;
//         }
    }
}

// Output -
/*
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/

// Algorithm -
/*
1. Store the given number (x) in a number variable
2. Initialize variable reverse to 0
3. Store the remainder in rem variable
4. Add this remainder to reverse
5. And then divide the number by 10
*/

// Time & Space Complexity -
/*
Time - O(log10n) because we are dealing with integers which are base 10.
Space - O(1);
*/