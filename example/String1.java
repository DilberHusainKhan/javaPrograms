import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        {
            String s1 = "Lutfa";
            String s2 = "Lutfa";
            String s3 = new String("Lutfa");
            System.out.println(s1 == s2);
            System.out.println(s1 == s3);
            System.out.println(s1.equals(s3));
            System.out.println(s1.charAt(0));
        }
    }
}