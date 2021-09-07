import java.util.Scanner;

public class EvenOddLoop {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Code
        int i = 1;
        while (i <= num) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
            i++;
        }
        System.out.println("Work is Done.");
    }
}
