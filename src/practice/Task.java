package practice;

public class Task {

        public static void main(String[] args) {
            String str = "£7eBm";
            System.out.println(NextLetter(str));
        }

        public static String NextLetter(String str) {
            String nextLetter = "";
            char ch;

            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) >= 65 && str.charAt(i) <= 88)||(str.charAt(i) >= 97 && str.charAt(i) <= 120)) {
                    ch = (char) (str.charAt(i) + 2);
                    if(ch==97||ch==101||ch==105||ch==111||ch==117){
                        ch = (char)(ch-32);
                    }
                    nextLetter += ch;
                    continue;
                } else if (str.charAt(i) == 89 || str.charAt(i) == 90 || str.charAt(i) == 121 || str.charAt(i) == 122) {
                    ch = (char) (str.charAt(i)-24);
                    if(ch==97||ch==101||ch==105||ch==111||ch==117){
                        ch = (char)(ch-32);
                    }
                    nextLetter += ch;
                    continue;
                }
                nextLetter += str.charAt(i);
            }


            return nextLetter;
        }
    }

