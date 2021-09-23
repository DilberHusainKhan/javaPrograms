import java.util.*;

public class CountDigit {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int rem = 0;
        int temp = n;
        while (temp > 0) {
            rem = temp % 10;
            temp = temp / 10;
            count++;
        }
        System.out.println(count);
    }
}
