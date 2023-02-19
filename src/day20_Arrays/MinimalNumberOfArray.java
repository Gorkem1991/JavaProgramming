package day20_Arrays;

public class MinimalNumberOfArray {
    public static void main(String[] args) {
        int min[] = {100,500,30,40,600,80,90};

        int minn = min[0];
        for (int i = 0; i < min.length; i++) {
            if(min[i]<minn)
            {
                minn=min[i];
            }
        }
        System.out.println(minn);
    }
}
