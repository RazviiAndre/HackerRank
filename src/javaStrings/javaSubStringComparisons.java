/*##############################################################################
 # Date : 12/4/20, 4:26 PM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

package javaStrings;

import java.util.ArrayList;
import java.util.List;

public class javaSubStringComparisons {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs",30));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        char[] stringChars = s.toCharArray();
        char firstChar;
        char maxChar = ' ';
        char minChar = ' ';
        int indexMaxChar = 0;
        int indexMinChar = 0;

        for(int i = 0; i < stringChars.length; i++){
            firstChar = stringChars[i];
            if((int)firstChar > maxChar){
                maxChar = firstChar;
                indexMaxChar = i;
            } else if(firstChar <= minChar){
                minChar = firstChar;
                indexMinChar = i;
            }
        }

        smallest = String.copyValueOf(stringChars,indexMinChar,k);
        largest = String.copyValueOf(stringChars,indexMaxChar,k);


        return smallest + "\n" + largest;
    }
}
