public class Pattern3
{
         public static void main (String[]args)
                           {
                            int row=1;
                              while (row<=4)
                                   {
                                   int column=1;
                                      while (column<=4)
                                           {
                                             if (row==1||row==4||column==1||column==4)
                                               {
                                               System.out.print(0+  "   ");

                                                }
                                               else
                                                {
                                                System.out.print(1+  "   ");
                                                }
                                              column++;
                                            }


                                   System.out.println();
                                   row++;
                                   }





                            }








}
