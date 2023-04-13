package Practice.Patterns;

public class Pattern_1 {

    // Pattern Function
    public static void pattern1(int n){
        // This is the outer loop which will loop for the rows.
        for (int i=0; i<n; i++) {
            // This is the inner loop which here, loops for the columns
            // as we have to print a rectangular pattern.
            for (int j=0; j<n; j++) {
                System.out.print("* ");
            }
            // As soon as N stars are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }

    // Main Function
    public static void main(String[] args) {
        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int i = 5;
        pattern1(i);
    }
}

/*
Output

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
 */