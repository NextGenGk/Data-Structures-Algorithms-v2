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
