/*##############################################################################
 # Date : 12/3/20, 6:54 PM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

package javaIntroduction;

import java.time.LocalDate;

public class JavaDateAndTime {
    public static void main(String[] args) {
        findDay(8,5,2015);

    }

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year,month,day);
        String days = String.valueOf(localDate.getDayOfWeek());
        System.out.println(days);
        return "";
    }
}
