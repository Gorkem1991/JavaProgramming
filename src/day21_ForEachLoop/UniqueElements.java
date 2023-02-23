package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Layan","Layan","Oleksandr","Olga","Adam","Adam","Adam","Cihad","Cihad","Cydeo"};
        int count=0;


        for (String word : words) {
             count =0;
        for (String result : words)
        {
                 if(word.equals(result))
                 {
                     count++;
                 }
        }
            if(count==1)
            {
                System.out.println(word);
            }
    }

    }
}
