package Strings;

public class Next_Permutation {

    class Solution {
        public void nextPermutation(int[] nums) {
        //1st step --> Find the pivot

        /*iska matlab aisa number jisko tumhe actually swap karna hai basically
		left lesser value to right larger value. So yaha par pehle hum wo left lesser
		value dhund rahe hai next step mein right larger value.Ex: 9 1 5 3 toh
		isme check karo ki kab tumhe arr[idx+1]>arr[idx] mil jaaye is case mein 1st idx is pivot hoga.
		*/

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        /*why if because in case of the largest number i will be -ve itself like 3 2 1
        have to return the smallest arrangement i.e. 1 2 3 so simply reverse no need of
        2nd step */


        /*2nd step: Find the just larger value than your arr[i] so we can swap
		both the numbers. Ex: 9 1 5 3 mein 1 and 3 will be swapped because 3 is
		just immediate larger than our arr[i] */

        if (i >= 0) {
        int j = nums.length - 1;
        while (nums[i] >= nums[j]) j--;

        /*Step 3: Swap both the indexes i.e. i and j in our example the resultant
		would look like 9 3 5 1 */

        swap(nums, i, j);
    }

    //Step-4 : Reverse the array after the pivot point

    /*Why see if you look carefully our number after swap becomes 9 3 5 1
	but according to question we want the next permutation which is just
	immediate greater than the given number right so our resultant final answer
    should be 9 3 1 5, for that we have to reverse the array after the pivot
	point i.e. reverse from (i+1,arr.length-1) also if you remember our if check
	is due to what if we provided with the highest number itself so we have to
	return the smallest permutation i.e. reverse the whole array so our that
	purpose is also serving because what we are passing is in our
	reverse array (i+1,arr.length-1) and for highest number i = -1
	so automatically due to the function it will become(0,arr.length-1) .
    */
        reverse(nums, i + 1, nums.length - 1);
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
           swap(nums, i, j);
           i++;
           j--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    }
}

// Output -
/*
Input: nums = [1,2,3]
Output: [1,3,2]
*/

// Approach -
/*
Step 1: Linearly traverse array from backward such that ith index value of the array is less than (i+1)th index value.
 Store that index in a variable.

Step 2: If the index value received from step 1 is less than 0. This means the given input array is the largest
lexicographical permutation. Hence, we will reverse the input array to get the minimum or starting permutation.
Linearly traverse array from backward. Find an index that has a value greater than the previously found index.
Store index is another variable.

Step 3: Swap values present in indices found in the above two steps.

Step 4: Reverse array from index+1 where the index is found at step 1 till the end of the array.

// Logic / Intution
1. a[i] < a[i+1] idx1 = ?
2. a[idx2] > a[idx1]
3. swap (a[idx1], a[idx2])
4. reverse (idx+1, a.length-1)
*/

// Time & Space Complexity -
/*
Time - O(N)
Space - O(1)
*/