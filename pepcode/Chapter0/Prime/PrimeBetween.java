import java.util.Scanner;

public class PrimeBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            boolean flag = true;
            int div = 2;
            while (div * div <= i) {
                if (i % div == 0) {
                    flag = false;
                    break;
                }
            }
            div++;
            if (flag) {
                System.out.println(i + "\t");
            }
        }
    }
}
