import java.util.*;

public class ReverseNumber {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            temp = temp / 10;
            System.out.println(rem);
        }

    }
}