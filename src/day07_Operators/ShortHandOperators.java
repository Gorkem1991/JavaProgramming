package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int number = 100;
        double availableBalance = 1000.50;

        availableBalance+=300;

        System.out.println(availableBalance);

        double salary = 50000.50;
        salary *= 2;

        System.out.println(salary);

        int y = 300;

        y %= 16;

    }
}
