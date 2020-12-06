/*##############################################################################
 # Date : 11/24/20, 12:02 AM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

import java.util.Scanner;

public class Day6LetsReview {
    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner IN = new Scanner(System.in);
            int inputStrings = IN.nextInt();
            String[] stringArray = new String[inputStrings];
            StringBuilder evenString = new StringBuilder();
            StringBuilder oddString = new StringBuilder();

            for(int i = 0; i < stringArray.length; i++){
                stringArray[i] = IN.next();
            }

            for(int i = 0; i < stringArray.length; i++){
                int stringLength = stringArray[i].length();
                char[] charsOfString = stringArray[i].toCharArray();
                for(int j = 0; j < stringLength; j++ ){
                    if(j % 2 == 0){
                        evenString.append(charsOfString[j]);
                    } else {
                        oddString.append(charsOfString[j]);
                    }
                }
                System.out.println(evenString + " " + oddString);
                evenString = new StringBuilder();
                oddString = new StringBuilder();
            }
            IN.close();
    }
}
