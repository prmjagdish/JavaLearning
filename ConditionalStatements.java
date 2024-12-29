public class ConditionalStatements {
    public static void main(String[] args) {

        // Relational Operator
            // compare two values and return boolean result

        int jayMarks = 98;
        int jagdishMarks = 99;
        int maulikMarks = 100;

        System.out.println(jagdishMarks > jayMarks);
        System.out.println(jayMarks < jagdishMarks);
        System.out.println(jagdishMarks != jayMarks);
        System.out.println(jagdishMarks == maulikMarks);
        System.out.println(jagdishMarks <= maulikMarks);
        System.out.println(jagdishMarks >= jayMarks);


        // Logical Operator
            // compare two condition
            // && logical AND
            // || logical OR
            // ! logical NOT

        int jagdishAge = 20;
        System.out.println(jagdishMarks > 50 && jagdishAge > 18);

        boolean con1 = true;
        boolean con2 = false;
        System.out.printf("OR : %b \n",con1 || con2);

        // if

        if (jagdishAge > 18){
            System.out.println("You can give exame");
        }

        // if - else

        if (jagdishAge > 21){
            System.out.println("You can give exame");
        }else{
            System.out.println("Sorry");
        }

        // if ladders

        int marks = 75;
        if(marks >= 90){
            System.out.println("Grade A");
        }else if(marks >= 70){
            System.out.println("Grade B");
        }else if(marks >= 50){
            System.out.println("Grade C");
        }

        // Switch
        int day = 1;
        switch (day){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }
            default:{
                System.out.println("Please enter valid input");
            }
        }
    }
}
