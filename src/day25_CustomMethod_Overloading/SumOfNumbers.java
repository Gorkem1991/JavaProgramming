package day25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
    int num1 = sumOfNumbers(2,3);
    double num2 = sumOfNumbers(2.3,4.5);


    }
    public static int sumOfNumbers(int a, int b) {
        return a+b;
    }
    public static double sumOfNumbers(double a, double b) {
       return a+b;
    }
    public static int sumOfNumbers(int a, int b, int c) {
        return a+b+c;
    }
    public static double sumOfNumbers(double a, double b, double c) {
        return a+b+c;
    }
    public static int sumOfNumbers(int a, int b, int c, int d) {
        return a+b+c+d;
    }
    public static double sumOfNumbers(double a, double b, double c, double d) {
        return  sumOfNumbers(a,b,c)+d;
    }
}
