import java.util.*;

public class PrimeFactrization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // main code
        for (int f = 2; f * f <= n; f++) {
            while (n % f == 0) {
                System.out.print(f + " ");
                n /= f;
            }
        }
        if (n > 1) {
            System.out.print(n + " ");
        }
    }
}
