public class Pattern_21 {

    // Pattern Function
    public static void pattern21(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    // Main Function
    public static void main(String[] args) {
        int n = 5;
        pattern21(n);
    }
}

// Output -
/*
*****
*   *
*   *
*   *
*****
 */