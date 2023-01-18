package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 2;
        String location ="";
        int groupNumber =0;
        String teacher = "";

        if(grade >=1 && grade <=6)
        {
            if (grade == 1)
            {
                location = "Apple Orchard";
                groupNumber = 3;
                teacher = "Ms. Smith";
            }
            else if (grade ==2)
            {
                location = "Texas";
                groupNumber = 5;
                teacher = "Mr. John";
            }
            System.out.println(location);
            System.out.println(groupNumber);
            System.out.println(teacher);
        }
        else
        {
            System.out.println("Invalid Grade");
        }

    }
}
