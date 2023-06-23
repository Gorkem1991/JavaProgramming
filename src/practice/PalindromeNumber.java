package practice;

public class PalindromeNumber {
    public static void main(String[] args) {

        int a = 121;
        int b = 0;
        String ab=Integer.toString(a);
        String result ="";

        for (int i = ab.length()-1; i >=0; i--)
        {
            result+=""+ ab.charAt(i);
        }
        b=Integer.parseInt(result);

        boolean answer = (a==b) ? true : false;

        System.out.println("Number is palindrome ? " + answer);
    }
}
