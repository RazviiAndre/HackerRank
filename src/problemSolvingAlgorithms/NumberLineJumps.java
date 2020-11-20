/*##############################################################################
 # Date : 11/19/20, 8:19 PM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

package problemSolvingAlgorithms;

public class NumberLineJumps {
    public static void main(String[] args) {

    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if(x1 > x2 && v1 > v2){
            return "NO";
        } else if(x1 < x2 && v1 < v2){
            return "YES";
        }


        return "";
    }
}
