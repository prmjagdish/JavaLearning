package InnerClasses;
public class Computer {

    private String brand;
    private String model;
    private OperatingSystem os;

    public OperatingSystem getOs() {
        return os;
    }

    public Computer(String brand, String model, String osname) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osname);
    }

    static class USB{ // not a part of instance (no dependency)
         private String type;

         public USB(String type) {
             this.type = type;
         }

         public String getType() {
             return type;
         }
    }

     class OperatingSystem{
        private String osname;

        public OperatingSystem(String osname) {
            this.osname = osname;
        }

        public String getOsname() {
            return osname;
        }

        public void displayInfo(){
            System.out.println("Computer Model: "+ model + ", OS: " + osname);
        }
    }


}
