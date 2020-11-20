/*##############################################################################
 # Date : 11/20/20, 12:15 PM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

/*##############################################################################
 # Date : 11/20/20, 12:13 PM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

package javaIntroduction;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            int countNumbers = 0;
            int temp = x;
            String newNumber = "";
            StringBuilder spaces = new StringBuilder();
            spaces.append(" ".repeat(Math.max(0, (15 - s1.length()))));

            while(temp > 0){
                temp /= 10;
                countNumbers++;
            }
            if(countNumbers == 1){
                newNumber = "00" + String.valueOf(x);
            } else if (countNumbers == 2){
                newNumber = "0" + String.valueOf(x);
            } else {
                newNumber = String.valueOf(x);
            }
            System.out.printf("%s%s%s",s1,spaces,newNumber);
        }
        System.out.println("================================");
    }
}
