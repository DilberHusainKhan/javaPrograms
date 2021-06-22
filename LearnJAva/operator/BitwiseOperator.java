public class BitwiseOperator {
    public static void main(String[] args) {
        
        System.out.println("------------ Bitwise AND [ & ]---------------");
        int a = 5;      //5 -> 101
        int b = 6;      //6 -> 110
        int c = a & b;  //a&b -> 100 ->4
        System.out.println("AND of "+a+" & "+b+" -> "+c);
        
        System.out.println("------------Bitwise OR [ | ]-----------------");
        int d = 10; //10  -> 1010
        int e = 15; //15  -> 1111
        int f = d | e;// 10 |15 -> 1111 ->15
        System.out.println("OR of "+d+" | "+e+" -> "+f);

        System.out.println("---------Logical AND [&&] V/s Bitwise AND [&]--------");
        /*
            The logical && operator doesn't check second condition if first condition is false. 
            It checks second condition only if first one is true.
            
            The bitwise & operator always checks both conditions whether 
            first condition is true or false. 
        */
        a=10;
        b=5;
        c=20;
        System.out.println(a<b && a<c); //false && true = false
        System.out.println(a>b & a>c);  //true & false = false
 
        System.out.println(a<b&&a++<c); //false && true = false  
        System.out.println(a);  //10 because second condition is not checked  

        System.out.println(a<b&a++<c);  //false && true = false  
        System.out.println(a); //11 because second condition is checked.
        
        System.out.println("---------Logical OR [ || ] V/s Bitwise OR [ | ]---------");
        /*
            The logical || operator doesn't check second condition if first condition is true. 
                It checks second condition only if first one is false.
            The bitwise | operator always checks both conditions whether first condition is true or false.
        */
        a=10;
        System.out.println(a>b||a<c);//true || true = true  
        System.out.println(a>b|a<c);//true | true = true  
        //|| vs |
        System.out.println(a>b||a++<c);//true || true = true  
        System.out.println(a);//10 because second condition is not checked  
        
        System.out.println(a>b|a++<c);//true | true = true  
        System.out.println(a);//11 because second condition is checked  

    }
}
