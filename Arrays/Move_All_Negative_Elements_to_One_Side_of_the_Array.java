package Arrays;

public class Move_All_Negative_Elements_to_One_Side_of_the_Array {

    // Print Array Function
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Swap Function
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to shift all negative integers to the left
    // and all positive integers to the right
    // using Dutch National Flag Algorithm
    // Move Function
    private static void move(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            if (arr[low] <= 0) {
                low++;
            } else {
                swap(arr, low, high);
                high--;
            }
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        move(arr);
        printArray(arr);
    }
}

// Dutch National Flag Algorithm -
/*
Here, we will use the famous Dutch National Flag Algorithm for two “colors”.
The first color will be for all negative integers and the second color will
be for all positive integers. We will divide the array into three partitions
with the help of two pointers, low and high.
1. arr[1…low-1] negative integers
2. arr[low…high] unknown
3. arr[high+1…N] positive integers
 */

// Output -
// -12 -6 -13 -5 -3 -7 5 6 11

// Algorithm -
/*
1. Initialize low, mid & high
2. If 0, swap arr[low] and arr[mid], low++, mid++
3. If 1, mid++
4. If 2, swap arr[mid] and arr[high], high--
 */

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
Note : The order of elements does not matter here
 */