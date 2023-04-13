package Practice.Patterns;

public class Print_Triangle_IV {

    // Pattern Function
    public static void pattern5(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // Main Function
    public static void main(String[] args) {
        int n =5;
        pattern5(n);
    }
}

// Output -
/*
 * * * * *
 * * * *
 * * *
 * *
 *
 */