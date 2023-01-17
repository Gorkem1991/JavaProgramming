package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int age =15;
        String result2 = (age>=21) ? "Eligible" : "Not Eligible";
        System.out.println(result2);


        int number = 10;
        String result3 = (number>0) ? "Positive" : (number<0) ? "Negative": "Zero";
        System.out.println(result3);

        int n = 2;
        String result = (n==1) ? "Monday": (n==2) ?"Tuesday": (n==3) ?"Wednesday": (n==4) ?"Thursday": (n==5) ?"Friday": (n==6) ?"Saturday":"Sunday";
        System.out.println(result);

    }
}
