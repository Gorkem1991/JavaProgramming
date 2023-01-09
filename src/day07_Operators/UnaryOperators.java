package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a =5 ;
        ++a;

        System.out.println("a = " + a);

        int b =5;
        b++;

        System.out.println("b = " + b);

        int c=+5;
        c+=c;
        System.out.println(c);
    }
}
