package Interfaces;

public interface Animal {

    int maxAge = 15; // ( redundant >> public static final int maxAge = 15;)

    public abstract void eat();
    void sleep();

    static void info(){
        System.out.println("This is an animal Interface");
    }

    default void run(){
        this.eat();
        System.out.println("Animal is running");
    }

}
