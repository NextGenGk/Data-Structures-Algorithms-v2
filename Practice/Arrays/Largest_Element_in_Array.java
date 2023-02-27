package Arrays;

class Compute {

    public int largest(int arr[], int n) {
        int max = 0;
        for (int i=0; i<n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

// Output -
/*
Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output:
90
Explanation:
The largest element of given array is 90.
*/

// Algorithm -
/*
1. We’re declaring a variable max and initializing it to 0.
2. We’re looping through the array and comparing each element with the max variable.
3. If the element is greater than max, we’re updating max with the element.
4. Finally, we’re returning max.
*/

// TIme & Space Complexity -
/*
Time - O(N), because we linearly traverse an array
Space - O(1), because no extra space is needed
*/