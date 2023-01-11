package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 23;
        double weeklyRate = hourlyRate*40;
        double salaryBeforeTax = weeklyRate*52;
        System.out.println("salaryBeforeTax = " + salaryBeforeTax);
    }
}
