/*#############################################################################
 # Date : 11/19/20, 11:14 AM                                                  #
 # Author : Razvii Andre                                                      #
 # HackerRank Profile : https://www.hackerrank.com/Razvii                     #
 # Github Profile : https://github.com/razviiandre                            #
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b#
 #############################################################################*/

package warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        miniMaxSum(arr);
        miniMaxSum2(arr);
    }

    static void miniMaxSum(int[] arr) {
        long sum = 0;
        int temp = 0;
        List<Long> listOfSum = new ArrayList<>();

        for(int i = 0,j = arr.length - 1; i < arr.length ; )
        {
            temp = arr[j];
            arr[j] = 0;

            while(i < arr.length) {
                sum += arr[i];
                i++;
            }

            listOfSum.add(sum);

            sum = 0;
            arr[j] = temp;
            j--;

            if(j >= 0){
                i = 0;
            }

        }

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(long i : listOfSum){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }

        System.out.println(min + " " + max);
    }
    static void miniMaxSum2(int[] arr){
        List<Long> listOfSum = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++){
            long sum = 0;
            for(int j = 0 ; j < arr.length ; j++){
                if(i != j){
                    sum += arr[j];
                }
            }
            listOfSum.add(sum);
        }

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(long l : listOfSum){
            if(l > max){
                max = l;
            }
            if(l < min){
                min = l;
            }
        }
        System.out.println(min + " " + max);
    }
}
