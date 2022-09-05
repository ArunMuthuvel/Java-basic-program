public class Pattern2
{
     public static void main (String[]args)
                       {
                         int row=1;
                          while (row<=4)
                              {
                               int column =1;
                                 while (column<=4)
                                      {
                                       if (row==column)
                                        {
                                         System.out.print(1+  "   ");
                                        }
                                        else
                                         {
                                          System.out.print(0+ "   ");
                                         }
                                        column++;
                                      }
                                      System.out.println();
                                      row++;

                               }






                       }



}
