public class ConsolePrintMethod {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println("Sum of " + a + " & " + b + " : " + c);
        System.out.print("Sum of " + a + " & " + b + " : " + c + "\n");
        System.out.printf("Sum of %d and %d : %d \n",a,b,c);

        String name = "Jagdish";
        char ch = 'z';
        float pi = 3.14f;
        System.out.printf("%c \n",ch);
        System.out.printf("%s \n",name);
        System.out.printf("%.2f \n",pi);
    }
}
