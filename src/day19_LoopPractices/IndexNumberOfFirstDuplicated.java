package day19_LoopPractices;

public class IndexNumberOfFirstDuplicated {
    public static void main(String[] args) {
        String str = "jjjaabccdeef";
        String firstDuplicate = "";
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
            if(counter ==2)
            {
                newString+=iChar;
            }
        }

        firstDuplicate = newString.substring(0,2);
        System.out.println(str.indexOf(firstDuplicate));
    }
}
