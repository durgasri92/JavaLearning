package Learn_Programs;

public class MultidmsnArray
{
    public static void main (String[] args)
    {
          int iarr[][] = new int[2][3];

         iarr[0][0]=1;
         iarr[0][1]=2;
         iarr[0][2]=3;
         iarr[1][0]=4;
         iarr[1][1]=5;
         iarr[1][2]=6;

          System.out.println(iarr[0][0]);
          System.out.println(iarr[0][1]);
          System.out.println(iarr[0][2]);
          System.out.println(iarr[1][0]);
          System.out.println(iarr[1][1]);
          System.out.println(iarr[1][2]);

         for(int i = 0 ; i<iarr.length; i = i+1)
         {
                 for(int j = 0; j< iarr[i].length; j=j+1){
                     System.out.print(iarr[i][j]);
                     System.out.print(" ,");
                 }

         }



    }


}
