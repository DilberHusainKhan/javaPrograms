abstract class Parent {
    public Parent() {
        System.out.println("I am a constructor");
    }

    abstract void greet();
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Hii, Good Morning");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.greet();
    }
}
