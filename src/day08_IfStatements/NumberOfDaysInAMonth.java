package day08_IfStatements;

public class NumberOfDaysInAMonth {
    public static void main(String[] args) {

        int givenMonthNumber = 6;

        boolean days31 = givenMonthNumber==1 || givenMonthNumber ==3 ||givenMonthNumber ==5 || givenMonthNumber ==7 || givenMonthNumber ==8 || givenMonthNumber ==10 || givenMonthNumber ==12;
        boolean days30 = givenMonthNumber==4 || givenMonthNumber ==6 ||givenMonthNumber ==9 || givenMonthNumber ==11;
        boolean days28 = givenMonthNumber==2;

        if(days31)
        {
            System.out.println("31 Days");
        }
        if(days30)
        {
            System.out.println("30 Days");
        }
        if (days28)
        {
            System.out.println("28 Days");
        }
    }
}
