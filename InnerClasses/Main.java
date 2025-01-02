package InnerClasses;

public class Main {
    public static void main(String[] args) {

        /* 1. Member inner class --> ex. car
         * 2. Static nested class --> ex. computer
         * 3. Local inner class --> ex hotel
         * 4. Anonymous inner class --> ex shopping cart (create one time use implementation object)
         */

        // Member inner class

        Car car = new Car("Safari");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();

        // Static nested class

        Computer computer = new Computer("HP","ABC","XYZ");
        computer.getOs().displayInfo();
        Computer.USB usb = new Computer.USB("TYPE-C");
        System.out.println(usb.getType());

        // Anonymous inner class
        ShoppingCart shoppingCart = new ShoppingCart(200);
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " using credit card");
            }
        });

        // Local inner class

        Hotel hotel = new Hotel("Taj Hotel",10,7);
        hotel.reservedRooms("Jagdish",3);
        hotel.reservedRooms("Jay",1);
    }
}
