public class Arithemtic {
    public static void main(String[] args) {

        // Aritemetic Operator


        int yourSalary = 1000;
        int deduction = 500;
        int monthlyTotal = yourSalary - deduction;
        int yearlyTotal = yourSalary * 12;
        int perChild = yearlyTotal/3;
        System.out.println(perChild);

        int a = 5;
        int b = 2;
        int remainder = a % b;
        System.out.println(remainder);

        int i = a / b;
        System.out.println(i);

        float v1 = a / (float) (b);
        System.out.println(v1);

        int value1 = 10;
        double value2 = 11.1;
        double v = value1 + value2;
        System.out.println(v);

        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero

        System.out.println(value1 % 0);
        System.out.println(value1 / 0);
         */


        // Operator Precidenace


        // Same precidenace Left To Right
        //1. ++, --
        //2. *,/,%
        //3. +,-
        int mango = 10;
        int apple = 5;
        int total = mango * 2 +  apple * 5;
        System.out.println(total);

        mango += 20; // mango = mango + 20 >> compound assign operator
        System.out.println(mango);


        // Increment & Decrement


        mango++; // post increment operator or postfix
        // value use than increment
        System.out.println(mango);
        ++apple; // pre increment operator or prefix
        // increment value than use
        System.out.println(apple);

        // example
        int z = 1;
        System.out.println(z++ + --z); // 2
        System.out.println(++z + --z); // 3
        System.out.println(z++ + z++); // 3
        System.out.println(z++ + z++ - --z); // 3
    }
}
