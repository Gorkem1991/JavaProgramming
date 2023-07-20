package practice;
import java.util.*;
public class newPractice {


        public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) {

            String poss1= list.get(pos1);
            String poss2 = list.get(pos2);

            String newPos =poss1;
            list.set(pos1, poss2);
            list.set(pos2, newPos);
            return list;

        }


        // Do not touch below


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            int pos1 = in.nextInt();
            int pos2 = in.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for(int i=0; i < size; i++) {
                list.add(in.next());
            }

            System.out.println(swap(list, pos1, pos2));

        }


}
