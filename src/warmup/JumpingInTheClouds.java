/*#############################################################################
 # Date : 11/19/20, 11:14 AM                                                  #
 # Author : Razvii Andre                                                      #
 # HackerRank Profile : https://www.hackerrank.com/Razvii                     #
 # Github Profile : https://github.com/razviiandre                            #
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b#
 #############################################################################*/

package warmup;

import java.util.Scanner;

// TODO: 23-Nov-20 jumping in the clouds 5/9 test case 

public class JumpingInTheClouds {
    public static void main(String[] args) {
        int[] array = new int[]{0 ,0 ,1, 0,0,1 ,0};
        System.out.println(jumpingOnClouds(array));
        System.out.println(jumpingOnClouds2(array));


    }



    static int jumpingOnClouds2(int[] c){
        return 0;
    }

    static int jumpingOnClouds(int[] c) {
        int firstElement = 0;
        int secondElement = 0;
        int jumps = 0;

        for(int i = 0 ; i < c.length - 2 ; i++){
            firstElement = c[i];
            secondElement = c[i+1];
            if(firstElement == 0 && secondElement == 0){
                jumps++;

            } else if(firstElement != secondElement) {
                secondElement = c[i+2];
                if(firstElement == 0 && secondElement == 0){
                    jumps++;
                }
            }
        }


        return jumps;
    }
}
