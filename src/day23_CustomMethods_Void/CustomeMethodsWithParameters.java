package day23_CustomMethods_Void;

public class CustomeMethodsWithParameters {
    public static void main(String[] args)
    {

        oddOrEven(10);
        ageOfPerson(1991);
        printNumbers(100,500);

    }
    public static void oddOrEven(int number)
    {
        if(number%2==0)
        {
            System.out.println(number + " is an even number");
        }
        else
        {
            System.out.println(number + " is an odd number");

        }
    }

    public static void ageOfPerson(int birthYear)
    {
        int age = 2022-birthYear;
        System.out.println("Your age is " + age);
    }

    public static void printNumbers(int x, int y)
    {
        for (int i = x; i <=y; i++) {
            System.out.println(i);

        }
    }

}
