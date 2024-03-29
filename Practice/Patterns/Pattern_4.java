package Practice.Patterns;

public class Pattern_4 {

    // Pattern Function
    public static void pattern4(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Main Function
    public static void main(String[] args) {
        int n = 5;
        pattern4(n);
    }
}

// Output -
/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */