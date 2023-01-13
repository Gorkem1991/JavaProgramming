package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;

        boolean aIsMedian = (b>a && a>c) || (b<a && a<c);
        boolean bIsMedian = (a>b && b>c) || (a<b && b<c);
        boolean cIsMedian = (b>c && c>a) || (b<c && c<a);

        if(aIsMedian)
        {
            System.out.println(a + " is Median");
        }
        if(bIsMedian)
        {
            System.out.println(b + " is Median");
        }
        if(cIsMedian)
        {
            System.out.println(c + " is Median");
        }
    }
}
