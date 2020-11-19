/*##############################################################################
 # Date : 11/19/20, 11:59 AM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

package problemSolvingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class StudentsGrades {

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(80);
        grades.add(79);
        grades.add(78);
        grades.add(77);
        grades.add(76);
        grades.add(75);
        grades.add(74);
        grades.add(73);
        grades.add(72);
        grades.add(71);
        grades.add(70);

        int j = 0;
        for(int i : gradingStudents(grades)){
           System.out.println("Grade " + grades.get(j) + " rounded to " + i);
           j++;
       }
    }


    public static List<Integer> gradingStudents(List<Integer> grades) {
        int minimumGrade = 38;
        List<Integer> roundedGradings = new ArrayList<Integer>();

        for(int grade : grades){
            if(grade < minimumGrade){
                roundedGradings.add(grade);
            } else if (grade >= minimumGrade){
                int lastNumber = grade % 10;

                if(lastNumber > 2 && lastNumber <= 3){
                    grade += 2;
                    roundedGradings.add(grade);
                } else if(lastNumber <= 2 && lastNumber >= 0){
                    roundedGradings.add(grade);
                }else if(lastNumber > 3 && lastNumber <= 4){
                    grade++;
                    roundedGradings.add(grade);
                }
                if(lastNumber > 7 && lastNumber <= 8 ){
                    grade += 2;
                    roundedGradings.add(grade);
                } else if (lastNumber <= 7 && lastNumber >= 5){
                    roundedGradings.add(grade);
                } else if(lastNumber > 8 && lastNumber <= 9){
                    grade++;
                    roundedGradings.add(grade);
                }
            }

        }
        return roundedGradings;
    }
}
