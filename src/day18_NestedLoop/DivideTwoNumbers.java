package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int num1 = 30;
        int num2 = 7;
        int i =0;
        while(num1 >= num2)
        {
            num1-=num2;
            i++;
        }
        System.out.println(i + " with a reminder of " + num1);
    }
}
