package day17_While_DoWhile;

public class FrequencyOfJava {
    public static void main(String[] args) {
        String sentence ="cat cat cat dog dog dog";
        String animals ="";
        int catCounter =0;
        int dogCounter =0;

       for (int i = 0; i <sentence.length()-2 ; i++)
        {
            animals = sentence.substring(i,i+3);
                if(animals.equalsIgnoreCase("cat"))
                {
                    catCounter = catCounter+1;
                }
                else if(animals.equalsIgnoreCase("dog"))
                {
                    dogCounter= dogCounter+1;
                }
        }
        System.out.println(catCounter);
        System.out.println(dogCounter);

    }
}
