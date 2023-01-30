package day14_String;

public class EmailDomain {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";
        String email2 = "School.Cydeo@yahoo.com";

        email = email.substring(email.indexOf("@")+1,email.lastIndexOf(".") );
        email2 = email2.substring(email2.indexOf("@")+1,email2.lastIndexOf(".") );

        System.out.println(email);
        System.out.println(email2);

        String str1 = "Java is fun, Java is cool, I love Java";

        String s1 = str1.substring(0, 10+1);
        System.out.println(s1);

        String s2 = str1.substring(str1.indexOf(" J")+1, str1.lastIndexOf(", "));
        System.out.println(s2);


        String s3 = str1.substring(str1.indexOf(" I")+1);
        System.out.println(s3);
    }
}
