package day24_CustomMethods_Return;

public class ReturnMethodsPractice5 {
    public static void main(String[] args) {
        String letters="aaabbccdcce";
        String result="";
        System.out.println(removeDuplicate(letters, result));
    }
   public static String removeDuplicate(String letters, String result)
   {
        for(int i =0; i<letters.length(); i++)
        {
            int counter = 0;
            String letterI = ""+letters.charAt(i);
            for(int j =0; j<letters.length(); j++)
            {
                String letterJ = ""+letters.charAt(j);

                if(letterJ.equals(letterI))
                {
                    counter++;
                }
            }
            if(counter ==1)
            {
                result+=letterI;
            }
        }
        return result;
   }

}
