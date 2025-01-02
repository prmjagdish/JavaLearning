package OOP.Polimorphism;

public class Main {

    //  Polymorphism --> Methods to do different things based on the object it is acting upon
    // (Poly means many and morph form = many forms ) even though the method name and its signature might be the same

    // Two types --> Compile time (Method Overloading)
    //           --> Run time (Method Overriding)

    // Compile time

    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));

        Animal cat = new Cat(); // upper casting
        cat.makeSound();
    }

    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    // run time



}

