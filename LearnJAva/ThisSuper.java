class FirstClass {
    int a;

    FirstClass(int a) {
        this.a = a;
        System.out.println("I am First constructor");
    }
}

class SecondClass extends FirstClass {
    SecondClass() {
        super(4);
        System.out.println("I am second Constructor");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        // FirstClass obj = new FirstClass(5);
        SecondClass oobj2 = new SecondClass();

    }
}