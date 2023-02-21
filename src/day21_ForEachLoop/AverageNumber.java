package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {
        int average[] = {10,20,30,40,50,60,70,80,90};
        double sum =0;
        for (int i : average)
        {
            sum=sum+i;
        }
        double averageb =sum/average.length;
        System.out.println(averageb);
    }
}
