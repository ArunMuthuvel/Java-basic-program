public class AddDigits
{
    void add()
             { 
              long num=888888888l;  
              long sum=0;
              while(num>0)
                     {
//                       if (n==0)
//                         {
//                        
//
//
//                          }









                       sum=sum+num%10;
                       num=num/10;
            
                     }
                       System.out.println("The sum of the Digits is ="+sum);
              while(sum>9)
                        {
                          sum=sum/10+sum%10;
                          System.out.println(sum);

                        }
}
public static void main(String[]args)
       {
        AddDigits obj=new AddDigits();
              obj.add();
       }
}
