package Practice.Patterns;

public class Pattern_17 {

    // Pattern Function
    public static void pattern17(int n) {
        for (int i=0; i<n; i++) {
            // space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            // characters
            char ch = 'A';
            int breakPoint = (2*i+1)/ 2;
            for (int j=0; j<2*i+1; j++) {
                System.out.print(ch);
                if (j <= breakPoint) ch++;
                else ch--;
            }
            // space
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Main Function
    public static void main(String[] args) {
        int n = 5;
        pattern17(n);
    }
}

// Output -
/*
    A
   ABC
  ABCDC
 ABCDEDC
ABCDEFEDC
 */