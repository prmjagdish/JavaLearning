package Interfaces;

import Interfaces.MultipleInheritances.SmartPhone;

public class Main {

    /*
    * Java does not support multiple inheritance this is solved by interfaces
    * Class --> Blueprint for object
    * Interfaces --> Blueprint for class (consist abstract methods and static variable )
    * two use cases --> Multiple inheritance
    *               --> Pure abstraction achieve
    * static methods in interface
    * default methods in interfaces  --> inherit by implemented classes
    *
    * */

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        System.out.println(dog.maxAge);
        System.out.println(Animal.maxAge);

        Animal.info(); // static method
        dog.run(); // default method

        // Multiple Inheritance
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.clickedPhoto();
        smartPhone.makecall();
        smartPhone.playMusic();

    }
}
