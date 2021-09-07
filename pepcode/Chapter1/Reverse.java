import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n != 0) {
            int q = n / 10;
            int rem = n % 10;
            System.out.print(rem);
            n = q;
        }
    }
}
