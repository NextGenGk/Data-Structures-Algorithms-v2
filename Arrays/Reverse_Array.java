package Arrays;

public class Reverse_Array {

    // Iterative Method
    static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Recursive Method
    static void reverseArray2(int[] arr, int start, int end) {
        int temp;
        if (start >= end) {
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

    /* Utility that prints out an array on a line */
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        // Iterative Method
        printArray(arr, 6);
        reverseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6);

        // Recursive Method
        printArray(arr, 6);
        reverseArray2(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6);
    }
}

// Output -
/*
1 2 3 4 5 6
Reversed array is
6 5 4 3 2 1
 */

// Algorithm - ( Iterative Method )
/*
1) Initialize start and end indexes as start = 0, end = n-1
2) In a loop, swap arr[start] with arr[end] and change start and end as follows :
start = start +1, end = end – 1
 */

// Algorithm - ( Recursive Method )
/*
1) Initialize start and end indexes as start = 0, end = n-1
2) Swap arr[start] with arr[end]
3) Recursively call reverse for rest of the array.
 */

// Time & Space Complexity - ( Iterative Method )
/*
Time - O(N), because of linear time
Space - O(1)
 */

// Time & Space Complexity - ( Recursive Method )
/*
Time - O(N), because of linear time
Space - O(N), because create recursive call stack in memory
 */

