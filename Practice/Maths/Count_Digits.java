package Practice.Maths;

public class Count_Digits {

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            int lastDigits = n % 10;
            count += 1;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 7789;
        int result = countDigits(n);
        System.out.println(result);
    }
}

// Algorithm -
/*
1. It initializes a variable called count to 0. This variable will keep track of the number of digits in the input integer n.
2. The code enters a while loop that continues as long as n is greater than 0.
3. Inside the loop, it finds the last digit of the number n by calculating the remainder of n divided by 10. This is done using the modulus operator %. For example, if n is 123, then lastDigits will be 3 on the first iteration of the loop.
4. It increments the count variable by 1, indicating that it has found one more digit in the input number.
5. It updates the value of n by dividing it by 10, discarding the last digit that was just found. For example, if n was 123 and the last digit was 3, then n is updated to 12 on the first iteration of the loop.
6. The loop repeats until n is less than or equal to 0, at which point it exits the loop.
7. The method returns the final value of count, which represents the number of digits in the original input integer n.
 */