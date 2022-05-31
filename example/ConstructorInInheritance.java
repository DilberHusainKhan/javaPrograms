class Base {
    int x;

    Base() {
        System.out.println("I am base class constructor");
    }
}

class Derive extends Base {
    Derive() {
        System.out.println("I am a Derived Class Constructor");
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
        // Base b = new Base();
        Derive d = new Derive();
    }
}
