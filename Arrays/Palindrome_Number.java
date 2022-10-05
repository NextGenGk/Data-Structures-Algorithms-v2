public class Palindrome_Number {

    class Solution {
        public String isPalindrome(int n) {
            int num = n;
            int reverse = 0;

            while(num > 0) {
                int rem = num%10;
                reverse = reverse * 10 + rem;
                num = num/10;
            }

            if(n == reverse) {
                return "Yes";
            }
            else {
                return "No";
            }
        }
    }
}

// Output -
/*
Input: n = 55555
Output: Yes
 */

// Algorithm -
/*
1. Store the given number (n) in a number variable
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