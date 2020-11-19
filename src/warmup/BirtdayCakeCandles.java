/*#############################################################################
 # Date : 11/19/20, 11:14 AM                                                  #
 # Author : Razvii Andre                                                      #
 # HackerRank Profile : https://www.hackerrank.com/Razvii                     #
 # Github Profile : https://github.com/razviiandre                            #
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b#
 #############################################################################*/

package warmup;

import java.util.Collections;
import java.util.List;

public class BirtdayCakeCandles {
    public static void main(String[] args) {

    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Collections.sort(candles);
        int maxOfCandles = candles.get(candles.size()-1);
        int count = 0;
        for(int i = 0 ; i < candles.size(); i++){
            int candlesElement = candles.get(i);
            if(candlesElement == maxOfCandles){
                count++;
            }
        }

        return count;
    }
}
