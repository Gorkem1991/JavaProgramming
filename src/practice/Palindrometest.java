package practice;

public class Palindrometest {
    public static void main(String[] args) {

     int asd = 65653;

     int seconds;
     int hours;
     int minutes;

     seconds = asd%60;
     hours = asd /60;
     minutes = hours %60;
     hours = hours/60;


        System.out.println(hours + " " + minutes + " " + seconds);


    }
}
