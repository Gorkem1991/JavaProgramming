package practice;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter KM");
        int km = sc.nextInt();

        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("Enter 1 for one way, 2 for return");
        int ticketType = sc.nextInt();

        double normalAmount = km * 0.10, ageDiscount, returnTicketDiscount;

        if (km <= 0 || age <= 0 || ticketType >= 3 || ticketType <= 0) {
            System.out.println("Data you entered is not valid");
        } else {
            switch (ticketType) {

                case 1:
                    if (age > 65) {
                        ageDiscount = normalAmount * 0.70;
                        System.out.println("Total amount " + ageDiscount);
                    } else if (age > 12 && age < 24) {
                        ageDiscount = normalAmount * 0.90;
                        System.out.println("Total amount " + ageDiscount);
                    } else if (age <= 12) {
                        ageDiscount = normalAmount * 0.50;
                        System.out.println("Total amount " + ageDiscount);
                    } else {
                        System.out.println("Total amount " + normalAmount);
                    }
                    break;
                case 2:
                    if (age > 65) {

                        ageDiscount = normalAmount * 0.70;
                        returnTicketDiscount = ageDiscount * 0.80;
                        System.out.println("Total amount " + returnTicketDiscount*2);

                    } else if (age >= 12 && age <= 24) {

                        ageDiscount = normalAmount * 0.90;
                        returnTicketDiscount = ageDiscount * 0.80;
                        System.out.println("Total amount " + returnTicketDiscount * 2);

                    } else if (age < 12) {

                        ageDiscount = normalAmount * 0.50;
                        returnTicketDiscount = ageDiscount * 0.80;
                        System.out.println("Total amount " + returnTicketDiscount * 2);
                    } else {
                        System.out.println("Total amount " + normalAmount * 0.80 * 2);
                    }
                    break;
            }
        }
    }
}
