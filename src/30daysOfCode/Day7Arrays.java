/*##############################################################################
 # Date : 11/25/20, 1:41 PM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

public class Day7Arrays {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,4,2};

        for(int i = 0, j = arr.length-1; i < arr.length/2; i++, j--){
            int firstElement = arr[i];
            int lastElement = arr[j];

            arr[i] = lastElement;
            arr[j] = firstElement;
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
