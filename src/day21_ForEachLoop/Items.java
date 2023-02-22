package day21_ForEachLoop;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {
        String[] items ={"shoes","jacket","gloves","airpods","ipad","iphone 12 case"};
        double[] prices = {99.99,150.0,9.99,250.0,439.50,39.99};
        int[] itemIds = {12345,23123,53453,1231,5433,5456};
        String itemtotal[] = new String[items.length+prices.length+itemIds.length];
        for (int i = 0; i <items.length; i++)
        {
            itemtotal[i] = items[i]+" $" + prices[i]+" " + itemIds[i];
            System.out.println(itemtotal[i]);
        }

    }
}
