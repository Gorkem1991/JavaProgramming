package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String words[] = {"Java", "Java", "C#", "Python", "Python"};
        String newVar[] = new String[5];
        for (int i = 0; i < words.length; i++) {
            for (int i1 = 0; i1 < words.length; i1++) {
                if (words[i].equals(words[i1])) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(words[i]);
            }
            counter = 0;
        }
    }
}
