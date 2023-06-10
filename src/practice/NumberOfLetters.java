package practice;

public class NumberOfLetters {
    public static void main(String[] args) {
        String myString = "aaabbbbbaa";
        int counter=1;
        String result ="";
        for(int i = 0; i<myString.length()-1; i++)
        {
            if(myString.charAt(i)==myString.charAt(i+1))
            {
                counter++;
                continue;
            }
            else
            {
                result+=myString.charAt(i)+""+counter;
            }
            counter=1;
        }
        result+=myString.charAt(myString.length()-1)+""+counter;
        System.out.println(result);
    }
}
