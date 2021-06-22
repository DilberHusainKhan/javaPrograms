public class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println("------------AND---------------");
        int a = 5;      //5 -> 101
        int b = 6;      //6 -> 110
        int c = a & b;  //a&b -> 100 ->4
        System.out.println("AND of "+a+" & "+b+" -> "+c);
        
        System.out.println("------------OR-----------------");
        int d = 10; //10  -> 1010
        int e = 15; //15  -> 1111
        int f = d | e;// 10 |15 -> 1111 ->15
        System.out.println("OR of "+d+" | "+e+" -> "+f);

        System.out.println("----------Right Shift----------");
        // 1101 ->RS-> 0110 ->RS->0011 ->RS->0001 ->RS-> 0000
        // 13   ->      6   ->      3   ->     1    ->      0
        // number divide by 2 and we take celling value in right shift
        int g = 13;
        int h = g >> 1;
        System.out.println("Right shift of "+g+" is "+h);  

        System.out.println("------------Left Shift--------------");
        // 0001 -LS> 0010 -LS> 0100 -LS> 1000
        // 1    -LS>  2   -LS>  4   -LS>  8
        // number is multiply by 2 in Left Shift.
        int i = 2<<1;
        System.err.println("Left Shift of 2 is "+i); 
    }
}
