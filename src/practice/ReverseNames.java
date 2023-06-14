package practice;

public class ReverseNames {
    public static void main(String[] args) {
        String str = "Adam come here";
        String str2 = str+" ";
        String newStr = "";
        String newReverseString = "";

        for (int i = 0; i <str2.length(); i++)
        {
           String characters = "" + str2.charAt(i);

            if(characters.equals(" "))
            {
                for (int j = newStr.length()-1; j >=0; j--)
                {
                    newReverseString+=newStr.charAt(j);
                }

                System.out.print(newReverseString);
                newStr ="";
                newReverseString =" ";
            }
            else
            {
                newStr+=str2.charAt(i);
            }
           
        }
    }
}
