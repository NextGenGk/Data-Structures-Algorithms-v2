package Arrays;

public class Merge_Two_Sorted_Array_With_No_Extra_Space {

    class Solution {
        // Merge Sorted Array Function
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            // Initialize i with nums1 length - 1
            int i = m - 1;
            // Initialize j with nums2 length - 1
            int j = n - 1;
            // Initialize k with (nums1 + nums2) length - 1
            int k = (m + n) - 1;

            // While i is greater than or equal to 0 &&
            // j is greater than or equal to 0
            while (i >= 0 && j >= 0) {
                // If nums1[i] is greater than nums2[j]
                if (nums1[i] > nums2[j]) {
                    // nums1[i] value is stored in nums1[k]
                    // & both i & k are decrement by 1
                    nums1[k] = nums1[i];
                    i--;
                    k--;
                }
                // ELse
                else {
                    // nums2[j] value is stored in nums1[k]
                    // & both j & k are decrement by 1
                    nums1[k] = nums2[j];
                    j--;
                    k--;
                }
            }

            // while i is greater than or equal to zero means
            // nums1[i] elements are remaining
            while (i >= 0) {
                // nums1[i] value is stored in nums1[k]
                // & both i & k are decrement by 1
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            // while j is greater than or equal to zero means
            // nums2[j] elements are remaining
            while (j >= 0) {
                // nums2[j] value is stored in nums1[k]
                // & both j & k are decrement by 1
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }

// Output -
/*
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*/

// Algorithm -
/*
1. Initialize i, j & k
2. Check, If nums1[i] is greater than nums2[j], nums1[i] value is stored in nums1[k]
   & both i & k are decrement by 1
3. Else nums2[j] value is stored in nums1[k] & both j & k are decrement by 1
4. While nums1[i] elements are remaining, nums1[i] value is stored in nums1[k] & both i & k    are decrement by 1
5. While nums2[j] elements are remaining, nums2[j] value is stored in nums1[k]
   & both j & k are decrement by 1
*/

// Time & Space Complexity -
/*
Time - O(m+n)
Space - O(1)
*/

// 2nd Approach (Merge Sort Method) -
/*
void mergeArrays(int arr1[], int arr2[], int n1,
  int n2, int arr3[]) {
  int i = 0, j = 0, k = 0;
  while (i < n1 && j < n2) {
    if (arr1[i] < arr2[j])
      arr3[k++] = arr1[i++];
    else
      arr3[k++] = arr2[j++];
  }
  while (i < n1)
    arr3[k++] = arr1[i++];
  while (j < n2)
    arr3[k++] = arr2[j++];
}
 */

// Algorithm -
/*
1. Create an auxiliary array of size N + M.
2. Put two pointers i and j and initialise them to 0.
3. Pointer i points to the first array, whereas pointer j points to the second array.
4. Traverse both the array simultaneously using the pointers, and pick the smallest elements among both the array and insert in into the auxiliary array.
5. Increment the pointers.
6. After traversal, return the merged array.
 */

// Time & Space Complexity -
/*
Time Complexity:O(N + M), where N and M is the size of array A[] and B[]
Space Complexity:O(N + M), as the auxiliary array is used
 */

// Approach 3 (Insert Sort Approach) -
/*
public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
 */

// Time & Space Complexity -
/*
Time Complexity:O((N + M)log(N+M)), where N and M are the size of array A[] and B[]
Space Complexity:O(N), built-in sort takes space
 */
}
