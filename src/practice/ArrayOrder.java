package practice;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] myArray = new int[5];

        for (int i =0; i<5; i++)
        {
            System.out.println("Enter your number " + (i+1));
            myArray[i] = sc.nextInt();
        }
        Arrays.sort(myArray);

        for (int j = 0; j<5; j++)
        {
            System.out.println(myArray[j]);
        }
    }
}
