import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        int i;
        float f;
        double d;
        String s;
        Scanner in= new Scanner(System.in);

        System.out.println("Enter Your Name Sir ");
        s = in.nextLine();
        System.out.println("Enter your age ");
        i = in.nextInt();
        System.out.println("Enter Your Salary");
        f= in.nextFloat();
        System.out.print("Enter your salary in double");
        d= in.nextDouble();

        System.out.println("your name is: " +s+'\n'+"Your age is " +i+ "\nYour salary is "+f+" ");
    }
}
