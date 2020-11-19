/*##############################################################################
 # Date : 11/19/20, 11:16 AM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

public class Day3ConditionalStatements {
    public static void main(String[] args) {
        oddOrEven(3);
    }
    public static void oddOrEven(int n){
        StringBuilder string = new StringBuilder();
        if(n % 2 != 0){
            string.append("Weird");
        } else if (n >= 2 && n <= 5){
            string.append("Not Weird");
        } else if (n % 2 == 0 && n >= 6 && n <=20){
            string.append("Weird");
        } else if (n % 2 == 0 && n >= 20){
            string.append("Not Weird");
        }
        System.out.println(string);
    }
}
