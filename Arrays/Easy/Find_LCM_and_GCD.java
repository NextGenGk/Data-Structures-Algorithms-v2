package Arrays.Easy;

public class Find_LCM_and_GCD {

    public class Main {
        static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
        public static void main(String[] args) {
            int a = 4, b = 8;
            int ans = gcd(a, b);
            System.out.print("The GCD of the two numbers is "+ans);
        }
    }
}

// Output -
/*
Input: a = 4, b = 8
Output: 4
Explanation: Since 4 is the greatest number which divides both num1 and num2.
 */

// Formula -
/*
Euclidean Algorithm - gcd(b, a % b)
 */

// Logic -
/*
Intuition: Gcd is the greatest number which is divided by both a and b.If a number is divided by both a and b,
it should be divided by (a-b) and b as well.

1. Recursively call gcd(b,a%b) function till the base condition is hit.
2. b==0 is the base condition.When base condition is hit return a, as gcd(a, 0) is equal to a.
 */

// Time & Space Complexity -
/*
Time - O(log(min(a, b)
Space - O(1)
 */