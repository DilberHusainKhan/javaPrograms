import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scn.nextInt();
        int nsp = 1;
        int nstr = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i <= n / 2) {
                nstr--;
                nsp += 2;
            } else {
                nstr++;
                nsp -= 2;
            }
        }
    }
}
