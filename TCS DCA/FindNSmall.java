import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FindNSmall {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner  sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            int number = sc.nextInt();
            num.add(number);
        }

        System.out.println("Enter nth smaller position");
        int k = sc.nextInt();
        // sort
        Collections.sort(num);

        System.out.println(num.get(k-1));
    }
}
