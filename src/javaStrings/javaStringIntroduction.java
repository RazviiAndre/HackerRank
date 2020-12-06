/*##############################################################################
 # Date : 12/4/20, 2:36 PM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

package javaStrings;

import java.util.Scanner;

public class javaStringIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int firstStringLength = A.length();
        int secondStringLength = B.length();

        System.out.println(firstStringLength + secondStringLength);

        if(firstStringLength > secondStringLength){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }


        System.out.print(capitalizeFirst(A) + " " + capitalizeFirst(B));
    }

    static String capitalizeFirst(String s){
        if(s == null || s.length() == 0){
            return s;
        }
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
}
