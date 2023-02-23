package day21_ForEachLoop;

public class ReverseName {
    public static void main(String[] args) {
        String[] students = {"Elminur Ablimit","Ali Kılıc","Hulya Keles","Simen Kaya","Begench Begenjov","Ruveyda Durna"};
        String reversed ="";
        String result = "";

        for (String reverseNames : students)
        {
            for (int i = reverseNames.length()-1; i>=0; i--)
            {
                reversed+= ""+ reverseNames.charAt(i);
            }
            System.out.print(reversed+ ",");
        }

        for (int i = 0; i < students.length; i++) {
            reversed = students[i];

            for (int j = reversed.length()-1; j >=0 ; j--)
            {

                result+=""+reversed.charAt(j);
            }
            System.out.println(result);
            result ="";
        }
    }
}
