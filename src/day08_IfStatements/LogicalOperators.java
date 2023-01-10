package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        int age =19;
        String citizen ="USA";
        String name = "Steven";

        boolean isEligible = age >=18 && citizen == "USA";

        System.out.println(name + "is eligible to vote: " + isEligible);

        String name3 = "Shay";

        int age3 = 21;
        char gender ='F';

        boolean isEligible3 = age3>=18 && (gender =='M' || gender =='F');

        System.out.println(isEligible3);

        double gpa =2.5;
        int familyIncome = 50000;

        boolean isEligible5 = gpa >=3.5 || familyIncome <=60000;

        System.out.println(isEligible5);

        boolean result2=true;

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);



    }
}
