public class Single_Number {
    // Single Number Function
    public int singleNumber(int[] nums) {

        // Create a variable & initialize with zero
        int xor = 0;

        // Loop through all elements
        for (int num : nums) {
            // XOR of two same bits returns 0 (a^a = 0)
            xor = xor ^ num;
        }
        // Finally return
        return xor;
    }
}

// Output -
/*
Input: nums = [2,2,1]
Output: 1
*/

// Algorithm / Approach -
/*
1. XOR of zero and some bit returns that bit
    a^0 = a
2. XOR of two same bits returns 0
    a^a = 0
3. XOR of a^b^a for some bits a and b returns b
    a^b^a = (a^a)^b = 0^b = b
So we can XOR all bits together to find the unique number.
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/