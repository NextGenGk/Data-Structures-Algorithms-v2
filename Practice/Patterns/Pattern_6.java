package Practice.Patterns;

public class Pattern_6 {

    // Pattern Function
    public static void pattern5(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(j + " ");
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
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */