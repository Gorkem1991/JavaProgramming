package day27_WrapperClasses;

public class PasswordValidation {
    public static void main(String[] args) {

        String str ="dFe34D2!3bn";
        boolean sizeAndSpace = str.length() >= 8 && !str.contains(" ");
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean specialChar = false;
        boolean containsDigit = false;
        for (char each:str.toCharArray())
        {
            if(Character.isUpperCase(each))
            {
                upperCase= true;
            }
            else if(Character.isLowerCase(each))
            {
                lowerCase= true;
            }
            else if(Character.isDigit(each))
            {
                containsDigit= true;
            }
            else
            {
                specialChar= true;
            }
        }
        if(upperCase && lowerCase && specialChar && containsDigit && sizeAndSpace)
        {
            System.out.println("password is strong");
        }
        else
        {
            System.out.println("password is weak");
        }
    }
}
