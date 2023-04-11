package Practice.Patterns;

public class Pattern_9 {

    public static void pattern9(int n) {
        // Pattern 7
        for (int i=0; i<n; i++) {
            // space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            // space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // Pattern 8
        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<2*n - ((2 * i) + 1); j++) {
                System.out.print("*");
            }
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern9(n);
    }
}
