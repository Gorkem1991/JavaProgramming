package practice;

public class BiggestPalindrome {
    public static void main(String[] args) {
        String[] str ={"madam","racecar","daad","zaza","rar"};
        int size =0;
        String biggest ="";

        for (String words : str)
        {
          String newStr="";
            for (int i = words.length()-1; i >=0; i--)
            {
                newStr+=words.charAt(i);
            }
            if(words.equals(newStr))
            {
                if(size <newStr.length())
                {
                    size=newStr.length();
                    biggest=newStr;
                }
            }
        }
        System.out.println(biggest);
    }
}
