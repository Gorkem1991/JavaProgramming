package practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double tlPerKm = 2.2;
        System.out.println("Enter km");
        double km = sc.nextDouble();

        double payment = km*tlPerKm+10;

        if(payment > 20)
        {
            System.out.println("Amount to pay is " + payment + "₺");
        }
        else
        {
            System.out.println("You have to pay 20₺");
        }
    }
}
