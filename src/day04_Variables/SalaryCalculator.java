package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 120;
        int weeklyHours = 40;

        int salary = (hourlyRate * weeklyHours) * 52;
        System.out.println("Hourly Rate " + hourlyRate + "$");
        System.out.println("Weekly Rate " + weeklyHours + "$");
        System.out.println("Salary " + salary + "$");

        int usaSalary = 8000;
        int europeSalary = usaSalary / 2;
        int salaryAfterTax = europeSalary / 2;
        int courseCost = 500;
        int roomRent = 500;
        int netSalary = salaryAfterTax - courseCost - roomRent;

        System.out.println("USA salary: €" + usaSalary);
        System.out.println("Europe Salary: €" + usaSalary + "/" + "2 = €" + europeSalary);
        System.out.println("Salary after tax: €" + europeSalary + "/" + "2 = €" + salaryAfterTax);
        System.out.println("Course cost: €" + courseCost);
        System.out.println("Room Rent: €" + roomRent);
        System.out.println("Your monthly net salary is: €" + salaryAfterTax + "-€" + courseCost + "-€" + roomRent + ": €" + netSalary);
    }
}
