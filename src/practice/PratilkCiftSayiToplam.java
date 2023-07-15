package practice;

public class PratilkCiftSayiToplam {
    public static void main(String[] args) {
        int myNumber = 50;
        int totalNumber=0;
        int increment =0;
        for (int i=1; i<myNumber; i++)
        {
            if(i%3==0 && i%4==0)
            {
                totalNumber = totalNumber+i;
                increment = increment+1;
            }
        }
        totalNumber = totalNumber/increment;
        System.out.println("increment = " + totalNumber);
    }
}
