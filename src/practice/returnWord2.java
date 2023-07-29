package practice;

public class returnWord2 {
    public static void main(String[] args) {
       String word = "aaaabbcccdda";

       String rev4 = getword(word);

        System.out.println(rev4);

    }
    public static String getword(String word)
    {
        String rev = " ";

        String rev3 = "";
        for (int i = 0; i <word.length(); i++)
        {
            int counter = 0;
            for (int j = 0; j <word.length()-1; j++)
            {
                if(word.charAt(i) == word.charAt(j))
                {
                    counter++;
                }
            }
            if(!rev3.contains(""+word.charAt(i)))
            {
                rev3+=word.charAt(i)+""+counter;
            }
        }
        rev3+=word.charAt(word.length()-1);
       return rev3;
    }
}
