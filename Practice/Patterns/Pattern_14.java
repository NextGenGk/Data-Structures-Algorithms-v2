package Practice.Patterns;

public class Pattern_14 {

    // Pattern Function
    public static void pattern14(int n) {
        for (int i=0; i<n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // Main Function
    public static void main(String[] args) {
        int n = 5;
        pattern14(n);
    }
}

// Output -
/*
A
A B
A B C
A B C D
A B C D E
 */