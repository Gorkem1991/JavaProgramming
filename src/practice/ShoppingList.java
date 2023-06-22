package practice;

import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        String yesOrNo = "yes";
        int count =1;
        Scanner sc = new Scanner(System.in);
        String itemName ="";
        double itemPrice;
        String result ="";
        double resultPrice=0;
        while(yesOrNo.equals("yes"))
        {
            System.out.println("Enter Item"+count+" and its price");
            itemName = sc.nextLine();
            itemPrice = sc.nextDouble();
            System.out.println("Add one more item ?");
            result+="Item"+count+": "+itemName + " Price: " + itemPrice+", ";
            resultPrice+=itemPrice;
            sc.nextLine();
            yesOrNo = sc.nextLine();
            count++;
        }



        System.out.println(result);
        System.out.println("Total price: " + resultPrice);
    }
}
