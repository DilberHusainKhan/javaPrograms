import java.lang.*;
public class Array {
    public static void main(String[] args) {
        char a[] = {'a','b','c'};
        float flo[] = {1.0f, 1.1f,1.2f,1.4f};
        for(float i:flo){
        System.out.println(i);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(flo[i]);

        }
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
