package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score =95;
        String result = "";
        if (score >=0 && score <=100)
        {
            if (score>=90 && score <=100)
            {
                result = "Excellent";
            }
            else if(score>=80)
            {
                result="Great";
            }
            else if (score>=70) {
                result ="Good";
            }
            else if (score>=60) {
                result="Passed";
            }
            else
            {
                result="Failed";
            }
        }
        else
        {
            result = "Invalid Score";
        }
        System.out.println(result);

        String result2 = (score >=0 && score <=100)? (score>=90 && score <=100)? "Excellent" :(score>=80)? "Great" :(score>=70) ? "Good" :(score>=60)?"Passed" : "Failed":"Invalid";
    }
}
