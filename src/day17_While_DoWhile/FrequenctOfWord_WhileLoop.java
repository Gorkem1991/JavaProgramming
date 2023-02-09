package day17_While_DoWhile;

public class FrequenctOfWord_WhileLoop {
    public static void main(String[] args) {
        String str = "Java Java Python Python";

        int counter =0 ;
        while(str.contains("Java"))
        {
            str=str.replaceFirst("Java", " ");
            counter++;
        }
        System.out.println(counter);

        String sentence ="cat cat cat cat dog dog dog dog";
        sentence = sentence.toLowerCase();
        int counter2=0;


        while(sentence.contains("cat"))
        {
            sentence= sentence.replaceFirst("cat", " ");
            counter2++;
        }
        System.out.println(counter2);


        String s = "java java java java python python ";

        int countJava = 0;
        int countPython = 0;
        while(s.contains("java") ||s.contains("python"))
        {
            if(s.contains("java"))
            {
                s = s.replaceFirst("java", " ");
                countJava++;
            }
            else
            {
                s = s.replaceFirst("python", " ");
                countPython++;
            }
        }
        System.out.println(countJava + " " + countPython);
    }
}
