import java.lang.*;
import java.util.*;
public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name");
        String name = sc.nextLine();
        System.out.println(name+" Sir.");
    }
}