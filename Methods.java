public class Methods {
    public static void main(String[] args) {
        grid("Jagdish");
        int[] myArr = {1,2,3,4,5};
        System.out.println(arrSum(myArr));
        System.out.println(sum1(1,2,34));
        System.out.println(prime(7));
        System.out.println(prime(13));
        System.out.println(prime(20));
    }

    // parameters >> below name, arr

    public static void grid(String name){ // void >> method not return any vPalue
        System.out.println("Hello " + name);
    }

    public static int arrSum(int[] arr){ // return int value
        int res = 0;
        for(int i: arr){
            res+=i;
        }
        return res;
    }

    // method overloading >> name of methods same but the parameters are different
    // metothod name + parameters called signature of method

    public static void sum(int a,int b){
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }

    // variables numbers of arguments

    public static int sum1(int... a){
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        return sum;
    }

    public static boolean prime(int x){
        int res = 0;
        for (int i = 1; i <= x / 2 ; i++) {
            if( x % i == 0){
                res++;
            }
        }
        return res == 1;
    }

}
