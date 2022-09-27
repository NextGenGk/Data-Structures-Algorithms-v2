package Arrays;

public class Rotate_Array_by_One_Positions {

    public static void solve(int[] nums, int n) {
        int temp = nums[0]; // storing the first element of array in a variable
        // shift the array by one positions
        for (int i = 0; i < n - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[n - 1] = temp; // assigned the value of variable at the last index
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int n = 5;
        solve(nums, n);
    }
}

// output -
/*
Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1
Explanation:
Since all the elements in array will be shifted toward left by one so ‘2’ will now become the
first index and ‘1’ which was present at first index will be shifted at last.
 */

// Algorithm -
/*
1. We first store the first element of the array in a temporary variable.
2. Then we iterate through the array from the second element to the last element.
3. For each iteration, we copy the next element to the current element.
4. Finally, we copy the temporary variable to the last element of the array.
 */

// Time & Space Complexity -
/*
Time - O(n), as we iterate through the array only once.
Space - O(1) as no extra space is used
 */