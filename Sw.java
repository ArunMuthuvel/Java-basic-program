public class Swaping
{
//      int a=7,b=10,c=2;
//      int temp;

public static void main(String[] args)
{
     int a=7,b=10,c=2;

    //Swaping swap =new Swaping();
    //swap.a;
    //swap.b;
    //swap.c;

    a = a+b+c;
    b= a-b-c;

    System.out.println("The value of b is="+b);
    c =a-b-c;
    System.out.println("The value of c is="+c);
    a =a-b-c;
    System.out.println("the value of a is="+a);
    
}
}
