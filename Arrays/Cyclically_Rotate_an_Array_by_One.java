package Arrays;

public class Cyclically_Rotate_an_Array_by_One {

    class Compute {
        public void rotate(int[] arr, int n) {
            int i = 0;
            int j = arr.length - 1;
            while (i != j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }
}

// 2nd Method
/*
    // Method for rotation
    void rotate()
    {
        int x = arr[arr.length-1], i;
        for (i = arr.length-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;
    }

// Algorithm -
/*
Following are steps.
1) Store last element in a variable say x.
2) Shift all elements one position ahead.
3) Replace first element of array with x.
*/

// Output -
/*
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 */

// Algorithm -
/*
1. We initialize two pointers i and j.
2. We iterate until i and j are not equal.
3. We swap the elements pointed by i and j.
4. We increment i and decrement j.
5. We repeat the above steps until i and j are not equal.

We can use two pointers, say i and j which point to first and last element of array respectively.
As we know in cyclic rotation we will bring last element to first and shift rest in forward direction,
so start swapping arr[i] and arr[j] and keep j fixed and i moving towards j.  Repeat till i is not equal to j.
 */

// Time & Space Complexity -
/*
Time - O(N), as we need to iterate through all the elements. Where n is the number of elements in the array.
Space - O(1), as we are using constant space.
 */