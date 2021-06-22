import javax.annotation.processing.SupportedSourceVersion;

public class ShiftOperator {
    public static void main(String[] args) {
        System.out.println("-------------Left Shift Operator [ << ]---------------");
        // 0001 -LS> 0010 -LS> 0100 -LS> 1000
        // 1    -LS>  2   -LS>  4   -LS>  8
        // number is multiply by 2 in Left Shift.

        System.out.println(10<<1);  //10*2 = 20 
        System.out.println(10<<2);  //10*2^2 = 40
        System.out.println(10<<3);  //10*2^3 = 80
        System.out.println(20<<2);  //20*2^2 = 80
        System.out.println(15<<4);  //15*2^4 = 240

        System.out.println("------------Right Shift Operator [ >> ]---------------");
        // 1101 ->RS-> 0110 ->RS->0011 ->RS->0001 ->RS-> 0000
        // 13   ->      6   ->      3   ->     1    ->      0
        // number divide by 2 and we take celling value in right shift

        System.out.println(10>>2);  // 10/2^2 = 2
        System.out.println(20>>3);  // 20/2^3 = 2
        System.out.println(20>>2);  // 20/2^2 = 5
        System.out.println(40>>2);  //40/2^2 = 10

        System.out.println("------------------[ >>  V/S >>> ]---------------------");
        // For Positive number, >> and >>> are work same.
        System.out.println(20>>2);
        System.out.println(20>>>2);
        // For negative number, >>> changes Parity bit (MSB) to 0.
        System.out.print("-20 >> 2  = ");
        System.out.println(-20>>2);
        System.out.print("-20 >>> 2 = ");
        System.out.println(-20>>>2);

    }
}
