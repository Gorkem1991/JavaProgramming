package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo12345Scho ol!@#$%WoodenSpoon";
        String letters="";
        String digits="";
        String specialCharacters="";

        for (int i = 0; i <str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch<'z' && ch>'a' || ch<'Z' && ch>'A')
            {
                letters+=ch;
            }
            else if(ch<'9' && ch>'0')
            {
                digits+=ch;
            }
            else
            {
                if(ch != ' ')
                {
                    specialCharacters+=ch;
                }
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialCharacters);
    }
}
