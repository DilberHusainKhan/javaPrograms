import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        // find max number
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }

        // main code
        if (max == a) {
            if ((a * a) == (b * b + c * c)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else if (max == b) {
            if ((b * b) == (a * a + c * c)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            if ((c * c) == (b * b + a * a)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
