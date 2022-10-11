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
1. We initialize two pointers i and j to m-1 and n-1 respectively.
2. We initialize a third pointer k to m + n - 1.
3. We iterate through the two arrays from the back.
4. If nums1[i] is greater than nums2[j], we copy nums1[i] to nums1[k] and decrement i.
5. Otherwise, we copy nums2[j] to nums1[k] and decrement j.
6. We decrement k after each iteration.
7. Finally, we copy the remaining elements of nums2 into nums1.
*/

// Time & Space Complexity -
/*
Time - O(m+n), where m & n size of 1st and 2nd array
Space - O(1), because no extra space is needed
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
1. We initialize two variables i and j to 0.
2. We initialize a third variable k to 0.
3. We start a while loop with the condition i < n1 and j < n2.
4. If arr1[i] is less than arr2[j], we assign arr3[k++] with arr1[i++].
5. If arr1[i] is greater than arr2[j], we assign arr3[k++] with arr2[j++].
6. If either i or j becomes equal to n1 or n2, we exit the loop.
7. We then copy the remaining elements of arr1[], if there are any, to arr3[k].
8. We then copy the remaining elements of arr2[], if there are any, to arr3[k].
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

// Approach -
/*
1. We initialize a variable i to 0.
2. We loop through the nums2 array.
3. We copy the element at index i in nums2 to index i + m in nums1.
4. We sort nums1.
 */

// Time & Space Complexity -
/*
Time Complexity:O((N + M)log(N+M)), where N and M are the size of array A[] and B[]
Space Complexity:O(N), built-in sort takes space
 */