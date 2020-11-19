/*##############################################################################
 # Date : 11/19/20, 11:25 AM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

public class Main {
    public static void main(String[] args) {
        int b = 43;
        int lastN = b % 10;
        System.out.println(lastN);

        if (lastN >= 3 && lastN < 5) {
            b+=2;
        } else if( lastN > 7 && lastN <= 9){
            b+=2;
        }
        int result = b;
        System.out.println(result);

    }
}
