public class Patternprogram2
{
public static void main (String[]args)
{
int row=1;
            while(row<=4)
                {
                int column=1;
                 while(column<=4)
                     {
                         if(row==4||row==1)
                          {
                            System.out.print(0);

                           }
                          else
                             {
                             System.out.print(1);

                             }
                            column++;

                      }

                      System.out.println();
                      row++;
                }
}
}
