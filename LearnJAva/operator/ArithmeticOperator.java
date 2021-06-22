public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("-----------(+, -, *, /, % Operator)--------------");
        System.out.println(a+b);  //15
        System.out.println(a-b);  //5
        System.out.println(a*b);  //50
        System.out.println(a/b);  //2
        System.out.println(a%b);  //0

        int simp = 10*10/5+3-1*4/2;
        System.out.println("10*10/5+3-1*4/2 = "+simp); //21 

        
        // int a = 23;
        // int b = 45;
        // int c = a*a +b*b+ 2*a*b;
        // double d = b/a;
        // System.out.println("ans of d "+ d);
        // double e = (double)b/(double)a;
        // System.out.println("ans e divide is "+e+" because of typecasting");
        // double mod = b%a;
        // System.out.println("modulo of a%b is "+mod);
        // System.out.println(c);
        // int c1 = b++;
        // int d1 = ++b;
        // System.out.println(c1+" = "+b);
        // System.out.println(d1+" = "+b);
        // int dec = --a;
        // System.out.println(dec+" ="+a);
    }
}
