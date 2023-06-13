package practice;

public class ValidCard {
    public static void main(String[] args) {
        String cardNo = "4091131560563988";

        boolean validOrNot = cardValidation(cardNo);
        System.out.println(validOrNot);
    }
    public static boolean cardValidation(String cardNo)
    {
        String[] numbersArray = cardNo.split("");
        int numbersMultiplied =0;
        int result=0;
        for (int i = 0; i <numbersArray.length ; i++)
        {
            int numbers =Integer.parseInt(numbersArray[i]);
            if(i%2==0)
            {
                numbersMultiplied = numbers *2;
                if(numbersMultiplied >9)
                {
                    numbersMultiplied = numbersMultiplied -9;
                }
                result+= numbersMultiplied;
            }
            else
            {
                if(numbers >9)
                {
                    numbers = numbers -9;
                }
                result+= numbers;
            }
        }
        if(result%10==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
