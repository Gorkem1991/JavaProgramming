package day25_CustomMethod_Overloading;

public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {3,7,2,3,6,9,14,7};
        int max = numbers[0];

        double[] numbers2 = {3.6,7.2,2.9,3.2,6.9,9.7,14.5,7.4};
        double max2 = numbers[0];

        System.out.println(maxNumber(numbers, max));
        System.out.println(maxNumber(numbers2, max2));
    }

    public static int maxNumber(int[] numbers, int max)
    {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max)
            {
                max= numbers[i];
            }
        }
        return max;
    }
    public static double maxNumber(double[] numbers2, double max2)
    {
        for (int i = 0; i < numbers2.length; i++) {
            if(numbers2[i] > max2)
            {
                max2 =numbers2[i];
            }
        }
        return max2;
    }
}
