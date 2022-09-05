class Facts
{
 public static void main (String[]args)
                                   {
                                     int num=23455;
                                     int count=0;
                                     int i=1;
                                         while (i<=num)
                                              {
                                                if (num%i==0)
                                                  {
                                                    System.out.println("The factor 23455 is="+i);
                                                    count++;
                                                  
                                                   }
                                                   i++;         
                                                }


                                               if(count==2)
                                                    {
                                                      System.out.println("It is a prime number");
                                                     }
                                                     else
                                                        {
                                                         System.out.println("It is not a prime number");
                                                        }
                                               
                                             
                                    }

}
