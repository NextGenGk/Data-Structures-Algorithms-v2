package Arrays;

public class Min_Max_Element_in_Array {

    // Minimum & Maximum Function
    public static Pair getMinMax(int[] arr, int n) {
        Pair minMax = new Pair();

        // If there is only one element then return it as min and max both
        if (n == 1) {
            minMax.min = arr[0];
            minMax.max = arr[0];
            return minMax;
        }

        if (arr[0] > arr[1]) {
            minMax.min = arr[1];
            minMax.max = arr[0];
        } else {
            minMax.min = arr[0];
            minMax.max = arr[1];
        }

        // If there are more than one elements, then initialize min and max
        for (int i = 2; i < n; i++) {
            if (arr[i] > minMax.max) {
                minMax.max = arr[i];
            } else if (arr[i] < minMax.min) {
                minMax.min = arr[i];
            }
        }
        return minMax;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }

    // Class Pair is used to return two values from getMinMax()
    static class Pair {
        int min;
        int max;
    }
}

// Output -
/*
Minimum element is 1
Maximum element is 3000
 */

// Algorithm -
/*
1. We have created a class Pair which is used to return two values from getMinMax().
2. The class Pair has two fields min and max.
3. The getMinMax() method returns a Pair object.
4. The getMinMax() method takes two arguments, an array arr[] and the size of the array.
5. The method returns a Pair object minMax.
6. The method initializes minMax.min to arr[0] and minMax.max to arr[1].
7. If there are more than one elements, then initialize min and max.
8. The for loop iterates from 2 to n.
9. If arr[i] is greater than minMax.max, then minMax.max is updated.
10. If arr[i] is less than minMax.min, then minMax.min is updated.
11. Finally, the method returns minMax.
 */

//
// Time & Space Complexity -
/*
Time - O(N)
Space - O(1) as no extra space was needed.
In this method, the total number of comparisons is 1 + 2(n-2) in the worst case and 1 + n – 2 in the best case.
 */