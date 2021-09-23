import java.util.*;

public class PrintDigit {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 1;
        int temp = n;

        while (temp >= 10) { // (= is use for exceptional case like 10000)
            temp /= 10;
            div *= 10;
        }
        while (div >= 1) {
            int q = n / div;
            int r = n % div;
            System.out.println(q);
            n = r;
            div /= 10;
        }
    }
}