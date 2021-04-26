package clg_2;
interface mobile{
    int voltage(int v);
    String modeln(String m);
}
interface usb{
    String usbf(String s);
}

class user implements mobile,usb{
    public int voltage(int v){
        return v;
    }
    public String modeln(String m){
        return m;
    }
    public String usbf(String s){
        return s;
    }
}
class manageinterface{
    public static void main(String[] args) {
        user obj =new user();
        System.out.println(obj.voltage(12));
        System.out.println(obj.modeln("REALME XT"));
    }
}