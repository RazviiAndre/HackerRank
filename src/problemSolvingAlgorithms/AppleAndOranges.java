/*##############################################################################
 # Date : 11/19/20, 6:04 PM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

package problemSolvingAlgorithms;

public class AppleAndOranges {
    public static void main(String[] args) {
        int[] apples = new int[]{2};
        int[] oranges = new int[]{-2};
        countApplesAndOranges(2,3,1,5,apples,oranges);
    }


    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApples =0;
        int countOranges = 0;


        for (int applesElement : apples) {
            int calculateDistance = a + applesElement;
            if (calculateDistance >= s && calculateDistance <= t) {
                countApples++;
            }

        }

        for (int orangesElement : oranges) {
            int calculateDistance = b + orangesElement;

            if (calculateDistance >= s && calculateDistance <= t) {
                countOranges++;
            }

        }

        System.out.println(countApples);
        System.out.println(countOranges);

    }
}
