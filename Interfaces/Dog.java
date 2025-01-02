package Interfaces;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep...");

    } //(Class 'Dog' must either be declared abstract or implement abstract method 'eat()' in 'Animal')
}
