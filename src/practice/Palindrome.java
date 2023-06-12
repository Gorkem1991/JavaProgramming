package practice;

public class Palindrome {
    public static void main(String[] args) {

        String word ="madam";
        String word1="";

            for (int j=word.length()-1; j>=0; j--)
            {
                word1 = word1 + word.charAt(j);
            }
        if(word.equalsIgnoreCase(word1))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }

    }
}
