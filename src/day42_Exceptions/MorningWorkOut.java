package day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args)
    {

        System.out.println("-- Push up Started --");

        for (int i = 1; i <= 30; i++)
        {

            System.out.println("\r Push up " + i);

          sleep(1.5);
        }
        System.out.println("\n -- Push ups Completed -- ");

        System.out.println("-- Pull up Started --");

        for (int i = 1; i <= 20; i++)
        {

            System.out.println("\r Pull up " + i);
          sleep(1.5);
        }
        System.out.println("\n -- Pull ups Completed -- ");

    }


    public static void sleep(double seconds)
    {
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
