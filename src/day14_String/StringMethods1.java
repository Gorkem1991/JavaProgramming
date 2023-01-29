package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "     batch     25    ";

       str1 = str1.trim();

       String str2 = "Cydeo School";

       int n1 = str2.indexOf("h");
        System.out.println(n1);

        int n2 = str2.indexOf("ool");
        System.out.println(n2);

        String str3 = "Java Programming Language";

        int n3 = str3.indexOf("amm");
        System.out.println(n3);


        int n4 = str3.indexOf("gua");

        System.out.println(n4);

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
       // int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca")+1;
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");

        System.out.println(firstA);
        System.out.println(lastA);
        System.out.println(secondA);
        System.out.println(thirdA);
        System.out.println(fourthA);
        System.out.println(fifthA);
        System.out.println(sixthA);
        System.out.println(seventhA);
    }
}
