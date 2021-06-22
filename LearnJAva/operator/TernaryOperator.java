public class TernaryOperator {
    public static void main(String[] args) {
        /*
        Java Ternary operator is used as one liner replacement for if-then-else statement 
            and used a lot in Java programming. 
        it is the only conditional operator which takes three operands.
        */
        int a = 5;
        int b = 10;
        int min = (a>b)?b:a;
        System.out.println(min);
        int num = 1;
        String chs = (num==2)?"banana":"Apple";
        System.out.println(chs); 
    }
}
