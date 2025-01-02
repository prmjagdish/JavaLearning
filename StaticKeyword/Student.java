package StaticKeyword;

public class Student {

    public static int count = 0; // shared by all object (common for all objects)

    // static block ( to perform static initialization )

    static {
        System.out.println("This is executed from static block");
    }

    public Student(){
        count++;
    }

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
