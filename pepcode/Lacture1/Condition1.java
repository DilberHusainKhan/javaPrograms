import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {
        // Input Form User
        System.out.println("Enter Your Grade:");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        // Code to find
        if (grade > 90) {
            System.out.println("excellent");
        } else if (grade > 80) {
            System.out.println("very good");
        } else if (grade > 70) {
            System.out.println("fair");
        } else if (grade > 60) {
            System.out.println("meet expectation");
        } else {
            System.out.println("par away");
        }
    }
}
