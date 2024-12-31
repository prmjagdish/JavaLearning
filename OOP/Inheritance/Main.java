package OOP.Inheritance;

public class Main{
    public static void main(String[] args) {

        // super class properties and methods are derived by its base class
        Dog dog = new Dog();
        dog.name = "bob"; // This property derived from Animal class
        dog.say();

        // base class called first its super classes constructor

        Child child = new Child();
        child.childMethod();

        // single , multilevel, hierarchical --> types of inheritance

        // super() , super.property, super.method --> this refers to its imitate parent class

        // this --> point to the current object

        // same method name with different definition in its base class --> method overriding (good to mention annotation @overriding)

        // java does not support multiple inheritance (a base class can not extend multiple super classes) --> it can achieve by interfaces
    }
}
