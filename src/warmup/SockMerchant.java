/*#############################################################################
 # Date : 11/19/20, 11:14 AM                                                  #
 # Author : Razvii Andre                                                      #
 # HackerRank Profile : https://www.hackerrank.com/Razvii                     #
 # Github Profile : https://github.com/razviiandre                            #
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b#
 #############################################################################*/

package warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SockMerchant {
    public static void main(String[] args) {
        int[] array = new int[]{10 ,20 ,20 ,10 ,10 ,30 ,50 ,10 ,20};
//        System.out.println("COUNT: " + sockMerchant(15,array));
        System.out.println(sockMerchant2(9,array));
    }

    static int sockMerchant2(int n , int[] ar){
        int firstElement = 0;
        int secondElement = 0;
        int count = 0;
        boolean u;
        List<Integer> savedTempElement = new ArrayList<>();

        for(int i = 0 ; i < ar.length ; i++){
            firstElement = ar[i];
            int tempCount = 0;

            if(savedTempElement.contains(firstElement)){
                u = false;
            } else {
                u = true;
            }

            for(int j = i + 1 ; j < ar.length ; j++) {
                secondElement = ar[j];

                if (u) {
                    if (firstElement == secondElement) {
                        if(tempCount % 2 == 0){
                            count++;
                        }
                        tempCount++;
                    }
                }
                if(!savedTempElement.contains(firstElement)) {
                    savedTempElement.add(firstElement);
                }
            }
        }
        return count;
    }
    static int sockMerchant(int n, int[] ar) {
        int firstElement;
        int secondElement;
        int count = 0;


        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                firstElement = ar[i];
                secondElement = ar[j];

                if (firstElement > secondElement) {
                    ar[j] = firstElement;
                    ar[i] = secondElement;
                }
            }
        }

        for (int i = 0; i < ar.length; ) {
            for (int j = 1; j < ar.length; ) {
                firstElement = ar[i];
                secondElement = ar[j];

                if (firstElement == secondElement) {
                        count++;
                        i++;
                }

                i++;
                j = i + 1;
            }
        }
        return count;
    }
}

