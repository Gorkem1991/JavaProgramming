package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";

        char thirdChar = word.charAt(3);

        System.out.println(thirdChar);

        String s1 = "Batch 25 is the best batch.";

        int length = s1.length();
        System.out.println(length);

        char lastChar = s1.charAt(s1.length()-1);
        System.out.println(lastChar);

        String str = "wooden spoon";
        str = str.toUpperCase();

        System.out.println(str);

        String s = "JAVA";

        s=s.toLowerCase();

        System.out.println(s);

    }
}
