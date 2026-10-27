package problem2.after;

import java.util.ArrayList;
import java.util.List;

public class Quote {
    private String customer;
    private final Laptop laptop;
    private List<String> services;

    public Quote(Laptop laptop) {
        this.laptop= laptop;
        this.services= new ArrayList<>();
    }

    private Quote(Quote src) {
        this.customer= src.customer;
        this.laptop= src.laptop;
        this.services= new ArrayList<>(src.services);
    }

    public Quote forCustomer(String name) {
        this.customer= name;
        return this;
    }

    public Quote addService(String service) {
        services.add(service);
        return this;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public Quote copy() {
        return new Quote(this);
    }

    @Override
    public String toString() {
        return "Quote for " + customer + ": services=" + services;
    }
}
