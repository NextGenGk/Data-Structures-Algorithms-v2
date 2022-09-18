package Arrays.Easy;

public class Reverse_Integer {

    class Solution {
        public int reverse(int x) {
            long reverse = 0;
            while(x != 0){
                long remainder = x % 10;
                reverse = reverse * 10 + remainder;
                x= x/10;
                if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
                    return 0;
            }
            return (int) reverse;
        }
    }
}

// Output -
/*
Input: x = 123
Output: 321
 */

// Logic -
/*
1. We initialize a variable reverse to 0.
2. We loop until x is 0.
3. We get the remainder of x divided by 10.
4. We multiply reverse by 10 and add the remainder.
5. We divide x by 10.
6. If reverse is greater than Integer.MAX_VALUE or less than Integer.MIN_VALUE, we return 0.
7. Otherwise, we return the value of reverse.
 */

// Time & Space Complexity -
/*
Time - O(N), where N is the length of the given number
Space - O(1)
 */