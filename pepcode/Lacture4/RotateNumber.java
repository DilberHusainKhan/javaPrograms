import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Actual Number
        int k = sc.nextInt(); // Rotate At

        // Find Number of digit [nod]
        int nod = 0;
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            nod++;
        }
        System.out.println(nod);
        // after certain rotation result repeated.
        k = k % nod;
        // for negative rotation
        if (k < 0) {
            k += nod;
        }

        int div = 1; // divisor
        int mult = 1; // multiplier
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mult *= 10;
            }
        }
        int q = n / div;
        int r = n % div;
        int ans = (r * mult) + q;
        System.out.println(ans);
    }
}
