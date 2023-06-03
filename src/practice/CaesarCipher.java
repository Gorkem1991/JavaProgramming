package practice;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your text");
        String text = sc.nextLine();
        char character;
        int asciiValue;
        char newCharacter;

      for(int i =0; i<text.length(); i++)
        {
            character = text.charAt(i);
            //if(character == 'a' || character == 'b' || character == 'c' || character == 'A' || character == 'B' || character == 'C')
            if(character == 'x' || character == 'y' || character == 'z' || character == 'X' || character == 'Y' || character == 'Z')
            {
               //asciiValue = character+23;
              asciiValue = character-23;
                newCharacter =(char)asciiValue;
                System.out.print(newCharacter);
            }
            else if(character == ' ')
            {
                System.out.print(" ");
            }
            else
            {
                //asciiValue = character-3;
                asciiValue = character+3;
                newCharacter = (char)asciiValue;
                System.out.print(newCharacter);
            }
        }
    }
}
