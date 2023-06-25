package practice;

public class ArrayMadness {

    public static void main(String[] args)
    {
        int myarray[][] = {{2,63,6},
                            {4,5,9},
                            {3,89,7},
                            {3,0,10},
                            {3,4,55},
                            {3,8,99}};

      for (int i = 0; i<myarray.length; i++)
        {
            for(int j = 0; j<myarray[j].length; j++)
            {

                if(j != myarray[j].length-1)
                {
                System.out.print(myarray[i][j] + " ") ;
                }
                else
                {
                    System.out.println(myarray[i][j]) ;
                }
            }
        }
    }

}
