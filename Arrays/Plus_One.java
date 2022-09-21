package Arrays;

public class Plus_One {
    // Plus One Function
    public int[] plusOne(int[] digits) {
        // Store digits length in a variable
        int n = digits.length;
        // Loop through digits length - 1
        for(int i=n-1; i>=0; i--) {
            // Check If digits is not equal to 9
            if(digits[i] != 9) {
                // then increment +1 in digit
                digits[i]++;
                break;
            }
            // else
            else {
                digits[i] = 0;
            }
        }

        // If digits is 0
        if(digits[0] == 0) {
            // Create an new Array of size digits length + 1
            int[] arr = new int[n+1];
            // Store 1 value on first position of array
            arr[0] = 1;
            return arr;
        }
        // finally, return digits
        return digits;
    }
}

// Output -
/*
Example 1 :
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2 :
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
*/

// Algorithm -
/*
1. Store digits length in a variable
2. Loop through digits length - 1
3. Check, If digits is not equal to 9, then increment +1 in digit
4. Else add 0 in digits[i]
4. Check, If digits is 0, Create an new Array of size digits length + 1,
   & Store 1 value on first position of array
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(n+1) by creating an array
*/