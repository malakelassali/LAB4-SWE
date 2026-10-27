package problem2.after;

import java.util.List;
import java.util.ArrayList;

public class Laptop {
    private final String cpu;
    private final int ramGb, ssdGb;
    private final boolean gpu, backlitKeyboard;
    private final List<String> accessories;

    public static class Builder {
        private final String cpu;
        private int ramGb = 8;
        private int ssdGb = 256;
        private boolean gpu= false;
        private boolean backlitKeyboard= false;
        private List<String> accessories = new ArrayList<>();


        public Builder(String cpu) {
            this.cpu= cpu;
        }

        public Builder ram(int ramGb) {
            this.ramGb= ramGb;
            return this;
        }

        public Builder ssd(int ssdGb) {
            this.ssdGb= ssdGb;
            return this;
        }

        public Builder gpu() {
            this.gpu= true;
            return this;
        }

        public Builder backlitKeyboard() {
            this.backlitKeyboard= true;
            return this;
        }

        public Builder accessory(String a) {
            this.accessories.add(a);
            return this;
        }


        public Laptop build() throws IllegalStateException {
            if (ramGb < 4 || ramGb > 64)  {
                throw new IllegalStateException("RAM should be between 4 and 64 GB");
            }

            if (ssdGb < 128) {
                throw new IllegalStateException(
                        "SSD should be at least 128 GB"
                );
            }

            return new Laptop(this);
        }



    }

    private Laptop(Builder builder) {
        this.cpu= builder.cpu;
        this.ramGb= builder.ramGb;
        this.ssdGb= builder.ssdGb;
        this.gpu= builder.gpu;
        this.backlitKeyboard= builder.backlitKeyboard;
        this.accessories= List.copyOf(builder.accessories);
    }

    @Override
    public String toString() {
        return "Laptop[cpu=" + cpu
                + ", ram=" + ramGb + "GB"
                + ", ssd=" + ssdGb+ "GB"
                + ", gpu=" + (gpu ? "yes" : "no")
                + ", backlit="+ (backlitKeyboard ? "yes" : "no")
                + ", accessories=" + accessories + "]";
    }

}
