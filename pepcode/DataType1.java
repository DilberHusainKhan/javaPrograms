public class DataType1 {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        // sum
        int sum = x + y;
        System.out.println("Sum of " + x + " and " + y + " is " + sum);
        // Product
        int pro = x * y;
        System.out.println("Product of " + x + " and " + y + " is " + pro);
        // x/y, y/x, x%y
        int v1 = x / y;
        int v2 = y / x;
        int v3 = x % y;
        System.out.println("X/y is " + v1 + ", y/x is " + v2 + " and X%y is " + v3);

        // Expresion
        int exp = x * y / x + y;
        System.out.println("with out Bracket output is " + exp);
        int exp1 = (x * y) / (x + y);
        System.out.println("Expresion with Bracket is " + exp1);
    }
}
