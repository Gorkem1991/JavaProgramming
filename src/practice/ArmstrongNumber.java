package practice;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int result = 1;
        int finalSum = 0;
        int number = 1634;
        int seperatedInt = 0;

        String temp = Integer.toString(number);

        for (int i = 0; i < temp.length(); i++) { // for the digits
            for (int j = 0; j < temp.length(); j++) { // for the number of iteration.

                seperatedInt = temp.charAt(i) - '0';
                result = result * seperatedInt;
            }
            finalSum = finalSum + result;
            result = 1;
        }
        if (finalSum == number) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}