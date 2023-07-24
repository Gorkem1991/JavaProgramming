package practice;

public class Colortest {
    public static void main(String[] args) {
        String[] colors = { "red", "blue", "whitee", "yellow", "pink" };


        for (String color : colors) {
            System.out.println(color + " " +checkStringLength(color));

        }
         // Output: false
    }

    public static boolean checkStringLength(String strings) {

        if(strings.length()>5)
        {
            return true;
        }
        else
           return false;
    }
}