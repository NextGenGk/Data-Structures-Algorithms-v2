package Practice.Patterns;

public class Pattern_15 {

    // Pattern Function
    public static void pattern15(int n) {
        for (int i=0; i<n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n-i-1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // Main Function
    public static void main(String[] args) {
        int n = 5;
        pattern15(n);
    }
}

// Output -
/*
A B C D E
A B C D
A B C
A B
A
 */