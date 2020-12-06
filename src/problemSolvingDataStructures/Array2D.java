/*##############################################################################
 # Date : 11/24/20, 12:12 AM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

package problemSolvingDataStructures;

public class Array2D {
    public static void main(String[] args) {
        int[][] array = {{1,1,1,0,0,0},
                         {0,1,0,0,0,0},
                         {1,1,1,0,0,0},
                         {0,0,0,0,0,0},
                         {0,0,0,0,0,0},
                         {0,0,0,0,0,0}};
        displayArray2D(array);
        hourglassArray2D(array);
    }

    public static void hourglassArray2D(int[][] array){
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(i % 2 == 0) {
                    sum += array[i][j];
                } else {
                    sum += array[i][1];
                    j = 3;
                }
            }
        }
        System.out.println(sum);
    }

    public static void displayArray2D(int[][] array){
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0; j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
