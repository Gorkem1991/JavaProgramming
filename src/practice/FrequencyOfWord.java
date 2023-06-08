package practice;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String names = "Adam Adam Barry Aysun Aysun";
        String dumyNames = names;
        String newNames ="";
String result = "";

        for (int i = 0; i <names.length(); i++)
        {
            String lol = ""+names.charAt(i);
            int counter =0;
            if(lol.equals(" "))
            {
                while(dumyNames.contains(newNames))
                {
                    dumyNames=dumyNames.replaceFirst(newNames, "");
                    counter++;
                }
                if(!result.contains(newNames))
                {
                    result=newNames+counter;

                    System.out.println(result);
                }
                newNames="";
            }
            else
            {
                newNames+=names.charAt(i);
            }
        }
    }
}
