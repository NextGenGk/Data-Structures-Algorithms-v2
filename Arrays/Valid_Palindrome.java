package Arrays;

public class Valid_Palindrome {
    // Is Palindrome Function
    public boolean isPalindrome(String s) {
        // Convert string to lowerCase
        s = s.toLowerCase();
        // Create a StringBuilder object
        StringBuilder b = new StringBuilder();

        // Looping through string character length
        for(int i=0; i<s.length(); i++) {
            // Check, if character is digits or character is letter
            // if yes, then append this character to b
            if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
                b.append(s.charAt(i));
            }
        }
        // Store last value in n variable
        int n = b.length() - 1;
        // Looping through half of the string element
        for(int i=0; i<b.length()/2; i++) {
            // and check, if character at index of i is
            // not equal to last element,
            // then increment i by one & decrement n by one
            // return false
            if(b.charAt(i) != b.charAt(n-i)) {
                i++;
                n--;
                return false;
            }
        }
        // If all the string are matching, return true
        return true;
    }
}

// Output -
/*
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*/

// Algorithm -
/*
1. Convert string to lowerCase
2. Create a StringBuilder object
3. Looping through string character length
4. Check, if character is digits or character is letter
   if yes, then append this character to b
5. Store last value in n variable
6. Looping through half of the string element
   and check, if character at index of i is
   not equal to last element,
   then increment i by one & decrement n by one
   return false
7. If all the string are matching, return true
*/

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
*/