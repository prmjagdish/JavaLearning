public class Loops {
    public static void main(String[] args) {

        // to do some work repeatedly

        // while loop
        // do-while loop
        // for

        // while

        int i = 0;
        while ( i < 10){
            System.out.println("Hello, World! " + i);
            i++;
        }

        // do while

        do{
            System.out.println(i);
            i++;
        }while(i < 0);

        // for

        for(int k = 1, j = 1 ; j < 6 ; j++, k = k * 10){
            System.out.println(k);
        }

        // Break ang Continue

        System.out.println("Break Example");
        int x = 1;
        while (x < 11){
            if(x == 5){
                break;
            }
            System.out.println(x);
            x++;
        }

        System.out.println("Continue Example");
        int y = 1;
        while (y < 11){
            if(y == 5){
                y++;
                continue;
            }
            System.out.println(y);
            y++;
        }
    }
}
