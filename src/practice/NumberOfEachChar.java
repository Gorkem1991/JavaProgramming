package practice;

public class NumberOfEachChar {
    public static void main(String[] args) {
        String str = "aaabbccddda";
        String newStr = "";
        String iChar = "";
        String jChar = "";
        int counter = 0;

        for (int i = 0; i < str.length(); i++)
        {
            counter = 0;
            iChar = "" + str.charAt(i);
            for (int j = 0; j < str.length(); j++)
            {
                jChar = "" + str.charAt(j);
                if (iChar.equals(jChar))
                {
                    counter++;
                }
            }
            if (newStr.contains(iChar))
            {
                continue;
            }
            newStr += iChar+counter;
        }
        System.out.print(newStr);
    }
}
