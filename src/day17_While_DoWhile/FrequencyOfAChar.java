package day17_While_DoWhile;

public class FrequencyOfAChar {
    public static void main(String[] args) {
        String word = "AAABBBC";
        char ch = 'A';
        int counter =0;

        for (int i = 0; i <word.length() ; i++)
        {
                char newChar = word.charAt(i);
                if(newChar == ch)
                {
                    counter = counter + 1;
                }
        }
        System.out.println(counter);
    }
}
