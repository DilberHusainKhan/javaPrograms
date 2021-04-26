package clg_1;
class a{
    int a = 5;
    float b = 5.6f;
    char c = 'A';
    String name = "Dilber Husain Khan";
    //INTEGER method 
    int add(int a1, int b1){
        return a1+b1;
    }
    // Float Method
    float addF( float a2, float b2){
        return a2+b2;
    }
    // String Concatination
    String concatination(String one, String two){
        return one +" "+two;
    }


}

class Program1{
    public static void main(String arg[]){
        a obj = new a();    //object creation 
        System.out.println(obj.name);   // '.' is a member selection operator
        System.out.println(obj.a);   // '.' is a member selection operator
        System.out.println(obj.c);   // '.' is a member selection operator
        System.out.println(obj.b);
        System.out.println(obj.add(5,7));
        System.out.println(obj.addF(5.5f, 6.3f));
        System.out.println(obj.concatination("Dilber", "Husain"));
    }
}