import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        // Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter number:");
        int num = sc.nextInt();
        // code
        if (num % 2 == 0) {
            System.out.println(name + " Sir " + num + " is Even because " + num + " is completely divisible by 2. ["
                    + num + "/2] = " + (num / 2));
        } else {
            System.out.println(name + " Sir " + num + " is Odd because " + num + " is not completely divisible by 2. ["
                    + num + "/2] = " + (num / 2) + " and remainder is 1");
        }

    }
}
