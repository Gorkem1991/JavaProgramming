package day24_CustomMethods_Return;

public class MinimumNumber {
    public static void main(String[] args) {

        int numbers[] = {5,9,6,4,10,20,31,52,94,20,11,1,6,7};
        int minNo = numbers[0];
        System.out.println(minimumNumber(numbers, minNo));

    }
    public static int minimumNumber(int[] numbers, int minNo)
    {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<minNo)
            {
                minNo=numbers[i];
            }
        }
        return minNo;
    }
}
