import java.util.Scanner;

public class Array_binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int search = sc.nextInt();

        binarySearch(arr, search);

    }

    public static void binarySearch(int[] arr, int svalue) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (svalue < arr[mid]) {
                right = mid - 1;
            } else if (svalue > arr[mid]) {
                left = mid + 1;
            } else {
                System.out.println(arr[mid] + " is present is at index " + mid);
                break;
            }
        }
    }
}
