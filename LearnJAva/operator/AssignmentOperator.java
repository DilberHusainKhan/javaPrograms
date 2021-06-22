public class AssignmentOperator {
    public static void main(String[] args) {
        // -= , +=, *=  /+  &=  %=  |=  >>= <<=

        int a =10;
        int b = 20;      
        a+=4;   //a=a+4 (a=10+4) = 14  
        b-=4;   //b=b-4 (b=20-4) = 16 
        System.out.println(a);  
        System.out.println(b);  
        a*=2;//14*2 = 28 
        System.out.println(a);  
        a/=2;// 28/2 = 14  
        System.out.println(a);
        System.out.println("-------------------------------------");
        short x=10;  
        short y=10;  
        x+=y;
        System.out.println(x);
        //x=x+y internally so fine  
        // x=x+y;        // Compile time error because 10+10=20 now int  
        x = (short)(x+y);
        System.out.println(x);
    }
}
