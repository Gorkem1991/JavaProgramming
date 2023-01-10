package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

        int grade = 65;

        if(grade >=90)
        {
            System.out.println("Excellent");
        }
        if(grade >=80 && grade<90)
        {
            System.out.println("Great");
        }
        if(grade >=70 && grade<80)
        {
            System.out.println("good");
        }
        if(grade >=60 && grade<70)
        {
            System.out.println("passed");
        }
        if(grade <=59)
        {
            System.out.println("failed");
        }
    }
}
