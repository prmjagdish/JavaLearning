import java.util.Locale;

public class StringDataType {
    public static void main(String[] args) {

        // String : sequence of characters
        // immutable
        // ways of creating string
        // string is object in java

        String name = new String("Jagdish");
        String name1 = new String("jagdish");
        String myName = "jagdish";
        String myName1 = "jagdish";

        System.out.println(name == myName); // false >> because address are diffrent
        System.out.println(myName == myName1); // true
        System.out.println(name == name1); // false


        // String Methods


        // Methods returns new string

        int nameLength = name.length();
        System.out.println(nameLength);

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        System.out.println(firstChar);
        System.out.println(lastChar);

        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());

        String fullName = "Jagdish Parmar";
        System.out.println(fullName.substring(8));

        String fullName1 = fullName.replace("a","$");
        System.out.println(fullName1);

        System.out.println(fullName1.contains("$"));

        System.out.println(fullName.startsWith("Jagdish"));

        System.out.println(fullName.endsWith("h"));

        for (int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        System.out.println(fullName.indexOf("P"));

        int x = 10;
        int y = 10;
        String s = String.valueOf(x); // int to string
        String s1 = String.valueOf(y); // int to string
        System.out.println( s + s1);
    }
}
