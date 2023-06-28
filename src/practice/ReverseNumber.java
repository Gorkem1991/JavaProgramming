package practice;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=10235; // int number
    int newno=1;
    int reversed=0;

        while (num > 0) {

            newno = num%10;
            reversed = reversed * 10 + newno;
            num = num / 10;


        }
        System.out.println(reversed);

    }
}
