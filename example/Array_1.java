import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // array ke ander value input kese kare ge
        System.out.println("Enter values in arrays");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // search value input do
        System.out.println("Enter search value");
        int sch = sc.nextInt();

        linearSearch(arr, sch);

        // display
        System.out.println("Display");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void linearSearch(int[] arr, int value) {
        boolean ispresent = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println(value + " is present on index " + i);
                ispresent = true;
                break;
            } else {
                ispresent = false;
            }
        }
        if (!ispresent) {
            System.out.println("Value is not present ");
        }
    }
}
