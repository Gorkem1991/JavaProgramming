package practice;

public class BiggestNumber {
    public static void main(String[] args) {

       int[] myarray = {3,5,2,8,9,4,2,3};
        int biggestnumber =0;
       for (int i=0; i<myarray.length; i++)
       {
           if(myarray[i]> biggestnumber)
           {
                   biggestnumber =myarray[i];

           }
       }
        System.out.println(biggestnumber);
    }
}
