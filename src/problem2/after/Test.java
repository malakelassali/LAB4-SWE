
package problem2.after;

public class Test {
    public static void main(String[] args) {
        Laptop laptop= new Laptop.Builder("i7").ram(16).ssd(512)
                .backlitKeyboard().accessory("Mouse").build();
        System.out.println(laptop);

        try {
            Laptop invalid= new Laptop.Builder("i5").ram(-8).build();
        } catch (IllegalStateException e) {
            System.out.println("Invalid laptop: " + e.getMessage());
        }

        PresetRegistry registry= new PresetRegistry();
        Laptop studentLaptop= new Laptop.Builder("i5").ram(8).build();

        Quote studentPreset= new Quote(studentLaptop).addService("Setup");
        registry.register("student", studentPreset);

        Quote q1= registry.create("student").forCustomer("SAFI Amal")
                .addService("Extended warranty");

        Quote q2= registry.create("student").forCustomer("ALAMI Samir");

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q1.getLaptop() == q2.getLaptop());
    }
}
