package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores);
        gradeOfA.removeIf(p-> p<89);
        System.out.println(gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores);
        gradeOfB.removeIf(p-> !(p>=80 && p<=90));
        System.out.println(gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores);
        gradeOfC.removeIf(p-> !(p>=70 && p<=80));
        System.out.println(gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores);
        gradeOfD.removeIf(p-> !(p>=60 && p<=70));
        System.out.println(gradeOfD);

        ArrayList<Integer> gradeOfE = new ArrayList<>(scores);
        gradeOfE.removeIf(p-> !(p>=50 && p<=60));
        System.out.println(gradeOfE);

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores);
        gradeOfF.retainAll(gradeOfA);
        gradeOfF.retainAll(gradeOfB);
        gradeOfF.retainAll(gradeOfC);
        gradeOfF.retainAll(gradeOfD);

        System.out.println("gradeOfA = " + gradeOfA);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("gradeOfE = " + gradeOfE);
        System.out.println("gradeOfF = " + gradeOfF);
    }
}
