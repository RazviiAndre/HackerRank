/*##############################################################################
 # Date : 11/20/20, 10:08 AM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

import java.util.Scanner;

public class Day4ClassVsInstance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }


    public static class Person {
        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            if(initialAge < 0){
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            } else {
                this.age = initialAge;
            }
        }

        public void amIOld() {
            String youAre = "";
            if(this.age < 13){
                youAre = "You are young.";
            } else if (this.age >= 13 && this.age < 18){
                youAre = "You are a teenager.";
            } else {
                youAre = "You are old.";
            }
            System.out.println(youAre);
        }

        public void yearPasses() {
            this.age++;
        }
    }
}
