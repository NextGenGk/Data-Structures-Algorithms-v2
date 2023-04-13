package Practice.Patterns;

public class Pattern_18 {

    public static void pattern18(int n) {
        for (int i=0; i<n; i++) {
            for (char ch = (char)('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern18(n);
    }
}
