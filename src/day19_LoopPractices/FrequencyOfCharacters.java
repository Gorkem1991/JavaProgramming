package day19_LoopPractices;

import java.sql.SQLOutput;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";
        String newStr ="";
        int counter=0;


       for (int i = 0; i <str.length(); i++)
       {
           counter =0;
            String iChar = ""+str.charAt(i);
            for (int j = 0; j <str.length(); j++)
            {
                String jChar = ""+str.charAt(j);

                if(iChar.equals(jChar))
                {
                    counter++;
                }
                }
                if(newStr.contains(iChar))
                {
                    continue;
                }
           newStr+=iChar;
           newStr+=counter;

        }
        System.out.print(newStr);
    }
}
