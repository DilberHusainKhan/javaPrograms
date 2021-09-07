import java.util.Scanner;

public class ThreeK {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        // Code
        if (num % 3 == 0) {
            System.out.println(num + " is in 3K");
        } else if (num % 3 == 1) {
            System.out.println(num + " is in 3K+1");
        } else {
            System.out.println(num + " is in 3K+2");
        }
    }
}
