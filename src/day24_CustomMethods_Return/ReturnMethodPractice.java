package day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        int max = maxNumber(100,200);
        System.out.println(max*2);
    }
    public static int maxNumber(int number1, int number2)
    {
        if(number1>number2)
        {
            return number1;
        }
        else
        {
            return number2;
        }


    }
}
