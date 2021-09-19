import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean count = true;

        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count = false;
                    break;
                }
            }
            if (count) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
