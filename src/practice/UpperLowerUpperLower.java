package practice;

import java.util.Scanner;


    public class UpperLowerUpperLower {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();
            String word2 = "";

            for (int i = 0; i <= word.length() - 1; i++)
            {
                String as =""+ word.charAt(i);
                if (i % 2 == 0) {
                    word2+= as.toUpperCase();
                } else {
                    word2+=as.toLowerCase();
                }

            }
            System.out.println(word2);
        }
    }

