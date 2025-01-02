package StaticKeyword;

public class Main {

    /*
    * Static --> used for memory management
    *        --> applied to variable, methods, blocks, and nested classes.
    *        --> the main concept behind static is that it belongs to the
    *            class rather tha instance of class
    *
    *        --> the static method can not use non-static data member and or
    *            call non-static method directly.
    * */

    public static void main(String[] args) {

        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(Student.count);

    }
}
