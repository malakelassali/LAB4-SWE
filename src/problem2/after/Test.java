package problem2.after;

public class Test {
    public static void main(String[] args) {
        PresetRegistry registry= new PresetRegistry();

        Quote studentPreset= new Quote(
                new Laptop.Builder("i5").ram(8).build()).addService("Setup");

        registry.register("student", studentPreset);

        Quote q1= registry.create("student")
                .forCustomer("SAFI Amal")
                .addService("Extended warranty");
        Quote q2= registry.create("student")
                .forCustomer("ALAMI Samir");

        System.out.println(q1);
        System.out.println(q2);
    }
}