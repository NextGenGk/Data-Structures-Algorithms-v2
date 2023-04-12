package Practice.Patterns;

public class Pattern_14 {

    public static void pattern14(int n) {
        for (int i=0; i<n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern14(n);
    }
}
