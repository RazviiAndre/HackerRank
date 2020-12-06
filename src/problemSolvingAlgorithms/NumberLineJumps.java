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
        System.out.println(kangaroo(0,2,5,3));
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
       // x1 starting point first kangaroo
      // x2 starting point second kangaroo
        // v1 jump distance rate first kangaroo
        // v2 jump distance rate second kangaroo

        String response = "NO";
        boolean canCatchUp = (v2 < v1);
        if(canCatchUp) {
            boolean willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0;
            if(willIntersectOnLand) {
                response = "YES";
            }
        }
        return response;
    }
}
