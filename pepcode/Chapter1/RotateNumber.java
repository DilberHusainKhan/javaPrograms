import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number you want to rotate. ");
        int n = scn.nextInt();
        System.out.println("Enter number rotation");
        int k = scn.nextInt();
        int nod = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }
        // System.out.println(nod);
        k = k % nod; // is k=nod number is same as original.
        if (k < 0) {
            k = k + nod; // if k is negative like 0-01, -2 ,-3 ...
        }
        int div = 1;
        int mult = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div *= 10;
            } else {
                mult *= 10;
            }
        }
        int q = n / div;
        int r = n % div;
        int ans = r * mult + q;
        System.out.println(ans);
    }
}
