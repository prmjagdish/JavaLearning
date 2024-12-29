public class Variables {
    public static void main(String[] args) {
        // Integral Numbers
        // What is differance ? >> Capacity to store data
        // java read number by default as integer
            // byte
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
            // short
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
            // int
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
            // long
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        long myLong = 2147483647;
        //long myLong = 2147483648;
        long myLong1 = 2147483648L;
        System.out.println(myLong1);


        // decimal number
        // by default double
            // float
        //float mySalary = 1000.43246364; >> Error
        float mySalray = 1000.7537337f;
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
            // double
        double mySalaray = 1000.76485654651887;
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        // character
            // char
        char myChar = 'j';
        char myNumber = '7';
        char mySymbol = '@';
        char heart = '\u2764';
        System.out.println((int) mySymbol); // Narrowing Conversion
        System.out.println((char) 64); // Narrowing Conversion
        System.out.println((char) 10084); // Narrowing Conversion
        System.out.println(heart);

        // Ascii >> subset of unicode
        for(int i=0; i <= 127; i++){
            System.out.println((char) i);
        }

        // Boolean
            //bool
        boolean isPass = true;
        boolean isFail = false;

        int a = 10; // 4 bytes
        long b = a; // 8 bytes
        float c = a; // 4 bytes
        double d = a;
        // Big data type cantair shorter than its or compatiable

        //int e = b; Error >> Required type int
        int e = (int) b;

        // Widening Conversion or implicit or automatic
        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double douableValue = floatValue;
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + douableValue);
    }
}
