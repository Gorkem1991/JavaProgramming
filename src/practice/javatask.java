package practice;

import java.util.Arrays;

public class javatask {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayWithZeroSum(11)));
    }

    public static int[] createArrayWithZeroSum(int N) {
        int[] arr = new int[N];

        for (int i = 0; i < N / 2; i++) {
            arr[i] = i + 1;
            arr[N - 1 - i] = -(i + 1);
        }

        return arr;
    }
}
