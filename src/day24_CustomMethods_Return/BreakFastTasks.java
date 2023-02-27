package day24_CustomMethods_Return;

public class BreakFastTasks {
    public static void main(String[] args) {
        initials("Alan","Jackson");
        emailDomain("gorkemagac@gmail.com");
        String[] emails={"josh@gmail.com","Jim@hotmail.com","nick@hotmail.com"};
        for (String email : emails) {
            emailDomain(email);
        }

        nameOfMonth(5);
        nameOfDay(5);
        daysOfMonth(5);
    }
    public static void initials(String firstName, String lastName)
    {
       String initials= firstName.substring(0,1) +"."+ lastName.substring(0,1);
        System.out.println(initials);
    }

    public static void emailDomain(String email)
    {
        String domain =email.substring(email.indexOf("@")+1, email.indexOf("."));
        System.out.println(domain);

    }

    public static void nameOfMonth(int monthNo)
    {
        if(monthNo>=1 && monthNo<=12)
        {
        switch (monthNo)
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
                case 12:
            System.out.println("December");
            break;
        }

        }
        else
        {
            System.out.println("invalid");
        }
    }

    public static void nameOfDay(int dayNo)
    {
        if(dayNo>=1 && dayNo<=7)
        {
            switch (dayNo)
            {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;

            }
        }
        else
        {
            System.out.println("invalid");
        }

    }

    public static void daysOfMonth(int daysMonth)
    {
        if(daysMonth ==1 || daysMonth ==3 || daysMonth ==5 ||daysMonth ==7 || daysMonth ==8 || daysMonth ==10 || daysMonth ==12 )
        {
            System.out.println("31 Days");
        }
        else if(daysMonth ==4 || daysMonth ==6 || daysMonth ==9 || daysMonth ==11)
        {
            System.out.println("30 Days");
        }
        else
        {
            System.out.println("28 Days");
        }

    }


}
