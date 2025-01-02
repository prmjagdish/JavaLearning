package OOP.Abstraction;

public class Main {

    // Abstract class  can not instantiate object
    // Child class implement the abstract methods or make child class also abstract
    // protected --> access only extends classes

    public static void main(String[] args) {
        // Animal animal = new Animal(); ('Animal' is abstract; cannot be instantiated)
        Animal dog = new Dog();
        dog.sayHello();
        dog.sleep();
    }
}
