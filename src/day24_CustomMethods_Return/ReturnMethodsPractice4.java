package day24_CustomMethods_Return;

public class ReturnMethodsPractice4 {
    public static void main(String[] args) {

        String str = "aabbcdde";
        String newStr = removeDuplicate(str);
        System.out.println(newStr);

    }
    public static String removeDuplicate(String str)
    {
        String result = "";
        for (char c : str.toCharArray())
        {
            String str2 = ""+c;
            if(!result.contains(str2))
            {
                result+=str2;
            }

        }
       return result;
    }

}
