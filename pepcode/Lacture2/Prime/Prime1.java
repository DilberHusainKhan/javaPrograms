import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isprime = true;
        int div = 2;
        while (div * div <= n) {
            int rem = n % div;
            if (rem == 0) {
                isprime = false;
                break;
            }
            div++;
        }
        if (isprime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
