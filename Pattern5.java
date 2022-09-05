public class Pattern5
{
          public static void main (String[]args)
                            {
                             int row=1;
                                while (row<=4)
                                    {
                                     int column=1;
                                       while (column<=4)
                                            {
                                             if (row+column==5||row==column)
                                               {
                                                System.out.print(0+"   ");
                                               }
                                               else 
                                                 {
                                                  System.out.print(1+"   ");
                                                 }
                                                column++;

                                            }


                                     System.out.println();
                                     row++;
                                   }

                             } 

}
