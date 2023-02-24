package day22_MultiDimensionalArray;

public class HowManyPalindromes {
    public static void main(String[] args) {
        String sentence = "I Love Java racecar";

        String words[] = sentence.split(" ");

        String palindrome = "";
        int counter =0;

        for (String eachWord : words)
        {
            for (int i = eachWord.length() - 1; i >= 0; i--)
            {
                palindrome+= eachWord.charAt(i);
            }
            if(palindrome.equals(eachWord))
            {
                counter++;

            }
            palindrome="";
        }
        System.out.println(counter);
    }
}
