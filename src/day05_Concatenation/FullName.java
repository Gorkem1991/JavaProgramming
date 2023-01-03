package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Görkem";
        String lastName = "Ağaç";
        String fullName = firstName +" " + lastName;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        System.out.println("Hello, My full name is " + fullName);

        System.out.println(fullName + " is " + jobTitle + ", He works for " + companyName);

    }
}
