public class swapin
{
public void swap(int a,int b,int c,int d)
{
int a=a+b+c+d;
    b=a-b-c-d;
    c=a-b-c-d;
    d=a-b-c-d;
 System.out.println("After Swaping");
 System.out.println("The value of a is="+a);
 System.out.println("The value of b is="+b);
 System.out.println("The value of c is="+c);
 System.out.println("The value of d is="+d);
 }
public static void main(String[]args)
{
    a=1;
    b=2;
    c=3;
    d=4;
System.out.println("Before Swaping");
 System.out.println("The value of a is="+a);
 System.out.println("The value of b is="+b);
 System.out.println("The value of c is="+c);
 System.out.println("The value of d is="+d);
 swap(a,b,c,d);
 }

}
