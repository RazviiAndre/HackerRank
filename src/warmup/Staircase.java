/*#############################################################################
 # Date : 11/19/20, 11:14 AM                                                  #
 # Author : Razvii Andre                                                      #
 # HackerRank Profile : https://www.hackerrank.com/Razvii                     #
 # Github Profile : https://github.com/razviiandre                            #
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b#
 #############################################################################*/

package warmup;

public class Staircase {
    public static void main(String[] args) {
//        staircase(30);
        staircase2(5);
    }
    static void staircase2(int n ){
        for(int i = 1 ; i <= n ; i++){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('#').setLength(i);
            System.out.println(stringBuilder);
        }
    }
    static void staircase(int n) {
        StringBuilder stair = new StringBuilder(n - 1);
        stair.append(" ".repeat(Math.max(0, n)));
//
//        stair.replace(6,6,"#");
//        System.out.println(stair);
//        stair.replace(5,6,"#");
//        System.out.println(stair);
//        stair.replace(4,6,"##");
//        System.out.println(stair);
//        stair.replace(3,6,"###");
//        System.out.println(stair);
//
        String diezAppend = "#";
        for (int i = 1; i < n + 1; i++) {
            stair.replace(n - i, n + i, diezAppend);
            System.out.print(stair + "\n");
            diezAppend += "#";
        }
    }
}
