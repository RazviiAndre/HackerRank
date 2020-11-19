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

public class DiagonalDifference {
    public static void main(String[] args) {
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        firstLine.add(4);
        firstLine.add(2);

        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(6);
        secondLine.add(10);
        secondLine.add(15);

        List<Integer> thirdLine = new ArrayList<>();
        thirdLine.add(1);
        thirdLine.add(3);
        thirdLine.add(5);


        List<List<Integer>> listOfArray = new ArrayList<>();
        listOfArray.add(firstLine);
        listOfArray.add(secondLine);
        listOfArray.add(thirdLine);

        System.out.println(diagonalDifference(listOfArray));

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonalArraySum = 0;
        int second = 0;

        for(int i = 0 ; i < arr.size(); i++){
            diagonalArraySum += arr.get(i).get(i);
            second += arr.get(i).get(arr.size() - 1 - i);

        }


        return Math.abs(diagonalArraySum - second);
    }
}
