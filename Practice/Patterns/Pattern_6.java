package Practice.Patterns;

public class Pattern_6 {

    public static void pattern5(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int i =5;
        pattern5(i);
    }
}
