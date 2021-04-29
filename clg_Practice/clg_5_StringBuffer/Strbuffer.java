import java.lang.*;
public class Strbuffer {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Dilber Husain Khan");
        //append method
        System.out.println(s.append(" Humayun"));
        //delete method
        System.out.println(s.delete(3, 7));
        //insert method
        System.out.println(s.insert(4, "*****"));
        //reverse method
        System.out.println(s.reverse());
        //capacity method
        System.out.println(s.capacity());

    }
    
}
