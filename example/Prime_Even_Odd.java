import java.util.Scanner;

public class Prime_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is Even");
            } else {
                System.out.println(arr[i] + " is odd");
            }

            Prime(arr[i]);
        }

    }

    public static void Prime(int n) {
        int div = 2;
        while (div * div <= n) {
            if (n % div == 0) {
                System.out.println(n + " is not prime");
                break;
            } else {
                System.out.println(n + " is prime number");
            }
            div++;
        }
    }
}
