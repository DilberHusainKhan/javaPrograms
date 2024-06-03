import java.util.Scanner;

// Write a program to find multiplication of a given number
public class FindMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r,sum=1;
        while(num>0){
            r=num%10;
            sum = sum*r;
            num/=10;
        }
        System.out.println(sum);
    }
}
