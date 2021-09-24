import java.util.*;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n / 2;
        int nstr = 1;
        int nsp1 = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= nsp1; nsp1++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i <= n / 2 + 1) {
                nsp--;
                nstr = 1;
                nsp1 += 2;
            } else if (i == 1 || i == n) {
                nstr = 1;
            } else {
                nsp++;
                nstr = 2;
                nsp1 -= 2;
            }
        }

    }
}
