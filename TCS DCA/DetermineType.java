import java.util.*;
public class DetermineType {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Character/Digit/Symbol");
        char ch = scan.next().charAt(0);
        scan.close();
       
        if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase character");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase character");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is a symbol");
        }

    }
}