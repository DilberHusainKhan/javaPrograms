import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1; // place.
        int inv = 0; // invere
        while (n > 0) {
            int r = n % 10;
            int q = n / 10;
            n = q;
            // main solution
            // r @ p -> p @ r = p*pow(10, r-1)
            inv = inv + p * (int) Math.pow(10, r - 1);
            p++;
        }
        System.out.println(inv);
    }
}
