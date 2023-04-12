package Practice.Patterns;

public class Pattern_16 {

    public static void pattern16(int n) {
        // Outer loop for the number of rows.
        for(int i=0;i<n;i++){


            for(int j=0;j<=i;j++){

                // same char which is defined
                // is to be printed i times in that row.
                System.out.print((char)((int)('A'+i)) + " ");

            }
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern16(n);
    }
}
