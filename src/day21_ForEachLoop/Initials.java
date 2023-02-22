package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[] students = {"Elminur Ablimit","Ali Kılıc","Hulya Keles","Simen Kaya","Begench Begenjov","Ruveyda Durna"};

        for(String each:students)
        {
            String initials = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initials);
        }

        /*System.out.println();

        for (String initialsOnly : students)
        {
            String [] firstLetter= initialsOnly.split(" ");

            for (String result : firstLetter) {
                result= result.substring(0,1);
                System.out.print(result);
                System.out.print(".");
            }
            System.out.println();
        }*/

    }
}
