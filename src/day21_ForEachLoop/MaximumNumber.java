package day21_ForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {
        int allNumbers[] ={10,20,30,40,50,60,70};
        int max=allNumbers[0];
        for (int biggestNumber:allNumbers)
        {
            if(biggestNumber>max)
            {
                max = biggestNumber;
            }
        }
        System.out.println(max);
    }
}
