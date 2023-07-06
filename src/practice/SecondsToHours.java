package practice;

import java.util.Scanner;

public class SecondsToHours {
    public static void main(String[] args) {
        int hours;
        int minutes;
        int seconds;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in seconds");
        int inputSeconds = sc.nextInt();

         seconds = inputSeconds % 60;
        hours = inputSeconds / 60;
        minutes =hours % 60;
        hours = hours / 60;



        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds" );



    }
}
/*hours = inputSeconds/(60*60);
        remainder = inputSeconds%(60*60);
        minutes=remainder/(60);
        seconds =remainder%60;
        hours = inputSeconds/(60*60);
        minutes = (inputSeconds%(60*60)/60);
        seconds= inputSeconds%60;

        */