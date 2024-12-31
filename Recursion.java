public class Recursion {

    // Recursion --> when a method call itself
    // work done by iterative approach same as done by recursion

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sumOfNaturalNumber(5));
    }

    public static int factorial(int n){
        // base case
        if ( n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    // call stack

    public static int sumOfNaturalNumber(int n){
        if ( n == 1){
            return 1;
        }
        return n + sumOfNaturalNumber(n - 1);
    }
}
