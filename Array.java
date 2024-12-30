public class Array {
    public static void main(String[] args) {

        // array stores smilar types of data

        int a = 1;
        int b = 2;
        int c = 3;

        int[] arr; // datatype[] arrayName
         arr = new int[10];
         arr[2] = 20;

         // for each loop

         for(int i : arr){
             System.out.println(i);
         }

         char[] letter = {'a','b','c','d'};
         for (int i = 0 ; i < letter.length ; i++){
             System.out.println(letter[i]);
         }

         // two dimentonal array >> array of array

        int[][] arr1 = new int[3][3];
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int j = 0; j < matrix.length ; j++){
            for(int k = 0; k < matrix.length ; k++){
                System.out.print(matrix[j][k] + " ");
            }
            System.out.println();
        }
    }
}
