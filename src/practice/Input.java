package practice;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        /*System.out.println("What is the price of this tshirt?");
        int mainnumber = myObj.nextInt();

        System.out.println("How much percentage discount do you have ?");
        int percentageofmainno = myObj.nextInt();

       int newnumber =  mainnumber- (mainnumber*percentageofmainno)/100;
        System.out.println("Tshirt now costs " + newnumber+"$");*/


        int array[] = new int[4];

        for (int i=1; i< array.length; i++)
        {
            if(i==1){
                System.out.println("Enter 1st number");
                array[i]= myObj.nextInt();

            } else if (i==2) {
                System.out.println("Enter 2nd number");
                array[i]= myObj.nextInt();
            }
            else
            {
                System.out.println("Enter 3rd number");
                array[i]= myObj.nextInt();
            }
        }

    }
}
