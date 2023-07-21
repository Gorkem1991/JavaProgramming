package practice;

public class NumberofDigits {
    public static void main(String[] args) {

        int num=10235; // int number

        int i =0;
        while (num > 0) {
                i++;
            num = num / 10;


        }
        System.out.println(i);
    }


}
