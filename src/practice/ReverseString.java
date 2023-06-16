package practice;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String str[] = s.split(" ");
        String result="";
        for (String each: str)
        {

            for(int i = each.length()-1; i>=0; i--)
            {
                result+= "" +  each.charAt(i);
            }
            result+=" ";
        }

        System.out.println(result);

    }
}
