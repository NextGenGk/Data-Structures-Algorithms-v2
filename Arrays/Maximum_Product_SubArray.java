package Arrays;

public class Maximum_Product_SubArray {
    // Max Product Subarray Function
    public int maxProduct(int[] nums) {
        // Initialize maxProduct to Integer.Min_Value
        int maxProduct = Integer.MIN_VALUE;
        // Initialize product to 1
        int product = 1;

        // Loop through left to right
        for (int i=0; i<nums.length; i++) {
            // Find product
            product = product * nums[i];
            // And adding on max product (which of the two is bigger)
            maxProduct =  Math.max(maxProduct, product);
            // Check if product is 0, then initialize product is 0
            if (product == 0) {
                product = 1;
            }
        }

        // start
        product = 1;
        // Loop through right to left
        for (int i=nums.length-1; i>=0; i--) {
            // Find product
            product = product * nums[i];
            // And adding on max product (which of the two is bigger)
            maxProduct = Math.max(maxProduct, product);
            // Check if product is 0, then initialize product is 0
            if (product == 0) {
                product = 1;
            }
        }
        // Finally return maxProduct
        return maxProduct;
    }
}

// Output -
/*
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
*/

// Algorithm -
/*
1. Initialize maxProduct to Integer.Min_Value & product to 1
2. Loop through left to right
3. Find product And adding on max product (which of the two is bigger (maxProduct or product));
4. Check if product is 0, then initialize product is 0
5. Loop through right to left
6. Find product And adding on max product (which of the two is bigger (maxProduct or product));
7. Check if product is 0, then initialize product is 0
8. Finally, return maxProduct
 */

// Time & Space Complexity -
/*
Time - O(N), because each element should traverse one time
Space - O(1), no extra space is needed
 */