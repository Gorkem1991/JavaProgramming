package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str ="Java Programming Language";

        StringUtility.printEachChar(str);
        String reversed = StringUtility.reverse(str);

        System.out.println(reversed);


        String s2 = "aaaaaaaaaddddddvvvvcc";
       String nonDup= StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);
    }
}
