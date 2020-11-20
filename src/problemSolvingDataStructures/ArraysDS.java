/*##############################################################################
 # Date : 11/20/20, 10:22 AM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

package problemSolvingDataStructures;

public class ArraysDS {
    public static void main(String[] args) {
        int[] array = new int[]{6676 ,3216 ,4063, 8373 ,423, 586, 8850, 6762};
        reverseArray(array);
        for(int i : array){
            System.out.print(i + " ");
        }
    }

    static int[] reverseArray(int[] a) {
        for(int i = a.length - 1 , j = 0 ; i >= a.length/2 ; i-- , j++){
            int lastElement = a[i];
            int firstElement = a[j];

            a[j] = lastElement;
            a[i] = firstElement;


        }
        return a;

    }
}
