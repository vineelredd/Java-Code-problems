interface Mouse{
    void mouse();
    void keyboard();
}
class wiredmouse implements Mouse{
    public void mouse() {
        System.out.println("Wired mouse");
    }
    public void keyboard() {
        System.out.println("Wired keyboard");
    }
}
class wiredkeyboard implements Mouse {
    public void mouse() {
        System.out.println("Wired keyboard");

    }

    public void keyboard() {
        System.out.println("Wired keyboard");
    }
}
class bluetoothkeyboard implements Mouse {
    public void mouse() {
        System.out.println("Bluetooth keyboard");
    }
    public void keyboard() {
        System.out.println("Bluetooth keyboard");
    }
}
class bluethootmouse implements Mouse{
    public void mouse() {
        System.out.println("Bluethoot mouse");
    }
    public void keyboard() {
        System.out.println("Bluethoot keyboard");
    }
}

public class Laptop {
    public static void main(String[] args) {
        wiredkeyboard obj = new wiredkeyboard();
        bluetoothkeyboard obj2 = new bluetoothkeyboard();
        obj2.keyboard();
        obj2.mouse();
        obj.mouse();
        obj.keyboard();

    }
}
