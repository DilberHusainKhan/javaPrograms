import java.util.*;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fn = 0;
        int sn = 1;
        // System.out.print(fn + '\t');
        for (int i = 1; i <= n; i++) {
            int c = fn + sn;
            System.out.print(fn + "\t");
            fn = sn;
            sn = c;
        }
    }
}
