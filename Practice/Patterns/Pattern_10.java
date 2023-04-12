package Practice.Patterns;

public class Pattern_10 {

    public static void pattern10(int n) {
        // Pattern 2
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Flip Pattern 2
        for (int i=1; i<n; i++) {
            for (int j=n; j>i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern10(n);
    }
}
