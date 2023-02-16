package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String newString ="";

        for (int i = 0; i < str.length(); i++)
        {
            int counter=0;
            String iChar = ""+str.charAt(i);
            for (int j = 0; j < str.length(); j++)
            {
                String jChar = ""+str.charAt(j);
                if(iChar.equals(jChar))
                {
                    counter++;
                }
            }
            if(counter ==1)
            {
                newString+=iChar;
            }
        }
        System.out.println(newString);
    }
}
