/*##############################################################################
 # Date : 11/23/20, 6:46 PM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

package javaIntroduction;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int sum = a;
        for(int i = 0, j = 1; i < n ; i++){
            sum += (j*b);
            j*=2;
            System.out.print(sum + " ");
        }
        System.out.println();



        in.close();
    }
}


