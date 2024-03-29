package Practice.Patterns;

public class Pattern_12 {

    // Pattern Function
    public static void pattern12(int n) {
        int space = 2 * (n-1);
        for (int i=1; i<=n; i++) {
            // numbers
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            // space
            for (int j=1; j<= space; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
            space = space - 2;
        }
    }

    // Main Function
    public static void main(String[] args) {
        int n = 5;
        pattern12(n);
    }
}

// Output -
/*
1        1
12      21
123    321
1234  4321
1234554321
 */