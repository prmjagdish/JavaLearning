public class BitwiseOperator {
    public static void main(String[] args) {

        // Bitwise Operator


        // Computer store data in >> 01
        // Operators applied on bits so it is faster than arithemetic

        int a = 5;
        System.out.println(Integer.toBinaryString(a)); // 101
        //000000000 00000000 00000000 00000101

        // operands --> byte short int long (Not applied on Decimal number)

        // and &
        // or |
        // xor ^
        // not ~
        // left shift <<
        // right shift >>
        // unsigned right shift >>>

        int x = 5;
        int y = 4;
        System.out.println("Binary of 5 : " + Integer.toBinaryString(x));
        System.out.println("Binary of 4 : " + Integer.toBinaryString(y));
        System.out.println( x & y); // 4
        System.out.println( x | y); // 5
        System.out.println(x ^ y); // 1
        System.out.println(~x); // -6 (11111111 11111111 11111111 11111010)
        System.out.println(x >> 2); // 1
        System.out.println(x << 2); // 20
    }
}
