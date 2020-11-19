/*#############################################################################
 # Date : 11/19/20, 11:14 AM                                                  #
 # Author : Razvii Andre                                                      #
 # HackerRank Profile : https://www.hackerrank.com/Razvii                     #
 # Github Profile : https://github.com/razviiandre                            #
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b#
 #############################################################################*/

package warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class CountingValleys {
    public static void main(String[] args) {
        countValleys("DDUUDDUDUUUD");
    }

    static void countValleys(String path){
        char[] charsOfPath = path.toCharArray();
        int sumOfChars = 0;
        int tempSum = 0;
        int count = 0;

        for(int i = 0; i < charsOfPath.length ; i++){
            char firstChar = charsOfPath[i];
            if(firstChar == 'U'){
                tempSum = sumOfChars;
                sumOfChars++;
            } else {
                tempSum = sumOfChars;
                sumOfChars--;
            }
            if(sumOfChars == 0 && tempSum < 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
