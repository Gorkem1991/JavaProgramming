package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
       /* char[] letters = new char[26];

        for (char i = 'a',j=0; i <='z' && j<letters.length; i++,j++) {
           letters[j]=i;
        }

        char ch ='A';
        for (int i = 0; i <letters.length; i++) {
            letters[i]=ch++;

        }
       // System.out.println(Arrays.toString(letters));
*/
        char[] letters2 = new char[26];

        char ch2 ='Z';
        for (int i =0; i <letters2.length; i++) {
            letters2[i]=ch2--;
        }
        System.out.println(Arrays.toString(letters2));
    }
}
