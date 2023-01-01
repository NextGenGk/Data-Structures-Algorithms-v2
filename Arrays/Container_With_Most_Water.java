package Arrays;

public class Container_With_Most_Water {
    // Max Area Function
    public int maxArea(int[] height) {
        // Initialize left
        int left = 0;
        // Initialize right
        int right = height.length - 1;
        // Total Area
        int area = 0;

        // While left is less than right
        while (left < right) {
            // Calculating the max area
            area = Math.max(area, Math.min(height[left], height[right]) * (right - left));

            // If left is smaller than right, increment 1 in left
            if (height[left] < height[right]) {
                left++;
            }
            // Else decrement 1 in right
            else {
                right--;
            }
        }
        // finally return maximum area
        return area;
    }
}

// Output -
/*
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water
(blue section) the container can contain is 49.
*/

// Algorithm:
/*
1. Keep two index, left = 0 and right = n-1 and a value max_area that stores the maximum area.
2. Run a loop until first is less than the last.
3. Update the max_area with maximum of max_area and min(array[left] , array[right])*(right-left)
4. if the value at array[left] is greater the array[right] then update right as right – 1 else update left as left + 1
5. Print the maximum area
 */

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
 */