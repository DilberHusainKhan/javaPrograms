import java.util.Scanner;

public class NumberEndWith {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int square = num*num;
       
        String numString = Integer.toString(num);
        String squareString = Integer.toString(square);
       
        if(squareString.endsWith(numString)) {
            System.out.println("Correct Number");
        } else {
            System.out.println("Invalid Number");
        }
    }

}