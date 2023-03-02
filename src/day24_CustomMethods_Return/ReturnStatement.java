package day24_CustomMethods_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(2);
    }

    public static void nameOfDay(int number)
    {
        if(number<1 || number >7)
        {
            System.out.println("Invalid");
            return;
        }
        if(number ==1)
        {
            System.out.println("Monday");
        }
        else if(number == 2)
        {
            System.out.println("Tuesday");
        }
    }
}
