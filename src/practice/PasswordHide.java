package practice;

import java.util.Arrays;

public class PasswordHide {
    public static void main(String[] args) {
        String[] str = {"one","two","three"};
        String[] str2 = new String[str.length];
        int j = 0;
        for (String each:str)
        {
            String result = "";
            int iteration = each.length();

            for (int i = 0; i < iteration; i++)
            {
                result+= "*";
            }
            str2[j++] = result;
        }

        System.out.println(Arrays.toString(str2));
    }
}
