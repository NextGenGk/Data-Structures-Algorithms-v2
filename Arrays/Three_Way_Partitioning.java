package Arrays;

public class Three_Way_Partitioning {

    class Solution {
        //Function to partition the array around the range such
        //that array is divided into three parts.
        public void threeWayPartition(int[] array, int a, int b) {
            int low = 0;
            int mid = 0;
            int high = array.length - 1;

            while (mid <= high) {
                if (array[mid] < a) {
                    swap(array, low, mid);
                    low++;
                    mid++;
                } else if (array[mid] >= a && array[mid] <= b) {
                    mid++;
                } else {
                    swap(array, mid, high);
                    high--;
                }
            }
        }

        public void swap(int[] arr, int low, int high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }
    }
}

// Output -
/*
Input:
n = 5
A[] = {1, 2, 3, 3, 4}
[a, b] = [1, 2]
Output: 1
Explanation: One possible arrangement is:
{1, 2, 3, 3, 4}. If you return a valid arrangement, output will be 1.
*/

// Algorithm -
/*
1. We initialize low to 0, mid to 0, and high to array.length-1.
2. We loop while mid is less than or equal to high.
3. If array[mid] is less than a, we swap array[low] and array[mid] and increment low and mid.
4. If array[mid] is between a and b, we increment mid.
5. If array[mid] is greater than b, we swap array[mid] and array[high] and decrement high.
*/

// Time & Space Complexity -
/*
Time - O(N), we linearly traverse an array by once
Space - O(1), no extra space is needed
*/