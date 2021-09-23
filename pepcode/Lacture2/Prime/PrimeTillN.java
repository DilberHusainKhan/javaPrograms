import java.util.Scanner;

public class PrimeTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            int div = 2;
            while (div * div <= i) {
                if (i % div == 0) {
                    flag = false;
                    break;
                }
                div++;
            }
            if (flag) {
                System.out.println(i + "\t");
            }
        }
    }
}
