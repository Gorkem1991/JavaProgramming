package practice;

public class GCD {
    public static void main(String[] args) {
        int number1 = 30;
        int number2 = 60;
        int i=2;
        int gcd=0;

        do
        {
            if(number1 %i==0 && number2%i==0)
            {
                number1 = number1/i;
                number2=number2/i;
                gcd=i;
            }
            else{
                i++;
            }
        }while(number1!=1 && number2!=1);
        System.out.println(gcd);
    }
}
