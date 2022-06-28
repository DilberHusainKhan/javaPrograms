/**
 * InnerInterface
 */
interface Bike {
    int applyBreak(int decrement);

    int speedUp(int increment);
}

interface UpdateBike {
    void display();

    void charging(boolean ischarging);

}

class Hero implements Bike, UpdateBike {
    int speed = 7;

    public int applyBreak(int decrement) {
        speed = speed - decrement;
        return speed;
    }

    public int speedUp(int increment) {
        speed = speed + increment;
        return speed;
    }

    public void display() {
        System.out.println("Updated Display features");
    }

    public void charging(boolean ischarging) {
        System.out.println(ischarging);
    }
}

public class Interface {
    public static void main(String[] args) {
        Bike obj = new Hero();
        UpdateBike obj1 = new Hero();
        System.out.println(obj.applyBreak(3));
        System.out.println(obj.speedUp(7));
        obj1.display();
        obj1.charging(true);
    }
}
