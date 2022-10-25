package Arrays;

public class Find_the_Missing_Number {

    // Function to find the missing number
    public static int getMissingNo(int[] nums, int n) {
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int N = arr.length;
        System.out.println(getMissingNo(arr, N));
    }
}

// Output -
/*
Input: arr[] = {1, 2, 3, 5}, N = 5
Output: 4
Explanation: The missing number between 1 to 5 is 4
 */

// Algorithm -
/*
1. Calculate the sum of the first N natural numbers as sumtotal= N*(N+1)/2.
2. Traverse the array from start to end.
    i. Find the sum of all the array elements.
3. Print the missing number as sumTotal – sum of array
 */

// Time & Space Complexity -
/*
Time - O(N), because we linearly traverse an array by once
Space - O(1), no extra space is needed
 */