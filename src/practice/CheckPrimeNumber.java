package practice;

public class CheckPrimeNumber {
    public static void main(String[] args)
    {
        int number1 = 21;
        boolean flag = false;
        for(int i =2; i<=number1; i++)
        {
            if(number1%i==0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(number1 + " is a prime number.");
        else
            System.out.println(number1 + " is not a prime number.");
    }
}
