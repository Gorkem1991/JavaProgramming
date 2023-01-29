package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

       String str = "Java is fun, I love learning Java";
        String str2= str.replace("Java", "Python");
        String email = "JohnSmith@yahoo.com";

        String gmail = email.replace("yahoo.com", "gmail.com");
        System.out.println(gmail);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";

        String sentence2 = sentence.replace("Python","");
        sentence2= sentence2.replace("   ", " ");
        System.out.println(sentence2);

        String s = "Dog Dog Dog Dog Dog Dog Dog Dog Dog";

        String s2 = "C# is fun, C# is cool";

        s2=s2.replace("C#", " Java");
        System.out.println(s2);

        String s3 ="Java";

        s3 = s3.replace("a", "e");

        System.out.println(s3);

        String result = "Java Java Java";

        result = result.replaceFirst("Java", "Python");

        System.out.println(result);

        result = result.replaceFirst("C#", "Java");

        System.out.println(result);

        String result3 = "Java";
        result3=result3.replaceFirst("av", "o");

        System.out.println(result3);


    }
}
