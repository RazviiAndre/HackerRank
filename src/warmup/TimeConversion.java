/*#############################################################################
 # Date : 11/19/20, 11:15 AM                                                  #
 # Author : Razvii Andre                                                      #
 # HackerRank Profile : https://www.hackerrank.com/Razvii                     #
 # Github Profile : https://github.com/razviiandre                            #
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b#
 #############################################################################*/

package warmup;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("12:00:00AM"));
    }

    static String timeConversion(String s) {
        LocalTime localTime = LocalTime.parse(s,DateTimeFormatter.ofPattern("hh:mm:ssa"));
        return localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
    }
}
