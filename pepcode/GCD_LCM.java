import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two number from which you want to get GCD & LCM. ");
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int tn1 = n1, tn2 = n2;
        while (tn1 % tn2 != 0) {
            int rem = tn1 % tn2;
            tn1 = tn2;
            tn2 = rem;
        }
        int gcd = tn2;
        int lcm = n1 * n2 / gcd;
        System.out.println("Gratst Common Divisor is " + gcd);
        System.out.println("Least Common Multiple is " + lcm);
    }
}
