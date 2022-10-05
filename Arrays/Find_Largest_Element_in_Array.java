package Arrays;

public class Find_Largest_Element_in_Array {
    class Compute {
        public int largest(int[] arr, int n) {
            int ans = 0;
            for(int i=0; i<n; i++) {
                if(ans < arr[i]) {
                    ans = arr[i];
                }
            }
            return ans;
        }
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
1. We initialize the answer to 0.
2. We traverse the array and compare each element with the answer.
3. If the answer is less than the current element, we update the answer.
4. Finally, we return the answer.
 */

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
 */