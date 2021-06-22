public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        System.out.println("------unary ++ AND -- Opreator----------");
        System.out.println(x++);    //10 (11)
        System.out.println(++x);    //12
        System.out.println(x--);    //12 (11)
        System.out.println(--x);    //10
        System.out.println(x++ + ++x);  //(10+12)
        System.out.println(x-- - --x);  //(22 - 20)
        System.out.println(y++ + y++);  //(10+11)

        System.out.println("---------unary ~ AND ! Operator ---------------");
        boolean z = true;
        int a = -10;
        System.out.println(~x);     //-11 (minus of total positive value which starts from 0)
        System.out.println(~a);     //9 (positive of total minus, positive starts from 0)
        System.out.println(!z);     //false because ! get opposite the value.

    }
}
