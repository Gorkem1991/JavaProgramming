package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[] words = {"Java","Cydeo School","Wooden Spoon", "Early Birds","Angry Birds"};

        for (String newWords : words)
        {
            String firstAndLastLetter =""+  newWords.substring(0,1)+""+ newWords.substring(newWords.length()-1);
                    //""+newWords.charAt(0)+""+newWords.charAt(newWords.length()-1);
            System.out.println(firstAndLastLetter);
        }
    }
}
