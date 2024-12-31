package OOP.Basic;

// Object Orintend Programming is paradime of programing which
// deal with classes and objects

// class >> is a blueprint of object
//       >> consist properties and behaviours

// four pillars of OOP

/*
*   1. Encapulation >> Bundling of data and Methods into a single "unit" = class
*                   >> Data hiding
*
*   2. Inheritance  >> A class can access the propertices and methods of its parent class / super class >> achive by "extend"
*
*   3. Polymorphism >> subclass object can assign as referance of its super class
*
*   4. Abstraction >> hiding implimentation details
*
* */

public class Main {

    // properties (fileds / variable)

    private String color; // hide data using private
    private String brand;
    private String model;
    private int year;
    private int speed;


    // behaviours (methods)

    public void accelerate(int increament){
        speed += increament;
    }

    public void brake(int decrement){
        speed -= decrement;
        if(speed < 0){
            speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Main Main = new Main();

        Main.setSpeed(20);
        Main.accelerate(1);
        System.out.println(Main.getSpeed());

        Cat tomy = new Cat();
        tomy.name = "Tomy";
        tomy.age = 5;
        System.out.println(tomy.name);

        // polymorphism
        Animal jenny = new Cat();
        jenny.makeSound();
    }
}
