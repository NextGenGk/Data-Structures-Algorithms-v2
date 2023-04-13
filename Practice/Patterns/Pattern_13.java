package Practice.Patterns;

public class Pattern_13 {

    // Pattern Function
    public static void pattern13(int n) {
        int num=1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    // Main Function
    public static void main(String[] args) {
        int n = 5;
        pattern13(n);
    }
}

// Output -
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */