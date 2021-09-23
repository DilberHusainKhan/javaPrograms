import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0) {
            int st = n;
            int sp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < st; j++) {
                    System.out.print("*");
                }
            }
        }
    }
}
