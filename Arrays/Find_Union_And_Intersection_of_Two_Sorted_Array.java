package Arrays;

public class Find_Union_And_Intersection_of_Two_Sorted_Array {

    // Union -

    /* Function prints Intersection of arr1[] and arr2[]
       m is the number of elements in arr1[]
       n is the number of elements in arr2[] */
    // Find Union Function
    static int findUnion(int[] arr1, int[] arr2, int m, int n) {
        // Initial values i = 0, j = 0
        int i = 0;
        int j = 0;

        // while i less than m and j less than n
        while (i < m && j < n) {
            // If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i.
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            }
            // If arr2[j] is smaller than arr1[j] then print arr2[j] and increment j.
            else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            }
            // If both are same then print any of them and increment both i and j.
            else {
                System.out.print(arr2[j] + " ");
                i++;
                j++;
            }
        }

        // Print remaining elements of the larger array.
        while (i < m) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < n) {
            System.out.println(arr2[j] + " ");
            j++;
        }
        return 0;
    }

    // Intersection -

    /* Function prints Intersection of arr1[] and arr2[]
       m is the number of elements in arr1[]
       n is the number of elements in arr2[] */
    // Find Intersection Function
    static void findInterSection(int[] arr1, int[] arr2, int m, int n) {
        // Initial values i = 0, j = 0
        int i = 0;
        int j = 0;

        // while i less than m and j less than n
        while (i < m && j < n) {
            // If arr1[i] is smaller than arr2[j] then increment i.
            if (arr1[i] < arr2[j]) {
                i++;
            }
            // If arr2[j] is smaller than arr1[j] then increment j.
            else if (arr2[j] < arr1[i]) {
                j++;
            }
            // If both are same then print any of them and increment both i and j.
            else {
                System.out.print(arr2[j] + " ");
                i++;
                j++;
            }
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        // m is the length of 1st array
        int m = arr1.length;
        // n is the length of 2nd array
        int n = arr2.length;
        // Find Union FUnction
        findUnion(arr1, arr2, m, n);
        // Find Intersection Function
        findInterSection(arr1, arr2, m, n);
    }
}

// Output -
/*
Union - 1 2 3 4 5 6 7
Intersection - 2 5
 */

// Algorithm (Union) -
/*
1. Use two index variables i and j, initial values i = 0, j = 0
2. If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i.
3. If arr2[j] is smaller than arr1[j] then print arr2[j] and increment j.
4. If both are same then print any of them and increment both i and j.
5. Print remaining elements of the larger array.
 */

// Algorithm (Intersection) -
/*
1. Use two index variables i and j, initial values i = 0, j = 0
2. If arr1[i] is smaller than arr2[j] then increment i.
3. If arr2[j] is smaller than arr1[j] then increment j.
4. If both are same then print any of them and increment both i and j.
 */

// Time & Space Complexity -
/*
Time - O(m+n)
Space - O(1)
 */