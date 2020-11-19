/*#############################################################################
 # Date : 11/19/20, 11:13 AM                                                  #
 # Author : Razvii Andre                                                      #
 # HackerRank Profile : https://www.hackerrank.com/Razvii                     #
 # Github Profile : https://github.com/razviiandre                            #
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b#
 #############################################################################*/

public class Day2Operators {
    public static void main(String[] args) {
        solve(10.25,17,5);

    }

    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = meal_cost * tip_percent/100;
        double tax = meal_cost * tax_percent/100;
        double totalCost = (meal_cost + tip + tax);
        System.out.println(Math.round(totalCost));

    }
}
