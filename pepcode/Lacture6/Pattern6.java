/*
n=5
*       *       *               *       *       *       
*       *                               *       *
*                                               *
*       *                               *       *       
*       *       *               *       *       *

*/

import java.util.*;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 1;
        int nstr = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
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
