public class Armstrong_Number {

    // Optimal Approach
    static boolean armstrong (int n) {
        int sum = 0;
        int dup = n;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            n = n / 10;
        }
        if (dup == sum) {
            return true;
        }
        else {
            return false;
        }
    }

    // Main Function
    public static void main(String[] args) {
        boolean result = armstrong(170);
        System.out.println(result);
    }
}

