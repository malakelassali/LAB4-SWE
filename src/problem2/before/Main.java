package problem2.before;

public class Main {
    public static void main(String[] args) {
        Laptop a = new Laptop("i7", 16, 512, false, true);
        Laptop b = new Laptop("i5", -8);
        b.ramGb = 64;
    }
}