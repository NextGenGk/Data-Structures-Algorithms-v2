package Arrays;

public class Trapping_Rainwater {
    // Trapping Rainwater Function
    public int trap(int[] height) {
        // Store length of height in variable
        int n = height.length;

        // Left aux array (& initialize with length of the array)
        int[] left = new int[n];
        // Right aux array (& initialize with length of the array)
        int[] right = new int[n];

        // left[i] contains height of tallest bar to the
        // left of i'th bar including itself
        left[0] = height[0];
        for(int i=1; i<n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        // Right [i] contains height of tallest bar to
        // the right of ith bar including itself
        right[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        // Initialize result
        int water = 0;

        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the
        // amount of water accumulated on this particular
        // bar will be equal to min(left[i], right[i]) - arr[i].
        for(int i=0; i<n; i++) {
            water = water + (Math.min(left[i], right[i]) - height[i]);
        }
        // finally return max trap water
        return water;
    }
}

// Output -
/*
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
*/

// Algorithm -
/*
1. Create two arrays left and right of size n.
2. left[i] contains height of tallest bar to the left of i'th bar including itself
3. Right [i] contains height of tallest bar to the right of ith bar including itself
4. Initialize result
5. Calculate the accumulated water element by element consider the amount of water on i'th bar,
 the amount of water accumulated on this particular bar will be equal to min(left[i], right[i]) - arr[i] .
*/

// Time & Space Complexity -
/*
TIme - O(N)
Space - O(N)
 */